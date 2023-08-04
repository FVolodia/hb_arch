package com.homebody.navigation

sealed interface NavigationEvent {
    data object OpenDashboard : NavigationEvent
}

