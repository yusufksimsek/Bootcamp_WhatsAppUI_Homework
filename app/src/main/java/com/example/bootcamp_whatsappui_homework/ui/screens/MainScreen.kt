package com.example.bootcamp_whatsappui_homework.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bootcamp_whatsappui_homework.R
import com.example.bootcamp_whatsappui_homework.model.repository.GetBottomTabBarItems
import com.example.bootcamp_whatsappui_homework.ui.components.FilterButton
import com.example.bootcamp_whatsappui_homework.ui.components.TopbarIcon
import com.example.bootcamp_whatsappui_homework.ui.components.TopbarTitle
import com.example.bootcamp_whatsappui_homework.ui.theme.Colors
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier, darkTheme: Boolean = isSystemInDarkTheme()) {
    val systemUiController = rememberSystemUiController()

    LaunchedEffect(Unit) {
        systemUiController.setSystemBarsColor(color = if (darkTheme) Color.Black else Color.White)
    }
    val bottomTabBarItems = GetBottomTabBarItems()

    var selectedTabIndex by rememberSaveable {
        mutableIntStateOf(0)
    }

    val pagerState = rememberPagerState {
        bottomTabBarItems.size
    }

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }
            .collect { page ->
                selectedTabIndex = page
            }
    }

    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    TopbarTitle(
                        stringResource(id = R.string.app_name),
                        FontFamily(Font(R.font.helvetica)),
                        FontWeight.Bold,
                        25.sp,
                        colorResource(id = R.color.green)
                    )
                },
                actions = {
                    TopbarIcon(painterResource(R.drawable.photo_camera), "Camera",
                        if(darkTheme) Colors.DarkIconColor else Color.Black)
                    TopbarIcon(painterResource(R.drawable.search), "Search",
                        if(darkTheme) Colors.DarkIconColor else Color.Black)
                    TopbarIcon(painterResource(R.drawable.more_vert), "Menu",
                        if(darkTheme) Colors.DarkIconColor else Color.Black)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = if(darkTheme) Colors.DarkBackground else Color.White,
                    titleContentColor = if(darkTheme) Colors.DarkBackground else Color.Black
                )
            )

        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                contentColor = Color.Black,
                containerColor = colorResource(id = R.color.green)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.chat_plus),
                    contentDescription = "Add Chat",
                    tint = if(darkTheme) Colors.DarkIconColor else Color.White,
                )
            }
        },
        bottomBar = {
            NavigationBar(
                containerColor = if(darkTheme) Colors.DarkBackground else Color.White,
                contentColor = if(darkTheme) Colors.DarkGreen else Colors.LightGreen,
            ) {
                bottomTabBarItems.forEachIndexed { index, bottomTabBarItem ->
                    NavigationBarItem(
                        selected = selectedTabIndex == index,
                        onClick = {
                            selectedTabIndex = index
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        },
                        icon = {
                            BadgedBox(
                                badge = {

                                }
                            ) {
                                Icon(
                                    painter = if (selectedTabIndex == index) {
                                        bottomTabBarItem.selectedIcon
                                    } else {
                                        bottomTabBarItem.unselectedIcon
                                    },
                                    contentDescription = "Icons"
                                )
                            }
                        },
                        label = {
                            Text(
                                text = bottomTabBarItem.title,
                                fontFamily = FontFamily(Font(R.font.helvetica)),
                                fontWeight = FontWeight.Normal,
                                color = if(darkTheme) Color.White else Color.Black
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = if(darkTheme) Colors.DarkIconColor else Colors.Green,
                            selectedTextColor = if(darkTheme) Colors.DarkIconColor else Color.Black,
                            indicatorColor = if(darkTheme) Colors.DarkGreen else Colors.LightGreen,
                            unselectedIconColor = if(darkTheme) Colors.DarkIconColor else Color.Black,
                            unselectedTextColor = if(darkTheme) Colors.DarkIconColor else Color.Black,
                        )
                    )
                }
            }
        }
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) { page: Int ->
            when (page) {
                0 -> ChatScreen()
            }
        }
    }
}