package com.example.layoutjetpackcompose.ejercicioslayout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

//Incluye FloatingActionButton, TopBar y ContactItem
@OptIn(ExperimentalMaterial3Api::class) //Notación que indica que TopAppBar es experimental. Ha surgido
// en las ultimas versiones de Material3. Lo que hace es almacenar esta forma de código que puede
//cambiar en el futuro porque es experimental, para evitar errores de compilación si cambiar.
@Composable
fun ScaffoldLayoutFinal() {
    Scaffold (
        topBar = {                    //A topBar se le envía un elemento composable que es TopAppBar
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta
                ), //Usamos un elemento de Jetpack Compose
                title = {
                    Text("App bar",
                        color = Color.White)
                }
            )
        },
        floatingActionButton = {  //Devuelve un elemento composable
            FloatingActionButton(containerColor = Color.Magenta,
                shape = CircleShape,
                onClick = {}) {
                Text("+",   //ESto normalmente se hace con icono pero por ahora lo hacemos con text
                    fontSize = 24.sp,
                    color = Color.White
                )
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
                .fillMaxSize()
        ) {
            Column {
                //Con llamada a función que pinta el contacto
                Text("Solo uso de llamada a la función para pintar cada contacto")
                ItemContact(
                    "Beatriz Díaz",
                    "+34111111111"
                )
                ItemContact(
                    "Luke Skywalker",
                    "+34777777777"
                )
                ItemContact(
                    "Princesa Leia",
                    "+34888888888"
                )
                ItemContact(
                    "Dark Vader",
                    "+34666666666"
                )

                //Con lista de objetos y uso de forEach con lambda para pintar cada objeto de lista
                HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)
                Text("Usando clases y lista")
                val beatriz = EjemploItemcontacto("Beatriz Díaz", "+34111111111")
                val luke = EjemploItemcontacto("Luke Skywalker", "+34777777777")
                val leia = EjemploItemcontacto("Princesa Leia", "+34888888888")
                val dark = EjemploItemcontacto("Dark Vader", "+34666666666")

                val contactos = listOf<EjemploItemcontacto>(beatriz, luke, leia, dark)

                contactos.forEach { contacto -> EjemploItemContacto2(contacto) }

            }


        }
    }

}