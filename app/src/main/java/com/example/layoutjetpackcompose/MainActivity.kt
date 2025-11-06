package com.example.layoutjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutjetpackcompose.ejercicioslayout.EjemploButtonBox
import com.example.layoutjetpackcompose.layouts.SaludoColumn

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SaludoColumn()
            //SaludoRow()
            //BoxLayout()
            //OrganizarBox()
            //OrganizarBox2()
            //ScaffoldLayout()
            //FloatingButtonLayout()
            //TopBarLayout()


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun EjemploMainPreview() {
    SaludoColumn()
}

