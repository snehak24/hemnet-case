package com.sample.hemnet.presentation.property_list

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.hemnet.common.Resource
import com.sample.hemnet.domain.use_case.GetPropertiesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class PropertyListViewModel @Inject constructor(
    private val getPropertiesUseCase: GetPropertiesUseCase
) : ViewModel() {

    var state by mutableStateOf(PropertyListState())
        private set

    init {
        getProperties()
    }

    private fun getProperties() {
        getPropertiesUseCase().onEach { result ->
            state = when (result) {
                is Resource.Success -> {
                    state.copy(
                        properties = result.data ?: emptyList(),
                        isLoading = false
                    )
                }
                is Resource.Error -> {
                    state.copy(
                        error = result.message ?: "An unexpected error occured",
                        isLoading = false
                    )
                }
                is Resource.Loading -> {
                    state.copy(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}