package com.homebody.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.homebody.composable.expiredCard.ExpiredCardPreview
import com.homebody.composable.payment.PaymentCardPreview
import com.homebody.features.home.payment.PaymentsScreen

@Composable
fun DashboardNavigation(
    navController: NavHostController,
//    navigationListener: (NavigationEvent) -> Unit,
//    destinationListener: (Destination) -> Unit,
    modifier: Modifier
){

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    NavHost(
        modifier = modifier,
        navController = navController,
        route = Graph.Dashboard.route,
        startDestination = Destination.Payments.route
    ) {
        composable(route = Destination.Payments.route) {
            PaymentsScreen()
        }
        composable(route = Destination.InsuranceList.route) {
            PaymentCardPreview()
        }
        composable(route = Destination.ProfileDetails.route) {
            ExpiredCardPreview()
        }
    }

}