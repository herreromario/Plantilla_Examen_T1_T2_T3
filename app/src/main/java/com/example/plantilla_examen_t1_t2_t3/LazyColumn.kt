package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MostrarLazyColumn(modifier: Modifier){
    val lista = listOf("Pizza Margarita", "Pizza 4 Quesos", "Pizza Barbacoa")

    LazyColumn(modifier = modifier) {
        items(lista) { pizza ->
            Card(
                modifier = modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = pizza, style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    }

}