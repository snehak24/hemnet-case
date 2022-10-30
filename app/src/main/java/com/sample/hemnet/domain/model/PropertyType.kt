package com.sample.hemnet.domain.model

sealed class PropertyType(val name: String) {
    object Property : PropertyType("Property")
    object HighlightedProperty : PropertyType("HighlightedProperty")
    object Area : PropertyType("Area")

    companion object {
        fun fromString(name: String): PropertyType {
            return when (name) {
                "Property" -> Property
                "HighlightedProperty" -> HighlightedProperty
                "Area" -> Area
                else -> Property
            }
        }
    }
}
