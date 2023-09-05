package com.example.myapp.telas

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen() {
    //var vlrTextField = "Teste"
    var vlrTextField = remember { mutableStateOf("Digite sua tarefa...") }

    //var contador = remember {
    //    mutableStateOf(0)
    //}

    Row(
        modifier = Modifier
        .background(Color.LightGray)
    ){
        Column(
            modifier = Modifier
                .padding(60.dp)
                .fillMaxWidth()

        ) {
            Text(
                text = "Lista de Tarefas",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.width(20.dp))

            TextField(
                value = vlrTextField.value,
                onValueChange = {
                    //Antes da tela ser redesenhada, roda este trecho:
                    vlrTextField.value = it
                    Log.i("### fun TaskScreen(){...", it)
            })

            Spacer(modifier = Modifier.width(20.dp))
            Text(vlrTextField.value)
        }
    }
}







