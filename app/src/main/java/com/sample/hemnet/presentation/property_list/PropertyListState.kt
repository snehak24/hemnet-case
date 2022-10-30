package com.sample.hemnet.presentation.property_list

import com.sample.hemnet.domain.model.DisplayProperty


data class PropertyListState(
    val isLoading: Boolean = false,
    val properties: List<DisplayProperty> = emptyList(),
    val error: String = ""
)