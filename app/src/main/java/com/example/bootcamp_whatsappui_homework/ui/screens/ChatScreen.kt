package com.example.bootcamp_whatsappui_homework.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bootcamp_whatsappui_homework.R
import com.example.bootcamp_whatsappui_homework.model.entity.Contact
import com.example.bootcamp_whatsappui_homework.model.repository.getFilterList
import com.example.bootcamp_whatsappui_homework.ui.components.FilterRow
import com.example.bootcamp_whatsappui_homework.ui.theme.Colors
import com.example.bootcamp_whatsappui_homework.ui.viewmodel.ChatScreenViewModel
import com.example.bootcamp_whatsappui_homework.ui.viewmodel.FilterViewModel

@Composable
fun ChatScreen(
    modifier: Modifier = Modifier,
    darkTheme: Boolean = isSystemInDarkTheme(),
    chatScreenviewModel: ChatScreenViewModel,
    filterViewModel: FilterViewModel = viewModel()
) {

    val contacts = chatScreenviewModel.contacts

    Column(modifier = Modifier.fillMaxSize()) {
        FilterRow(
            filters = filterViewModel.filters,
            selectedFilter = filterViewModel.selectedFilter,
            onFilterSelected = { filterViewModel.onFilterSelected(it) }
        )

        LazyColumn (
            modifier = modifier
                .fillMaxSize()
                .background(if (darkTheme) Colors.DarkBackground else Color.White)
                .padding(10.dp)
        ){
            items(contacts) { contact ->
                ContactItem(contact = contact)
            }
        }
    }
}

@Composable
fun ContactItem(
    contact: Contact,
    modifier: Modifier = Modifier,
    darkTheme: Boolean = isSystemInDarkTheme()
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
        ) {
            Image(
                painter = painterResource(id = contact.imageResId),
                contentDescription = "Contact image",
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterVertically),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(start = 10.dp),
                verticalArrangement = Arrangement.spacedBy((-7).dp)
            ) {
                Text(
                    text = contact.name,
                    fontFamily = FontFamily(Font(R.font.helvetica)),
                    fontWeight = FontWeight.Bold,
                    fontSize = 19.sp,
                    color = if(darkTheme) Colors.ContactColor else Color.Black
                )
                Text(
                    text = contact.message,
                    fontFamily = FontFamily(Font(R.font.helvetica)),
                    fontWeight = FontWeight.Normal,
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
            Text(
                text = contact.time,
                fontFamily = FontFamily(Font(R.font.helvetica)),
                fontWeight = FontWeight.Normal,
                color = Color.Gray,
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.End
            )
        }
    }
}
