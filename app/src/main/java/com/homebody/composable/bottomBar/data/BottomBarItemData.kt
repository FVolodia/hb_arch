package com.homebody.composable.bottomBar.data

import com.homebody.R
import com.homebody.navigation.AppRoute

sealed class BottomBarItemData(
    open val appRoute: AppRoute,
) {

    data class HomeItem(override val appRoute: AppRoute) : BottomBarItemData(appRoute)
    data class InsuranceItem(override val appRoute: AppRoute) : BottomBarItemData(appRoute)
    data class ProfileItem(override val appRoute: AppRoute) : BottomBarItemData(appRoute)

    val title: Int
        get() = when (this) {
            is HomeItem -> R.string.home
            is InsuranceItem -> R.string.insurance
            is ProfileItem -> R.string.profile
        }

    val icon: Int
        get() = when (this) {
            is HomeItem -> R.drawable.ic_bottom_bar_home
            is InsuranceItem -> R.drawable.ic_bottom_bar_insurance
            is ProfileItem -> R.drawable.ic_bottom_bar_profile
        }

}