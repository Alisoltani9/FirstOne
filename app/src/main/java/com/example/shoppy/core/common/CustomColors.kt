package com.example.shoppy.core.common

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class CustomColors(
    val primaryText: Color,
    val secondaryText: Color,
    val thirdText: Color,
    val primaryBackground: Color,
    val SecondaryBackground: Color,
    val cardBackground: Color,
    val highlight: Color
)

val LocalCustomColors = staticCompositionLocalOf {
    CustomColors(
        primaryText = Color.Companion.Unspecified,
        secondaryText = Color.Companion.Unspecified,
        thirdText = Color.Companion.Unspecified,
        primaryBackground = Color.Companion.Unspecified,
        SecondaryBackground = Color.Companion.Unspecified,
        cardBackground = Color.Companion.Unspecified,
        highlight = Color.Companion.Unspecified
    )
}