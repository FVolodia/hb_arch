package com.homebody

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavGraphBuilder
import com.homebody.features.auth.authNavGraph
import com.homebody.features.dashboard.DashboardScreen
import com.homebody.features.feature1.feature1Graph
import com.homebody.features.home.Home
import com.homebody.features.home.homeGraph
import com.homebody.navigation.AppNavigator
import com.homebody.navigation.AppRoute
import com.homebody.ui.theme.AppTheme
import org.koin.android.ext.android.get

class MainActivity : ComponentActivity() {

    private val navGraphBuilder: NavGraphBuilder.() -> Unit = {
        authNavGraph()
        feature1Graph()
        homeGraph()
    }

    private val startRoute: AppRoute = Home

    private val appNavigator: AppNavigator = get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                DashboardScreen(startRoute, navGraphBuilder, appNavigator)
            }
        }
    }
}
