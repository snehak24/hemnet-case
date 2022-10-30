package com.sample.hemnet.data.remote.dto

data class Property(
    val type: String,
    val id: String,
    val askingPrice: String?,
    val monthlyFee: String?,
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
