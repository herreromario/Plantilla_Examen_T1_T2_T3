package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MostrarLazyColumnDesplegable(modifier: Modifier) {
    val pizzas = listOf("Margarita", "Barbacoa", "4 Quesos", "Carbonara")

    LazyColumn(modifier = modifier) {
        items(pizzas) { nombre ->
            var abierto by remember { mutableStateOf(false) }

            Card(
                modifier = modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Column(Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = nombre,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.weight(1f)
                        )
                        IconButton(onClick = { abierto = !abierto }) {
                            Icon(
                                imageVector = if (abierto) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown ,
                                contentDescription = if (abierto) "Cerrar" else "Abrir"
                            )
                        }
                    }

                    // Si está abierto, mostramos más información
                    if (abierto) {
                        Text(
                            text = "Esta es la pizza $nombre.",
                            style = MaterialTheme.typography.bodyMedium,
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }
            }
        }
    }
}
