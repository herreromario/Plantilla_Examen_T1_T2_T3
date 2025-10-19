package com.example.plantilla_examen_t1_t2_t3

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MostrarTexto(modifier: Modifier){
    Text(
        modifier = modifier, // Le paso el modifier innerPadding del padre
        text = stringResource(R.string.esto_es_un_texto),
        fontSize = 20.sp,
        color = MaterialTheme.colorScheme.primary, // Color primario del tema
        fontWeight = FontWeight.Bold, // Grosor
        textAlign = TextAlign.Center
    )
}