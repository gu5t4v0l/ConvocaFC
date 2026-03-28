package com.gl.convocafc

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gl.convocafc.CompsRecyclable.BottomNavBar


@Composable
fun RankingPage(navController: NavController){
    BottomNavBar(navController) {
        Text(
            text = "Teste Estamos no Ranking!"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RankingPagePreview(){
    val navController = rememberNavController()
    RankingPage(navController)
}

