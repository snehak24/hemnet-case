package com.sample.hemnet.data.remote

import com.sample.hemnet.data.remote.dto.PropertyDto
import retrofit2.http.GET

interface HemnetPropertyApi {

    @GET("/getProperties")
    suspend fun getProperties(): PropertyDto

    companion object {
        const val BASE_URL = "https://1a78e651-34f8-4799-93bc-3f7df796f344.mock.pstmn.io"
    }
}