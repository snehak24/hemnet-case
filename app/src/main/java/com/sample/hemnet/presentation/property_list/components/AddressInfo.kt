package com.sample.hemnet.presentation.property_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import com.sample.hemnet.R
import com.sample.hemnet.common.LocalSpacing

@Composable
fun AddressInfo(
    area: String,
    municipality: String?,
    modifier: Modifier = Modifier,
    addressTextColor: Color = MaterialTheme.colors.onBackground,
    addressTextStyle: TextStyle = MaterialTheme.typography.body2
) {
    val spacing = LocalSpacing.current
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_home),
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.padding(spacing.tinySpace)
        )
        Text(
            text = "$area, $municipality",
            style = addressTextStyle,
            color = addressTextColor
        )
    }
}