package com.sample.hemnet.common

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Data class that can be accessed like context is accessed in composables.
 */
data class Dimensions(
    val default: Dp = 0.dp,
    val tinySpace: Dp = 2.dp,
    val spaceExtraSmall: Dp = 4.dp,
    val spaceSmall: Dp = 8.dp,
    val spaceMedium: Dp = 16.dp,
    val spaceLarge: Dp = 32.dp,
    val spaceExtraLarge: Dp = 64.dp
)

val LocalSpacing = compositionLocalOf { Dimensions() }