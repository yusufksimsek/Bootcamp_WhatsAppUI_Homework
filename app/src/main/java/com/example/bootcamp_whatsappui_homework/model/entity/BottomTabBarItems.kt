package com.example.bootcamp_whatsappui_homework.model.entity

import androidx.compose.ui.graphics.painter.Painter

data class BottomTabBarItems(
    val title: String,
    val selectedIcon: Painter,
    val unselectedIcon: Painter
)
