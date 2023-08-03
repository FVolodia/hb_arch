package com.homebody.features.auth

import com.homebody.navigation.FeatureNavigator

class AuthNavigator() : FeatureNavigator() {

    fun navigateToSignup() = navigateTo(Signup)
}