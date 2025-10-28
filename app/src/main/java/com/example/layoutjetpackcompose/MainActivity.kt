package com.example.layoutjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutjetpackcompose.layouts.BoxLayout
import com.example.layoutjetpackcompose.layouts.FloatingButtonLayout
import com.example.layoutjetpackcompose.layouts.OrganizarBox
import com.example.layoutjetpackcompose.layouts.OrganizarBox2
import com.example.layoutjetpackcompose.layouts.SaludoColumn
import com.example.layoutjetpackcompose.layouts.SaludoRow
import com.example.layoutjetpackcompose.layouts.ScaffoldLayout
import com.example.layoutjetpackcompose.layouts.ScaffoldLayoutFinal
import com.example.layoutjetpackcompose.layouts.TopBarLayout
import com.example.layoutjetpackcompose.ui.theme.LayoutJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //SaludoColumn()
            //SaludoRow()
            //BoxLayout()
            //OrganizarBox()
            //OrganizarBox2()
            //ScaffoldLayout()
            //FloatingButtonLayout()
            //TopBarLayout()
            ScaffoldLayoutFinal()
        }
    }
}

