package com.example.bootcamp_whatsappui_homework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.bootcamp_whatsappui_homework.ui.screens.MainScreen
import com.example.bootcamp_whatsappui_homework.ui.theme.Bootcamp_WhatsAppUI_HomeworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bootcamp_WhatsAppUI_HomeworkTheme {
                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Bootcamp_WhatsAppUI_HomeworkTheme {
        MainScreen()
    }
}