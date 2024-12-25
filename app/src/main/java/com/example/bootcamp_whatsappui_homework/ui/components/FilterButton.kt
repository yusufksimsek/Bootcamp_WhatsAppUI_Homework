package com.example.bootcamp_whatsappui_homework.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bootcamp_whatsappui_homework.R
import com.example.bootcamp_whatsappui_homework.ui.theme.Colors

@Composable
fun FilterButton(label: String, isSelected: Boolean, onClick: () -> Unit) {
    Text(
        text = label,
        modifier = Modifier
            .clickable { onClick() }
            .padding(8.dp)
            .background(
                if (isSelected) Colors.SelectedLightGrayBackground else Colors.LightGrayBackground,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(horizontal = 15.dp, vertical = 6.dp),
        fontSize = 16.sp,
        fontFamily = FontFamily(Font(R.font.helvetica)),
        textAlign = TextAlign.Center
    )
}

