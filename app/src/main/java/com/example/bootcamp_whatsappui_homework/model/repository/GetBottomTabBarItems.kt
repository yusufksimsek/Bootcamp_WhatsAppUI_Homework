package com.example.bootcamp_whatsappui_homework.model.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.bootcamp_whatsappui_homework.R
import com.example.bootcamp_whatsappui_homework.model.entity.BottomTabBarItems

@Composable
fun GetBottomTabBarItems(): List<BottomTabBarItems> {
    return listOf(
        BottomTabBarItems(
            title = stringResource(id = R.string.bottomBar_1),
            selectedIcon = painterResource(id = R.drawable.chat_selected),
            unselectedIcon = painterResource(id = R.drawable.chat_unselected)
        ),
        BottomTabBarItems(
            title = stringResource(id = R.string.bottomBar_2),
            selectedIcon = painterResource(id = R.drawable.status),
            unselectedIcon = painterResource(id = R.drawable.status)
        ),
        BottomTabBarItems(
            title = stringResource(id = R.string.bottomBar_3),
            selectedIcon = painterResource(id = R.drawable.groups_selected),
            unselectedIcon = painterResource(id = R.drawable.groups_unselected)
        ),
        BottomTabBarItems(
            title = stringResource(id = R.string.bottomBar_4),
            selectedIcon = painterResource(id = R.drawable.call_selected),
            unselectedIcon = painterResource(id = R.drawable.call_unselected)
        )
    )
}
