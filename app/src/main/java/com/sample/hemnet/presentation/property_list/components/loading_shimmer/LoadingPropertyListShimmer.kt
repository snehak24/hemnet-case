package com.sample.hemnet.presentation.property_list.components.loading_shimmer

import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import com.sample.hemnet.common.LocalSpacing

const val ANIMATION_DURATION = 1300
const val ANIMATION_START_DELAY = 300
@Composable
fun LoadingPropertyListShimmer(
    imageHeight: Dp,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    BoxWithConstraints(
        modifier = modifier.fillMaxSize()
    ) {
        val cardWidthPx =
            with(LocalDensity.current) { (maxWidth - (spacing.spaceMedium * 2)).toPx() }
        val cardHeightPx = with(LocalDensity.current) { (imageHeight - spacing.spaceMedium).toPx() }
        val gradientWidth: Float = (0.2f * cardHeightPx)

        val infiniteTransition = rememberInfiniteTransition()
        val xCardShimmer = infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = (cardWidthPx + gradientWidth),
            animationSpec = infiniteRepeatable(
                animation = tween(
                    durationMillis = ANIMATION_DURATION,
                    easing = LinearEasing,
                    delayMillis = ANIMATION_START_DELAY
                ),
                repeatMode = RepeatMode.Restart
            )
        )
        val yCardShimmer = infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = (cardHeightPx + gradientWidth),
            animationSpec = infiniteRepeatable(
                animation = tween(
                    durationMillis = ANIMATION_DURATION,
                    easing = LinearEasing,
                    delayMillis = ANIMATION_START_DELAY
                ),
                repeatMode = RepeatMode.Restart
            )
        )

        val colors = listOf(
            Color.LightGray.copy(alpha = .9f),
            Color.LightGray.copy(alpha = .3f),
            Color.LightGray.copy(alpha = .9f),
        )

        LazyColumn {
            items(3) {
                ShimmerPropertyItem(
                    colors = colors,
                    xShimmer = xCardShimmer.value,
                    yShimmer = yCardShimmer.value,
                    cardHeight = imageHeight,
                    gradientWidth = gradientWidth,
                    padding = spacing.spaceMedium
                )
            }
        }
    }
}