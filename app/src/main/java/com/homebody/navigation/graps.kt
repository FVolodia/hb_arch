package com.homebody.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.homebody.features.auth.LoginScreen

enum class Graph(val route: String) {
    Root("root_graph"),
    Auth("auth_graph"),
    Dashboard("dashboard_graph"),
    Home("home_graph"),
    Insurance("insurance_graph"),
    Profile("profile_graph"),
}

enum class Destination(val route: String) {
    Onboarding("onboarding"),
    Login("login"),
    Signup("signup"),
    ForgotPassword("forgot_password"),
    Dashboard("dashboard"),
    Payments("payment"),
    InsuranceList("insurance_list"),
    InsuranceDetails("insurance_details"),
    PaymentHistory("payment_history"),
    ExpiredPolicies("expired_policies"),
    TransferPolicy("transfer_policy"),
    CancelPolicy("cancel_policy"),
    ProfileDetails("profile_details"),
    EditProfile("edit_profile"),
    AboutUs("about_us"),
    TextInfo("text_info"),
}

fun NavGraphBuilder.authNavGraph(navigationEvent: (NavigationEvent) -> Unit) {
    navigation(startDestination = Destination.Login.route, route = Graph.Auth.route) {
        composable(route = Destination.Onboarding.route) {
//            OnboardingScreen()
        }

        composable(route = Destination.Login.route) {
            LoginScreen(navigationEvent = navigationEvent)
        }
    }
}