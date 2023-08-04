package com.homebody.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
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
