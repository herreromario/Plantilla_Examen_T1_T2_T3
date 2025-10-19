package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MostrarImagen(modifier: Modifier){
    Image(
        painter = painterResource(R.drawable.foto_de_perfil),
        contentDescription = null,
        modifier = modifier.size(200.dp) // Tamaño de la imagen
            .clip(CircleShape), // Recorte circular
        contentScale = ContentScale.Crop, // Recorte en el centro del espacio disponible

    )
}