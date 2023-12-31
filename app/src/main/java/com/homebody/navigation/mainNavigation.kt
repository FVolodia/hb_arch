package com.homebody.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.homebody.features.dashboard.DashboardScreen

@Composable
fun MainNavigation(modifier: Modifier) {
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        route = Graph.Root.rout,
        startDestination = Graph.Auth.rout
    ) {
        authNavGraph { navigationEvent ->
            when (navigationEvent) {
                NavigationEvent.OpenDashboard -> navController.navigate(Screen.Dashboard.route)
            }
        }
        composable(route = Screen.Dashboard.route) {
            DashboardScreen()
        }
    }
}


