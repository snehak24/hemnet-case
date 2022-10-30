package com.sample.hemnet.data

import com.sample.hemnet.data.remote.dto.Property
import com.sample.hemnet.domain.model.PropertyType
import com.sample.hemnet.domain.model.DisplayProperty

fun Property.toDisplayProperty(): DisplayProperty {
    return DisplayProperty(
        id = id,
        type = PropertyType.fromString(type),
        askingPrice = askingPrice,
        municipality = municipality,
        area = area,
        daysOnHemnet = daysOnHemnet,
        livingArea = livingArea,
        numberOfRooms = numberOfRooms,
        streetAddress = streetAddress,
        image = image,
        rating = rating,
        averagePrice = averagePrice
    )
}