package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MostrarCheckBox(modifier: Modifier) {

    val ingredientes = listOf("Queso", "Lechuga", "Tomate", "Bacon", "Cebolla")

    // Guarda el estado (true/false) de cada ingrediente
    val seleccionados = remember { mutableStateListOf(false, false, false, false, false) }

    // Para mostrar el resultado al pulsar el botón
    var resultado by remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Selecciona los ingredientes:",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(Modifier.height(8.dp))

        // Recorremos la lista de ingredientes y creamos un Checkbox por cada uno
        ingredientes.forEachIndexed { index, nombre ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = seleccionados[index],
                    onCheckedChange = { seleccionado ->
                        seleccionados[index] = seleccionado
                    }
                )
                Text(nombre)
            }
        }

        Spacer(Modifier.height(12.dp))

        Button(onClick = {
            // Filtramos los seleccionados y los mostramos como texto
            val elegidos = ingredientes.filterIndexed { i, _ -> seleccionados[i] }
            resultado = if (elegidos.isEmpty()) {
                "No has seleccionado ningún ingrediente."
            } else {
                "Has elegido: ${elegidos.joinToString(", ")}"
            }
        }) {
            Text("Confirmar ingredientes")
        }

        Spacer(Modifier.height(8.dp))

        // Muestra el texto con los ingredientes seleccionados
        if (resultado.isNotEmpty()) {
            Text(resultado, style = MaterialTheme.typography.bodyLarge)
        }
    }
}
