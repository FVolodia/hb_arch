package com.homebody.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


//todo: add dark theme when it will be available in figma
//isSystemInDarkTheme()
@Composable
fun AppTheme(
    darkTheme: Boolean = false,
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> HomebodyDarkColors
        else -> HomebodyLightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = HomebodyTypography,
        shapes = Shapes,
        content = content
    )
}
