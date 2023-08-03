package com.homebody.features.auth

import androidx.navigation.NavGraphBuilder
import com.homebody.navigation.composable
import com.homebody.navigation.navigation

fun NavGraphBuilder.authNavGraph() {
    navigation(
        startDestination = Login,
        route = Auth
    ) {
        composable(Login) { LoginScreen() }
    }
}