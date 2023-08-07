package com.homebody.features.dashboard

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.compose.rememberNavController
import com.homebody.composable.bottomBar.BottomBar
import com.homebody.composable.bottomBar.data.BottomBarItemData
import com.homebody.composable.loader.LoadingView
import com.homebody.composable.topBar.TopBar
import com.homebody.core.ui.BaseScreen
import com.homebody.features.dashboard.DashboardViewModel.DashboardUiState
import com.homebody.navigation.DashboardNavigation
import com.homebody.navigation.Destination
import org.koin.androidx.compose.koinViewModel

@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = koinViewModel(),
) = BaseScreen(viewModel) { state ->
    when (val uiState = state.value) {
        is DashboardUiState.Success -> DashboardView(
            uiState,
            viewModel,
        )

        is DashboardUiState.LoadingFeatures -> LoadingView()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DashboardView(
    state: DashboardUiState.Success,
    events: DashboardUiEvents,
) {
    val scrollBehavior = enterAlwaysScrollBehavior(rememberTopAppBarState())
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopBar(onMenuClick = { /*TODO open drawer*/ })
        },
        bottomBar = {
            BottomBar(
                navController = navController,
                items = listOf(
                    BottomBarItemData.HomeItem(Destination.Payments.route),
                    BottomBarItemData.InsuranceItem(Destination.InsuranceList.route),
                    BottomBarItemData.ProfileItem(Destination.ProfileDetails.route)
                )
            )
        }) { innerPadding ->
        DashboardNavigation(
            navController = navController,
            modifier = Modifier.padding(
                PaddingValues(
                    top = innerPadding.calculateTopPadding(),
                    bottom = innerPadding.calculateBottomPadding()
                )
            )
        )
    }
}