package com.example.bootcamp_whatsappui_homework.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bootcamp_whatsappui_homework.ui.theme.Colors

@Composable
fun FilterButton(label: String) {
    Text(
        text = label,
        modifier = Modifier
            .clickable {  }
            .padding(8.dp)
            .background(Colors.LightGrayBackground, shape = RoundedCornerShape(20.dp))
            .padding(horizontal = 15.dp, vertical = 6.dp),
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )
}

