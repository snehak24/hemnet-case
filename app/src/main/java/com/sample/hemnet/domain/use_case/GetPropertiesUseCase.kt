package com.sample.hemnet.domain.use_case

import com.sample.hemnet.common.Resource
import com.sample.hemnet.data.toDisplayProperty
import com.sample.hemnet.domain.model.DisplayProperty
import com.sample.hemnet.domain.repository.PropertyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetPropertiesUseCase @Inject constructor(
    private val repository: PropertyRepository
) {
    operator fun invoke(): Flow<Resource<List<DisplayProperty>>> = flow {
        try {
            emit(Resource.Loading())
            val properties = repository.getProperty().items.map {
                it.toDisplayProperty()
            }
            emit(Resource.Success(properties))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured."))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}