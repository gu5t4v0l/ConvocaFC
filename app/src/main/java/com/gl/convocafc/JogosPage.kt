package com.gl.convocafc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.RestartAlt
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gl.convocafc.CompsRecyclable.BottomNavBar
import com.gl.convocafc.CompsRecyclable.formatTimer
import kotlinx.coroutines.delay
@Composable
fun JogosPage(navController: NavController){
    var placarTeam1 by remember { mutableStateOf(0) }
    var placarTeam2 by remember { mutableStateOf(0) }
    var seconds by remember {mutableStateOf(600)}
    var timerRun by remember { mutableStateOf(false) }
    LaunchedEffect(timerRun) {
        while (timerRun && seconds > 0){
            delay(1000L)
            seconds--
        }
    }
        BottomNavBar(navController) {
        Column(modifier = Modifier.fillMaxWidth(),horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {
            Text(
                text = "$placarTeam1",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 55.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)
            )
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Button(onClick = { placarTeam1++ }) {
                    //Text(text = "+")
                    Icon(Icons.Default.Add,contentDescription = "", modifier = Modifier.size(13.dp))
                }
                Button(onClick = { placarTeam1-- }) {
                    //Text(text = "-")
                    Icon(Icons.Default.Remove, contentDescription = "", modifier = Modifier.size(13.dp))
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(
                text = formatTimer(seconds),
            )
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Button(onClick = {timerRun = !timerRun }) {
                    if (!timerRun){
                        Icon(Icons.Default.PlayArrow, contentDescription = "Iniciar", modifier = Modifier.size(13.dp))
                    } else if(timerRun){
                        Icon(Icons.Default.Pause, contentDescription = "Pause", modifier = Modifier.size(13.dp))
                    }
                }
                Button(onClick = { seconds = 600; timerRun = false }) {
                    Icon(Icons.Default.RestartAlt, contentDescription = "Reiniciar", modifier = Modifier.size(13.dp))
                }
            }
        }

        Column(modifier = Modifier.fillMaxWidth(),horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center) {
            Text(
                text = "$placarTeam2",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 0.dp, top = 0.dp, end = 55.dp, bottom = 0.dp)
            )
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Button(onClick = { placarTeam2++ }) {
                    Icon(Icons.Default.Add, contentDescription = "", modifier = Modifier.size(13.dp))
                }
                Button(onClick = { placarTeam2-- }) {
                    Icon(Icons.Default.Remove, contentDescription = "", modifier = Modifier.size(13.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JogosPagePreview(){
    val navController = rememberNavController()
    JogosPage(navController)
}