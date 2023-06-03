package com.coderzf1.testtheming.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

data class CustomComposeTheme(
    val primaryColor: Color = Color(0xFF6650a4),
    val secondaryColor:Color = Color(0xFF625b71),
    val tertiaryColor:Color = Color(0xFF7D5260),
    val backgroundColor:Color = Color(0xFFFFFBFE),
    val surfaceColor:Color = Color(0xFFFFFBFE),
    val onPrimaryColor:Color = Color.White,
    val onSecondaryColor:Color = Color.White,
    val onTertiaryColor:Color = Color.White,
    val onBackgroundColor:Color = Color(0xFF1C1B1F),
    val onSurfaceColor:Color = Color(0xFF1C1B1F),
    val statusBarColor:Color = primaryColor,
    val navigationBarColor:Color = Color.Black
){
    fun asColorScheme(): ColorScheme {
        return lightColorScheme(
            primary = primaryColor,
            secondary = secondaryColor,
            tertiary = tertiaryColor,
            background = backgroundColor,
            surface = surfaceColor,
            onPrimary = onPrimaryColor,
            onSecondary = onSecondaryColor,
            onTertiary = onTertiaryColor,
            onBackground = onBackgroundColor,
            onSurface = onSurfaceColor
        )
    }
}