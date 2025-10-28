package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class) //Notación que indica que TopAppBar es experimental. Ha surgido
// en las ultimas versiones de Material3. Lo que hace es almacenar esta forma de código que puede
//cambiar en el futuro porque es experimental, para evitar errores de compilación si cambiar.
@Composable
fun TopBarLayout() {
    Scaffold(
        topBar = {                    //A topBar se le envía un elemento composable que es TopAppBar
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta
                ), //Usamos un elemento de Jetpack Compose
                title = {
                    Text(
                        "App bar",
                        color = Color.White
                    )
                }
            )
        },

        ) { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
                .fillMaxSize()
        ) { }
    }
}