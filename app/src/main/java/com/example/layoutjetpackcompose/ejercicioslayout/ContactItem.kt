package com.example.layoutjetpackcompose.ejercicioslayout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Creamos una función composable para cada fila de contacto con estructura repetida.
// Es un elemento personalizado
@Composable
fun ItemContact(name:String,phoneNumber: String) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray)
        Text(phoneNumber,
            fontSize = 14.sp,
            fontWeight = FontWeight.Light,
            color = Color.DarkGray)
    }

}