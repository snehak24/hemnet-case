package com.sample.hemnet.data.repository

import com.sample.hemnet.data.remote.HemnetPropertyApi
import com.sample.hemnet.data.remote.dto.PropertyDto
import com.sample.hemnet.domain.repository.PropertyRepository
import javax.inject.Inject


class PropertyRepositoryImpl @Inject constructor(
    private val api: HemnetPropertyApi
): PropertyRepository {
    override suspend fun getProperty(): PropertyDto {
        return api.getProperties()
    }
}