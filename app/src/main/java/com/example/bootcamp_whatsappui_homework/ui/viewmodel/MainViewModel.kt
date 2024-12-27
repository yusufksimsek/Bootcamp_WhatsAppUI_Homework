package com.example.bootcamp_whatsappui_homework.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.bootcamp_whatsappui_homework.model.entity.Contact
import com.example.bootcamp_whatsappui_homework.model.repository.GetContacts
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _contacts = MutableStateFlow<List<Contact>>(emptyList())
    val contacts: StateFlow<List<Contact>> = _contacts

    init {
        loadContacts()
    }

    private fun loadContacts() {
        _contacts.value = GetContacts()
    }
}