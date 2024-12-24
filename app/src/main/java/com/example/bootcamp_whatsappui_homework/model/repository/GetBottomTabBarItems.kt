package com.example.bootcamp_whatsappui_homework.model.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.bootcamp_whatsappui_homework.R
import com.example.bootcamp_whatsappui_homework.model.entity.BottomTabBarItems

@Composable
fun GetBottomTabBarItems(): List<BottomTabBarItems> {
    return listOf(
        BottomTabBarItems(
            title = "Chats",
            selectedIcon = painterResource(id = R.drawable.chat_selected),
            unselectedIcon = painterResource(id = R.drawable.chat_unselected)
        ),
        BottomTabBarItems(
            title = "Updates",
            selectedIcon = painterResource(id = R.drawable.status),
            unselectedIcon = painterResource(id = R.drawable.status)
        ),
        BottomTabBarItems(
            title = "Communities",
            selectedIcon = painterResource(id = R.drawable.groups_selected),
            unselectedIcon = painterResource(id = R.drawable.groups_unselected)
        ),
        BottomTabBarItems(
            title = "Calls",
            selectedIcon = painterResource(id = R.drawable.call_selected),
            unselectedIcon = painterResource(id = R.drawable.call_unselected)
        )
    )
}
