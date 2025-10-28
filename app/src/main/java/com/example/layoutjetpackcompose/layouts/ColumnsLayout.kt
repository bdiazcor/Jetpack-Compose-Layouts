package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//Para que Compose sepa que este es un elemento que quiero mostrar en pantalla hay que poner @Composable
//@Composable indica a Compose que esto es un elemento que "quiero pintar en pantalla"
//Las funciones @Composable deben comenzar por mayúsculas

@Composable
fun SaludoColumn() {
    Column (
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 8.dp)
            . fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "Hola"
        )
        //Si no hacemos nada, el nuevo texto sale encima del otro. Para eso usamos column por ejemplo
        Text(
            text = "Hola mi nombre es Beatriz Díaz"
        )
        Text(
            text = "Adios"
        )
    }
}