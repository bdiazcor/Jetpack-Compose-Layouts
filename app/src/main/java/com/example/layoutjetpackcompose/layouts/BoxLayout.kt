package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxLayout() {
    Box(modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
        .fillMaxSize(),
        contentAlignment = Alignment.BottomStart //Permite alinear nuestro elementos donde queramos. Por ejemplo un floating action button
    ){
        //Dentro de este box puedo colocar cualquier elemento
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Green)
        )
    }
    Box(modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
        .fillMaxSize(),
        contentAlignment = Alignment.BottomEnd //Permite alinear nuestro elementos donde queramos. Por ejemplo un floating action button
    ){
        //Dentro de este box puedo colocar cualquier elemento
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Green)
        )
    }
}