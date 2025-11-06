package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun FloatingButtonLayout() {
    Scaffold(
        floatingActionButton = {  //Devuelve un elemento composable
            FloatingActionButton(
                containerColor = Color.Magenta,
                shape = CircleShape,
                onClick = {}) {
                Text(
                    "+",   //ESto normalmente se hace con icono pero por ahora lo hacemos con text
                    fontSize = 32.sp,
                    color = Color.White
                )

            }
        }
    ) { paddingValues ->
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {

        }
    }
}