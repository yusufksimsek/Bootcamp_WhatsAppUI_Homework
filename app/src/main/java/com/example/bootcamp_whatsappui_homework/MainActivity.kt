package com.example.bootcamp_whatsappui_homework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.bootcamp_whatsappui_homework.ui.screens.MainScreen
import com.example.bootcamp_whatsappui_homework.ui.theme.Bootcamp_WhatsAppUI_HomeworkTheme
import com.example.bootcamp_whatsappui_homework.ui.viewmodel.ChatScreenViewModel

class MainActivity : ComponentActivity() {
    private val chatScreenViewModel: ChatScreenViewModel by viewModels() // ViewModel'i bağladık
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bootcamp_WhatsAppUI_HomeworkTheme {
                MainScreen(chatScreenViewModel = chatScreenViewModel)
            }
        }
    }
}
