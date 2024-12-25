package com.example.bootcamp_whatsappui_homework.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.bootcamp_whatsappui_homework.R

@Composable
fun FilterRow(
    filters: List<String>,
    selectedFilter: String,
    onFilterSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 5.dp),
        horizontalArrangement = Arrangement.spacedBy((-10).dp)
    ) {
        items(filters) { label ->
            FilterButton(
                label = label,
                isSelected = selectedFilter == label,
                onClick = { onFilterSelected(label) }
            )
        }
    }
}
