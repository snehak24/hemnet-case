package com.sample.hemnet.domain.repository

import com.sample.hemnet.data.remote.dto.PropertyDto

interface PropertyRepository {
    suspend fun getProperty(): PropertyDto
}