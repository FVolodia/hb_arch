package com.homebody.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun DashboardNavigation(modifier: Modifier){
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        route = Graph.Dashboard.rout,
        startDestination = Graph.Home.rout
    ) {
        homeNavGraph()
    }
}