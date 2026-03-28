package com.gl.convocafc


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gl.convocafc.ui.theme.ConvocaFCTheme
import com.gl.convocafc.ui.theme.PrimaryFont




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConvocaFCTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Wellcome") {
                    composable("Wellcome") {
                        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                            Wellcome(
                                name = "ConvocaFC",
                                modifier = Modifier.padding(innerPadding),
                                onEntrar = { navController.navigate("MainMenu") }
                            )
                        }
                    }
                    composable("MainMenu") {
                        MainMenu(navController = navController)
                    }
                    composable("JogosPage") {
                        JogosPage(navController = navController)
                    }
                    composable("FinanceiroPage") {
                        FinanceiroPage(navController = navController)
                    }
                    composable("RankingPage") {
                        RankingPage(navController = navController)
                    }
                }
            }
        }
    }
}

@Composable
fun Wellcome(name: String, modifier: Modifier = Modifier, onEntrar: () -> Unit = {}) {
    Column(horizontalAlignment = Alignment.CenterHorizontally ) {
        Text(
            text = "Seja Bem-Vindo ao $name!",
            fontFamily = PrimaryFont,
            modifier = modifier
        )
        Text(
            text = " O melhor APP para Controlar a sua Pelada!",
            fontFamily = PrimaryFont,
            modifier = modifier
        )
        Button(onClick = onEntrar) {
            Text(
            text = "Comecar a Convocar!",
            fontFamily = PrimaryFont
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WellcomePreview() {
    ConvocaFCTheme {
        Wellcome(name = "ConvocaFC")
    }
}