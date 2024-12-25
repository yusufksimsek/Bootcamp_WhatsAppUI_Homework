package com.example.bootcamp_whatsappui_homework.model.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.bootcamp_whatsappui_homework.R

@Composable
fun getFilterList(): List<String> {
    return listOf(
        stringResource(R.string.lazyRow_1),
        stringResource(R.string.lazyRow_2),
        stringResource(R.string.lazyRow_3),
        stringResource(R.string.lazyRow_4),
        stringResource(R.string.lazyRow_5),
    )
}