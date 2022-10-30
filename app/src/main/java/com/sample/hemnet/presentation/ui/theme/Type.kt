package com.sample.hemnet.presentation.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sample.hemnet.R

val sansFontFamily = FontFamily(
    Font(R.font.opensans_light, FontWeight.Light),
    Font(R.font.opensans_medium, FontWeight.Medium),
    Font(R.font.opensans_regular, FontWeight.Normal),
    Font(R.font.opensans_bold, FontWeight.Bold),
    Font(R.font.opensans_semibold, FontWeight.SemiBold),
    Font(R.font.opensans_extrabold, FontWeight.ExtraBold)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    ),
    button = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
    ),
    h1 = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 26.sp
    ),
    h3 = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    h4 = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    h5 = TextStyle(
        fontFamily = sansFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    )
)