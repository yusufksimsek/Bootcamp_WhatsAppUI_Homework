package com.example.bootcamp_whatsappui_homework.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun TopbarIcon(painter: Painter,contentDescription:String,tint:Color) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            painter = painter,
            contentDescription = contentDescription,
            tint = tint
        )
    }
}