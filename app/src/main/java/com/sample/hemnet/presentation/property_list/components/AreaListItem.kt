package com.sample.hemnet.presentation.property_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.sample.hemnet.R
import com.sample.hemnet.common.LocalSpacing
import com.sample.hemnet.domain.model.DisplayProperty

@OptIn(ExperimentalCoilApi::class)
@Composable
fun AreaListItem(
    property: DisplayProperty,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                //onItemClick()
            }
            .padding(spacing.spaceMedium)
    ) {
        Text(
            text = stringResource(id = R.string.area),
            style = MaterialTheme.typography.h2,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(spacing.spaceSmall))
        Image(
            painter = rememberImagePainter(data = property.image, builder = {
                crossfade(true)
                error(R.drawable.ic_placeholder)
                fallback(R.drawable.ic_placeholder)
            }),
            contentDescription = null,
            modifier = Modifier
                .height(230.dp)
                .fillMaxWidth()
                .clip(
                    shape = MaterialTheme.shapes.medium
                ),
            contentScale = ContentScale.Crop
        )
        Spacer(
            modifier = modifier.height(spacing.spaceExtraSmall)
        )
        Text(
            text = property.area,
            style = MaterialTheme.typography.h4,
            color = Color.Black
        )
        property.rating?.let {
            Text(
                text = stringResource(id = R.string.property_rating, it),
                style = MaterialTheme.typography.body1,
                color = Color.Black
            )
        }
        property.averagePrice?.let {
            Text(
                text = stringResource(id = R.string.property_average_price, it),
                style = MaterialTheme.typography.body1,
                color = Color.Black
            )
        }
    }
}