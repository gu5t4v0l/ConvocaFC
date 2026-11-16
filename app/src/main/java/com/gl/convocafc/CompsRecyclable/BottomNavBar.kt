package com.gl.convocafc.CompsRecyclable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocalAtm
import androidx.compose.material.icons.filled.Sports
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun BottomNavBar(navController: NavController, content: @Composable () -> Unit = {}){
    Scaffold(
        topBar = { HeaderBar(onConfigClick = { navController.navigate("ConfigPage")}) },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.LocalAtm, contentDescription = "Financeiro") },
                    label = {Text("Financeiro")},
                    selected = false,
                    onClick = {navController.navigate("FinanceiroPage")}
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = {Text("Home")},
                    selected = false,
                    onClick = {navController.navigate("MainMenu")}
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.EmojiEvents, contentDescription = "Ranking")},
                    label = {Text("Ranking")},
                    selected = false,
                    onClick = {navController.navigate("RankingPage")}
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Sports, contentDescription = "Jogos")},
                    label = {Text("Jogos")},
                    selected = false,
                    onClick = {navController.navigate("JogosPage")}
                )
            }
        }
    ){innerPadding -> Box(modifier = Modifier.padding(innerPadding)){content()} }
}