package com.homebody.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.homebody.features.auth.Auth
import com.homebody.features.auth.AuthNavigator
import com.homebody.features.feature1.Feature1Navigator
import com.homebody.features.feature1.Feauture1
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filterNot
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.core.annotation.Single

@Single
class AppNavigator(
    private val authNavigator: AuthNavigator,
    private val feature1Navigator: Feature1Navigator
) {

    private var navController: NavController? = null

    private val currentRoute: MutableStateFlow<String> = MutableStateFlow("")

    val routes: Flow<String> = currentRoute

    init {
        observeRoutes()
    }

    fun onAttach(navController: NavController) {
        // If we were attached to another nav controller, make sure we detach from it
        if (this.navController != null && navController != this.navController)
            onDetach(navController)

        navController.addOnDestinationChangedListener(onDestinationChangedListener)
        this.navController = navController
    }

    fun onDetach(navController: NavController) {
        // Make sure we're only detaching from the intended nav controller
        if (this.navController == navController) {
            navController.removeOnDestinationChangedListener(onDestinationChangedListener)
            this.navController = null
        } else {
        }
    }


    private fun getFeatureNavigatorForRoute(route: String): FeatureNavigator {
        return when (route) {
            Auth.path -> authNavigator
            Feauture1.path -> feature1Navigator
            else -> throw IllegalStateException("Current route '$route' is not associated with a FeatureNavigator")
        }
    }

    private fun navigateTo(action: NavigationAction) {
        if (action.route.path == currentRoute.value) return
        if (action is BackAction) navController?.popBackStack()
        else navController?.navigate(
            route = action.route.path,
            navOptions = action.options?.let { options ->
                if (options.popUpToRoute == BackRoute.path) {
                    val startDestinationId = navController!!.graph.findStartDestination().id
                    options.copy(popUpToRoute = startDestinationId.toString()).toOptions()
                } else options.toOptions()
            })
    }

    private fun observeRoutes() {
        currentRoute
            .filterNot { it.isEmpty() }
            .flatMapLatest { route ->
                // Whenever the nav graph changes, attach to the corresponding navigator
                val navigator = getFeatureNavigatorForRoute(route)
                navigator.observeRoutes()
            }
            .onEach { navigateTo(it) }
            .launchIn(MainScope())
    }

    private val onDestinationChangedListener =
        NavController.OnDestinationChangedListener { _, destination, _ ->
            // If the current nav graph changed, notify listeners
            if (destination.parent?.route != currentRoute.value) {
                currentRoute.tryEmit(destination.parent!!.route!!)
            }
        }
}