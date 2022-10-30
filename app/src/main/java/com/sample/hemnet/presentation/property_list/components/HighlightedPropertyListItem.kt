package com.sample.hemnet.presentation.property_list.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.sample.hemnet.R
import com.sample.hemnet.common.LocalSpacing
import com.sample.hemnet.domain.model.DisplayProperty
import com.sample.hemnet.presentation.ui.theme.Yellow

@OptIn(ExperimentalCoilApi::class)
@Composable
fun HighlightedPropertyListItem(
    property: DisplayProperty,
    imageHeight: Dp,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
//                onItemClick()
            }
            .padding(spacing.spaceMedium)
    ) {

        Image(
            painter = rememberImagePainter(data = property.image, builder = {
                crossfade(true)
                error(R.drawable.ic_placeholder)
                fallback(R.drawable.ic_placeholder)
            }),
            contentDescription = null,
            modifier = Modifier
                .height(imageHeight)
                .fillMaxWidth()
                .clip(
                    shape = MaterialTheme.shapes.medium
                )
                .border(
                    border = BorderStroke(2.dp, Yellow),
                    shape = MaterialTheme.shapes.medium
                ),
            contentScale = ContentScale.Crop
        )
        Spacer(
            modifier = modifier.height(spacing.spaceExtraSmall)
        )
        property.streetAddress?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.h5,
                color = Color.Black,
            )
        }
        AddressInfo(
            area = property.area,
            municipality = property.municipality
        )
        PropertyInfo(
            askingPrice = property.askingPrice,
            livingArea = property.livingArea,
            numberOfRooms = property.numberOfRooms,
            daysOnHemnet = property.daysOnHemnet
        )
    }
}