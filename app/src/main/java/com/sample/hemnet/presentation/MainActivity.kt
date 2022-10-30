package com.sample.hemnet.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.sample.hemnet.R
import com.sample.hemnet.presentation.property_list.components.PropertyListScreen
import com.sample.hemnet.presentation.ui.theme.HemnetTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HemnetTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = MaterialTheme.colors.background)
                ) {
                    TopAppBar(
                        title = {
                            Text(
                                text = stringResource(id = R.string.search_place),
                                style = MaterialTheme.typography.h4,
                                color = Color.White
                            )
                        },
                        backgroundColor = MaterialTheme.colors.primary
                    )
                    PropertyListScreen()
                }
            }
        }
    }
}