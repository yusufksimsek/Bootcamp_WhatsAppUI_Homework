package com.example.bootcamp_whatsappui_homework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.bootcamp_whatsappui_homework.ui.screens.MainScreen
import com.example.bootcamp_whatsappui_homework.ui.theme.Bootcamp_WhatsAppUI_HomeworkTheme
import com.example.bootcamp_whatsappui_homework.ui.viewmodel.ChatScreenViewModel
import com.example.bootcamp_whatsappui_homework.ui.viewmodel.FilterViewModel

class MainActivity : ComponentActivity() {
    private val chatScreenViewModel: ChatScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bootcamp_WhatsAppUI_HomeworkTheme {
                MainScreen(chatScreenViewModel = chatScreenViewModel)
            }
        }
    }
}
