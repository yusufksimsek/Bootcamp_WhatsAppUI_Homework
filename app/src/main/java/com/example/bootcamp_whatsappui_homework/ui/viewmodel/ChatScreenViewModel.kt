package com.example.bootcamp_whatsappui_homework.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.bootcamp_whatsappui_homework.model.entity.Contact
import com.example.bootcamp_whatsappui_homework.model.repository.GetContacts

class ChatScreenViewModel : ViewModel() {
    private val _contacts = mutableListOf<Contact>()
    val contacts: List<Contact> get() = _contacts

    init {
        loadContacts()
    }

    private fun loadContacts() {
        _contacts.clear()
        _contacts.addAll(GetContacts())
    }
}