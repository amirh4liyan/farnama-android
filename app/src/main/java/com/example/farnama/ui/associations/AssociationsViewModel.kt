package com.example.farnama.ui.associations

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.farnama.data.repository.AssociationRepository
import com.example.farnama.model.Association
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class AssociationsUiState(
    val isLoading: Boolean = true,
    val associations: List<Association> = emptyList()
)

class AssociationsViewModel(
    private val repository: AssociationRepository = AssociationRepository()
) : ViewModel() {

    private val _state = MutableStateFlow(AssociationsUiState())
    val state: StateFlow<AssociationsUiState> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val list = repository.getAssociations()
            _state.value = AssociationsUiState(isLoading = false, associations = list)
        }
    }
}