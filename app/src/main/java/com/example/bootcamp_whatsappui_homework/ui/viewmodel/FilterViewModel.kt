package com.example.bootcamp_whatsappui_homework.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.bootcamp_whatsappui_homework.model.repository.getFilterList

class FilterViewModel : ViewModel() {
    private val _filters = mutableStateOf(getFilterList())
    val filters = _filters.value

    private val _selectedFilter = mutableStateOf("All")
    val selectedFilter = _selectedFilter.value

    fun onFilterSelected(filter: String) {
        _selectedFilter.value = filter
    }
}