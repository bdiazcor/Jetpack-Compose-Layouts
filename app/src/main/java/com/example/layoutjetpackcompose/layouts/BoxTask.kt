package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//Opcion A: con column, rows y box
@Composable
fun OrganizarBox() {
    Column (
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier.size(100.dp)
                    .background(Color.Magenta)
            ) {}
            Box(
                modifier = Modifier.size(100.dp)
                    .background(Color.DarkGray)
            ) {}
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center
        ){
            Box(
                modifier = Modifier.size(100.dp)
                    .background(Color.Blue)
            ) {}
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier.size(100.dp)
                    .background(Color.Yellow)
            ) {}
            Box(
                modifier = Modifier.size(100.dp)
                    .background(Color.Green)
            ) {}
        }

    }
}

//Sólo con boxes
@Composable
fun OrganizarBox2() {
    Box(modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
        .fillMaxSize(),
        contentAlignment = Alignment.TopStart //Permite alinear nuestro elementos donde queramos. Por ejemplo un floating action button
    ){
        //Dentro de este box puedo colocar cualquier elemento
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Magenta)
        )
    }
    Box(modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
        .fillMaxSize(),
        contentAlignment = Alignment.TopEnd //Permite alinear nuestro elementos donde queramos. Por ejemplo un floating action button
    ){
        //Dentro de este box puedo colocar cualquier elemento
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.DarkGray)
        )
    }
    Box(modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
        .fillMaxSize(),
        contentAlignment = Alignment.Center //Permite alinear nuestro elementos donde queramos. Por ejemplo un floating action button
    ){
        //Dentro de este box puedo colocar cualquier elemento
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Blue)
        )
    }
    Box(modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
        .fillMaxSize(),
        contentAlignment = Alignment.BottomStart //Permite alinear nuestro elementos donde queramos. Por ejemplo un floating action button
    ){
        //Dentro de este box puedo colocar cualquier elemento
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Yellow)
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
