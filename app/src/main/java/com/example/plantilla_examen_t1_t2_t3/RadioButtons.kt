package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MostrarRadioButtons(modifier: Modifier){

    val opciones = listOf(21, 10, 4) // Creo el array con la lista de opcciones
    var eleccion by remember { mutableStateOf(opciones[0]) } // Variable para la elección del usuario (por defecto la 0, es decir la primera)

    Column(modifier = modifier.selectableGroup()) {
        opciones.forEach { opcion -> // Recorro el array de opciones
            Row(
                Modifier.selectable(
                    selected = (opcion == eleccion),
                    onClick = { eleccion = opcion }
                ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = (opcion == eleccion), onClick = { eleccion = opcion })
                Text("$opcion%")
            }
        }
    }
}

