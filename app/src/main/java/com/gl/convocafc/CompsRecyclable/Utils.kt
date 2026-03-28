package com.gl.convocafc.CompsRecyclable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.gl.convocafc.JogosPage


fun formatTimer(seconds: Int): String{
    val minutes = seconds / 60
    val second = seconds % 60
    return "$minutes:$second"
}