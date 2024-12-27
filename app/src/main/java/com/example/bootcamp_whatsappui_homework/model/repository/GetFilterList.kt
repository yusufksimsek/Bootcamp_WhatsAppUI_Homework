package com.example.bootcamp_whatsappui_homework.model.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.bootcamp_whatsappui_homework.R

fun getFilterList(): List<Int> {
    return listOf(
        R.string.lazyRow_1,
        R.string.lazyRow_2,
        R.string.lazyRow_3,
        R.string.lazyRow_4,
        R.string.lazyRow_5,
    )
}