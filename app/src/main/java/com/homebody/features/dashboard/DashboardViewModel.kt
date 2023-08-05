package com.homebody.features.dashboard

import com.homebody.core.ui.BaseViewModel
import com.homebody.core.ui.UiState
import com.homebody.features.dashboard.DashboardViewModel.DashboardUiState
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class DashboardViewModel() : BaseViewModel<DashboardUiState>(), DashboardUiEvents {

    override val uiState: StateFlow<DashboardUiState>
        get() = flowOf(
            DashboardUiState.Success(
                emptyList(),
                0
            )
        ).asState(DashboardUiState.LoadingFeatures)

    //    private val bottomNavigationItems: List<BottomBarItemData> = listOf(
//        BottomBarItemData.HomeItem(Home),
//        BottomBarItemData.InsuranceItem(AppRoute.SimpleRoute("insurance")),
//        BottomBarItemData.ProfileItem(AppRoute.SimpleRoute("profile"))
//    )
//
//    private var currentRoute: String = ""
//
//    private val selectedItemPosition: Flow<Int> =
//        appNavigator.routes
//            .map { route ->
//                currentRoute = route
//                bottomNavigationItems.indexOfFirst { it.appRoute.path == route }
//            }
//
//    override val uiState: StateFlow<DashboardUiState> =
//        selectedItemPosition.map {
//            Success(
//                items = bottomNavigationItems,
//                selectedItemPosition = it,
//            )
//        }
//            .asState(LoadingFeatures)
//
    sealed class DashboardUiState : UiState {
        class Success(
            val items: List<Any>,
            val selectedItemPosition: Int,
        ) : DashboardUiState()

        //
        data object LoadingFeatures : DashboardUiState()
//
    }
//
//    override fun onRouteClicked(route: AppRoute) {
//
//    }
}

interface DashboardUiEvents {
//    fun onRouteClicked(route: AppRoute)
}