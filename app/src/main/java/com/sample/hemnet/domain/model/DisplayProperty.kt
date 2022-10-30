package com.sample.hemnet.domain.model

data class DisplayProperty(
    val id: String,
    val type: PropertyType,
    val askingPrice: String?,
    val municipality: String?,
    val area: String,
    val daysOnHemnet: Int?,
    val livingArea: Int?,
    val numberOfRooms: Int?,
    val streetAddress: String?,
    val image: String,
    val rating: String?,
    val averagePrice: String?,
)
