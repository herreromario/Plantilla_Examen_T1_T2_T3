package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun CalcularIVA(modifier: Modifier) {

    val listaIVA = listOf(21, 10, 4)
    var eleccion by remember { mutableStateOf(listaIVA[0]) }
    var precioInput by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Introduce el precio del producto:")

        OutlinedTextField(
            value = precioInput,
            onValueChange = { precioInput = it },
            label = { Text("Precio sin IVA") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            modifier = Modifier.padding(8.dp)
        )

        Text("Selecciona el tipo de IVA:")

        Column(modifier = modifier.selectableGroup()) {
            listaIVA.forEach { opcion ->
                Row(Modifier.selectable(
                    selected = (opcion == eleccion),
                    onClick = { eleccion = opcion },),

                    verticalAlignment = Alignment.CenterVertically)
                {
                    RadioButton(
                        selected = (opcion == eleccion),
                        onClick = { eleccion = opcion }
                    )
                    Text("$opcion %")
                }
            }
        }


        Button(onClick = {
            val precio = precioInput.toDoubleOrNull() ?: 0.0
            val total = precio + (precio * eleccion / 100)
            resultado = "Precio final: %.2f €".format(total)
        }) {
            Text("Calcular")
        }

        if (resultado.isNotEmpty()) {
            Text(resultado, Modifier.padding(top = 8.dp))
        }
    }
}
