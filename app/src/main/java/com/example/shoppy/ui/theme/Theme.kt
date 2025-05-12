package com.example.shoppy.ui.theme

import com.example.shoppy.core.common.CustomColors
import com.example.shoppy.core.common.LocalCustomColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color


val LightCustomColors = CustomColors(
    primaryText = Color(0xFF212121),   // Dark gray for primary text (strong contrast)
    secondaryText = Color(0xFF757575), // Medium gray for secondary text
    thirdText = Color(0xFF000000), // Black
    primaryBackground = Color(0xFFFFFFFF),  // Clean white background
    SecondaryBackground = Color(0xFFEEEEEE), // Light gray for secondary background
    cardBackground = Color(0xFFFFFFFF), // White for cards
    highlight = Color(0xFF212121)       // Vibrant purple for highlights
)

val DarkCustomColors = CustomColors(
    primaryText = Color(0xFFFFFFFF),   // White
    secondaryText = Color(0xFF80C784), // Medium gray for secondary text
    thirdText = Color(0xFFFFFFFF), // White
    primaryBackground = Color(0xFF2C2C2C),  // Dark gray background
    SecondaryBackground = Color(0xFF424242), // Slightly lighter dark gray for secondary backgrounds
    cardBackground = Color(0xFF616161), // Muted gray for cards
    highlight = Color(0xFFB0B0B0)       // Soft green accent (calm and clean)
)

@Composable
fun ShoppyTheme(
    useDarkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = when {
        useDarkTheme -> DarkCustomColors
        else -> LightCustomColors
    }

    CompositionLocalProvider(LocalCustomColors provides colors) {
        content()
    }
}
