package com.homebody.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable

private val primary = Color(0xFF70FC8D)
private val onPrimary = Color(0xFF292929)
private val secondary = Color(0xFF004B37)
private val onSecondary = Color(0xFFFDFDFD)
private val secondaryContainer = Color(0xFFEBF1EF)
private val onSecondaryContainer = Color(0xFF004B37)
private val error = Color(0xFFE42127)
private val errorContainer = Color(0xFFF7DDDE)
private val onError = Color(0xFFEBF1EF)
private val onErrorContainer = Color(0xFFE27C82)
private val background = Color(0xFFFDFDFD)
private val onBackground = Color(0xFF292929)
private val surface = Color(0xFFFFFFFF)
private val onSurface = Color(0xFF292929)
private val outline = Color(0xFF7A7A7A)
private val outlineVariant = Color(0xFFCCCCCC)
private val inverseOnSurface = Color(0xFFFFFFFF)
private val inverseSurface = Color(0xFF292929)
private val scrim = Color(0xD8292929)


val HomebodyLightColors = lightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = secondary,
    onSecondary = onSecondary,
    secondaryContainer = secondaryContainer,
    onSecondaryContainer = onSecondaryContainer,
    background = background,
    onBackground = onBackground,
    surface = surface,
    onSurface = onSurface,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim
)

val HomebodyDarkColors = lightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = secondary,
    onSecondary = onSecondary,
    secondaryContainer = secondaryContainer,
    onSecondaryContainer = onSecondaryContainer,
    background = background,
    onBackground = onBackground,
    surface = surface,
    onSurface = onSurface,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim
)

val ColorScheme.bottomSheetBackgroundColors: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) background else surface

val ColorScheme.expireWarningColor: Color
    @Composable
    get() = Color(0xFFFFD752)
