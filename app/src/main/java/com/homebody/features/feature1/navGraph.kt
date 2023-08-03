package com.homebody.features.feature1

import androidx.navigation.NavGraphBuilder
import com.homebody.navigation.composable
import com.homebody.navigation.navigation

fun NavGraphBuilder.feature1Graph() {
    navigation(
        startDestination = Feauture11,
        route = Feauture1
    ) {
        composable(Feauture11) { Feature1Screen() }
    }
}