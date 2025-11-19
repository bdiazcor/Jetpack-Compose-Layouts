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
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red)
        Text(phoneNumber,
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
            color = Color.DarkGray)
    }

}

//Hace lo mismo que función ItemContact pero usando la clase EjemploItemContacto
@Composable
fun EjemploItemContacto2 (contacto: EjemploItemcontacto) {

    Row (
        modifier = Modifier.padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(contacto.nombre,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red)
        Text(contacto.telefono,
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
            color = Color.DarkGray)
    }

}

//Clase para definir contacto
data class EjemploItemcontacto (
    val nombre: String,
    val telefono: String
)