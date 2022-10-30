package com.sample.hemnet.presentation.property_list.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import com.sample.hemnet.R
import com.sample.hemnet.common.LocalSpacing

@Composable
fun PropertyInfo(
    askingPrice: String?,
    livingArea: Int?,
    numberOfRooms: Int?,
    daysOnHemnet: Int?,
    modifier: Modifier = Modifier,
    infoTextStyle: TextStyle = MaterialTheme.typography.body2,
    infoTextColor: Color = MaterialTheme.colors.onPrimary
) {

    val spacing = LocalSpacing.current

    Row(modifier = modifier.fillMaxWidth()) {
        askingPrice?.let {
            Text(
                text = it,
                style = infoTextStyle,
                color = infoTextColor
            )
        }
        Spacer(modifier = modifier.width(spacing.spaceMedium))
        livingArea?.let {
            Text(
                text = stringResource(id = R.string.living_area_info, it),
                style = infoTextStyle,
                color = infoTextColor
            )
        }
        Spacer(modifier = modifier.width(spacing.spaceMedium))
        numberOfRooms?.let {
            Text(
                text = stringResource(id = R.string.property_room_info, it),
                style = infoTextStyle,
                color = infoTextColor
            )
        }
        Spacer(modifier = modifier.width(spacing.spaceMedium))
        daysOnHemnet?.let {
            Text(
                text = stringResource(id = R.string.property_on_hemnet_info, it),
                style = infoTextStyle,
                color = infoTextColor,
            )
        }
    }
}