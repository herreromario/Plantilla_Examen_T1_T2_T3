package com.example.plantilla_examen_t1_t2_t3

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
import com.example.plantilla_examen_t1_t2_t3.ui.theme.Plantilla_Examen_T1_T2_T3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Para usar toda la pantalla
        setContent {
            Plantilla_Examen_T1_T2_T3Theme { // Tema de la App
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MostrarCheckBox(modifier = Modifier
                        .padding(innerPadding)) // Hereda el modifier del padre
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


