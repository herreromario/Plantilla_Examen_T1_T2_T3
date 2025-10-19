package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun MostrarBoton (modifier: Modifier){
    var contador by remember { mutableStateOf(0) }

    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly){ // Centrar el botón horizontalmente
        Button(
            onClick = { contador++ },
            modifier = modifier.padding(16.dp)
        ) {
            Text("Has pulsado $contador veces")
        }
    }


}
