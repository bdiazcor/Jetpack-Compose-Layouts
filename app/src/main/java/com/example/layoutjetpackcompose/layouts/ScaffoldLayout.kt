package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//Scaffold es una función Composable que devuelve un valor de padding dependiendo de como son nuestras barras
//de navegación (top/botton)
//Scaffold decide nuestro padding. Es muy eficiente para tener control de las diferentes pantallas
//Creamos una caja de 100.dp que respeta el padding que le pasa Scaffold
@Composable
fun ScaffoldLayout() {
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
                .background(Color.Red)
                .size(100.dp)
        )
    }

    //Otra forma de escribir la lambda
    //Scaffold { Box(
    //        modifier = Modifier.padding(it)
    //            .background(Color.Magenta)
    //            .size(100.dp)
    //    )
    //}
}

