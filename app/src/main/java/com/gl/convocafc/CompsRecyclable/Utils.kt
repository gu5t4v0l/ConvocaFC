package com.gl.convocafc.CompsRecyclable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.gl.convocafc.JogosPage


fun formatTimer(seconds: Int): String{
    val minutes = seconds / 60
    val seconds = (seconds % 60).toString().padStart(2, '0')
    return "$minutes:$seconds"
}