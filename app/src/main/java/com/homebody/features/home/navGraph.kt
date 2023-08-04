package com.homebody.features.home

import androidx.navigation.NavGraphBuilder
import com.homebody.features.home.payment.PaymentsScreen
import com.homebody.navigation.composable
import com.homebody.navigation.navigation

fun NavGraphBuilder.homeGraph() {
    navigation(
        startDestination = Payments,
        route = Home
    ) {
        composable(Payments) { PaymentsScreen() }
    }
}