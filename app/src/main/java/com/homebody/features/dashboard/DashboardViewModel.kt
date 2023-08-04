package com.homebody.features.dashboard

import com.homebody.composable.bottomBar.data.BottomBarItemData
import com.homebody.core.ui.BaseViewModel
import com.homebody.core.ui.UiState
import com.homebody.features.dashboard.DashboardViewModel.DashboardUiState
import com.homebody.features.dashboard.DashboardViewModel.DashboardUiState.LoadingFeatures
import com.homebody.features.dashboard.DashboardViewModel.DashboardUiState.Success
import com.homebody.features.home.Home
import com.homebody.navigation.AppNavigator
import com.homebody.navigation.AppRoute
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map

class DashboardViewModel(appNavigator: AppNavigator) :
    BaseViewModel<DashboardUiState>(), DashboardUiEvents {

    private val bottomNavigationItems: List<BottomBarItemData> = listOf(
        BottomBarItemData.HomeItem(Home),
        BottomBarItemData.InsuranceItem(AppRoute.SimpleRoute("insurance")),
        BottomBarItemData.ProfileItem(AppRoute.SimpleRoute("profile"))
    )

    private var currentRoute: String = ""

    private val selectedItemPosition: Flow<Int> =
        appNavigator.routes
            .map { route ->
                currentRoute = route
                bottomNavigationItems.indexOfFirst { it.appRoute.path == route }
            }

    override val uiState: StateFlow<DashboardUiState> =
        selectedItemPosition.map {
            Success(
                items = bottomNavigationItems,
                selectedItemPosition = it,
            )
        }
            .asState(LoadingFeatures)

    sealed class DashboardUiState : UiState {
        class Success(
            val items: List<BottomBarItemData>,
            val selectedItemPosition: Int,
        ) : DashboardUiState()

        object LoadingFeatures : DashboardUiState()

    }

    override fun onRouteClicked(route: AppRoute) {

    }
}

interface DashboardUiEvents {
    fun onRouteClicked(route: AppRoute)
}