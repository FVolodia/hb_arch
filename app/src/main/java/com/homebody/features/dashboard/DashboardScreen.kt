package com.homebody.features.dashboard

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.homebody.composable.loader.LoadingView
import com.homebody.composable.bottomBar.BottomBar
import com.homebody.composable.topBar.TopBar
import com.homebody.core.ui.BaseScreen
import com.homebody.features.dashboard.DashboardViewModel.DashboardUiState
import com.homebody.navigation.AppNavigator
import com.homebody.navigation.AppRoute
import org.koin.androidx.compose.koinViewModel

@Composable
fun DashboardScreen(
    startRoute: AppRoute,
    builder: NavGraphBuilder.() -> Unit,
    appNavigator: AppNavigator,
    viewModel: DashboardViewModel = koinViewModel(),
) = BaseScreen(viewModel) { state ->
    when (val uiState = state.value) {
        is DashboardUiState.Success -> DashboardView(
            uiState,
            viewModel,
            appNavigator,
            startRoute,
            builder
        )

        is DashboardUiState.LoadingFeatures -> LoadingView()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DashboardView(
    state: DashboardUiState.Success,
    events: DashboardUiEvents,
    appNavigator: AppNavigator,
    startRoute: AppRoute,
    builder: NavGraphBuilder.() -> Unit,
) {
    val navController = rememberNavController()
    DisposableEffect(navController) {
        appNavigator.onAttach(navController)
        onDispose { appNavigator.onDetach(navController) }
    }
    val scrollBehavior = enterAlwaysScrollBehavior(rememberTopAppBarState())
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
             TopBar(onMenuClick = { /*TODO open drawer*/ })
        },
        bottomBar = {
            BottomBar(items = state.items)
        }) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = startRoute.path,
            modifier = Modifier.padding(
                PaddingValues(
                    top = innerPadding.calculateTopPadding(),
                    bottom = innerPadding.calculateBottomPadding()
                )
            ),
        ) {
            builder()
        }
    }
}