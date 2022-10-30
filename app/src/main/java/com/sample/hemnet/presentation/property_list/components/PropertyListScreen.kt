package com.sample.hemnet.presentation.property_list.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sample.hemnet.domain.model.PropertyType
import com.sample.hemnet.presentation.property_list.PropertyListViewModel
import com.sample.hemnet.presentation.property_list.components.loading_shimmer.LoadingRecipeListShimmer

const val IMAGE_HEIGHT = 200

@Composable
fun PropertyListScreen(
    viewModel: PropertyListViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    val state = viewModel.state

    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(state.properties) { property ->
                when (property.type) {
                    PropertyType.HighlightedProperty -> HighlightedPropertyListItem(
                        property = property,
                        imageHeight = IMAGE_HEIGHT.dp
                    )
                    PropertyType.Property -> PropertyListItem(
                        property = property,
                        imageHeight = IMAGE_HEIGHT.dp
                    )
                    PropertyType.Area -> AreaListItem(property)
                }
            }
        }
        if (state.error.isNotBlank()) {
            Text(
                text = state.error,
                color = Color.Red,
                style = MaterialTheme.typography.h5,
                modifier = Modifier.align(Alignment.Center),
                textAlign = TextAlign.Center
            )
        }
        if (state.isLoading) {
            LoadingRecipeListShimmer(imageHeight = IMAGE_HEIGHT.dp)
        }
    }
}