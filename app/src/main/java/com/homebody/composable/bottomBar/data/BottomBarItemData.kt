package com.homebody.composable.bottomBar.data

import com.homebody.R

sealed class BottomBarItemData(
    open val route: String,
) {

    data class HomeItem(override val route: String) : BottomBarItemData(route)
    data class InsuranceItem(override val route: String) : BottomBarItemData(route)
    data class ProfileItem(override val route: String) : BottomBarItemData(route)

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