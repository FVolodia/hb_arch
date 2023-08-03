package com.homebody.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable

val PrimaryColor = Color(0xFF004B37)
val SecondaryColor = Color(0xFF70FC8D)
val OnPrimary = Color(0xFFFDFDFD)
val PrimaryContainerLight = Color(0xFFEBF1EF)
val PrimaryContainerDark = Color(0xFF1E1E1E)
val OnPrimaryContainerLight = Color(0xFF007E5C)
val OnPrimaryContainerDark = Color(0xFF019D74)
val OnSecondaryColor = Color(0xFF292929)
val BackgroundLight = Color(0xFFD9D9D9)
val BackgroundDark = Color(0xFF292929)
val OnBackgroundLight = Color(0xFF292929)
val OnBackgroundDark = Color(0xFFF1F1F1)
val SurfaceLight = Color(0xFFFFFFFF)
val SurfaceDark = Color(0xFF1E1E1E)
val ErrorContainerLight = Color(0xFFF7DDDE)
val onErrorLight = Color(0xFFE27C82)
val onErrorDark = Color(0xFFE27C82)


val ColorScheme.bottomSheetBackgroundColors: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) OnPrimary else PrimaryContainerDark

val ColorScheme.expireWarningColor: Color
    @Composable
    get() = Color(0xFFFFD752)