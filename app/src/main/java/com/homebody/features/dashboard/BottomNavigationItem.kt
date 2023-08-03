package com.homebody.features.dashboard

import com.homebody.navigation.AppRoute

interface BottomNavigationItem {
    val route: AppRoute
    val imageRes: Int
    val titleRes: Int
}