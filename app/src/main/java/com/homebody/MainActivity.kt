package com.homebody

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.homebody.features.auth.LoginScreen
import com.homebody.features.auth.authNavGraph
import com.homebody.features.feature1.Feauture1
import com.homebody.features.feature1.feature1Graph
import com.homebody.navigation.AppNavigator
import com.homebody.navigation.AppRoute
import com.homebody.ui.theme.AppTheme
import org.koin.android.ext.android.get

class MainActivity : ComponentActivity() {

    private val navGraphBuilder: NavGraphBuilder.() -> Unit = {
        authNavGraph()
        feature1Graph()
    }

    private val startRoute: AppRoute = Feauture1

    private val appNavigator: AppNavigator = get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            val systemUiController = rememberSystemUiController()
            SideEffect {
                systemUiController.setSystemBarsColor(
                    color = Color.Transparent,
                    darkIcons = true
                )
            }
            AppTheme {
                LoginScreen()
            }
        }
    }
}
