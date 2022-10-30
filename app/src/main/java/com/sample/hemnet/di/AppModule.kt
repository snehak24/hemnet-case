package com.sample.hemnet.di

import com.sample.hemnet.data.remote.HemnetPropertyApi
import com.sample.hemnet.data.remote.HemnetPropertyApi.Companion.BASE_URL
import com.sample.hemnet.data.repository.PropertyRepositoryImpl
import com.sample.hemnet.domain.repository.PropertyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            )
            .build()
    }

    @Provides
    @Singleton
    fun providesHemnetPropertyApi(client: OkHttpClient): HemnetPropertyApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun providePropertyRepository(api: HemnetPropertyApi): PropertyRepository {
        return PropertyRepositoryImpl(api)
    }
}