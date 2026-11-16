package com.gl.convocafc

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gl.convocafc.CompsRecyclable.BottomNavBar


@Composable
fun ConfigPage(navController: NavController){
    BottomNavBar(navController){
        Text(text = "Entramos na Configs")
    }
}

@Preview(showBackground = true)
@Composable
fun ConfigPagePreview(){
    val navController = rememberNavController()
    ConfigPage(navController)
}

