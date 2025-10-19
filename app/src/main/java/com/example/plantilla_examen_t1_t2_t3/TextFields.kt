package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun MostrarTextFields(modifier: Modifier){
    var texto by remember { mutableStateOf("") } // Creo la variable texto
    Column(modifier = modifier) {

        // TextField por defecto
        TextField(
            value = texto, // Muestra el valor inicial
            placeholder = { Text("Texto de ejemplo") }, // Muestra un ejemplo del texto que se espera
            onValueChange = { texto = it}, // Recoge el texto escrito
            label = { Text("Etiqueta") }, // Muestra un texto a modo de ayuda

            singleLine = true, // Una sola línea
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), // Elegir el tipo de teclado que muestra
            textStyle = TextStyle(color = Color.Red, fontWeight = FontWeight.Bold),

            modifier = modifier.fillMaxWidth().padding(8.dp)
        )

        Spacer(modifier = Modifier.height(8.dp)) // Espaciador

        HorizontalDivider(thickness = 1.dp, color = Color.LightGray) // Barra espaciadora

        // TextField con etiqueta arriba
        OutlinedTextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Introduce tu nombre") },
            singleLine = true,
            modifier = modifier.fillMaxWidth().padding( 8.dp)
        )
    }
}