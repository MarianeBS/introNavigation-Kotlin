package com.example.myapp.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(){
    //var vlrTextField = "Teste"
    //var vlrTextField = remember { mutableStateOf("vlrInicial") }

    var contador = remember {
        mutableStateOf(0)
    }

    Column (modifier = Modifier.padding(20.dp)){
        Text(text = "Título da Tarefa")
        //TextField(
        //    value = vlrTextField.value,
        //    onValueChange = {
            //Antes da tela ser redesenhada, roda este trecho:
        //        vlrTextField.value = it
        //        Log.i("### fun TaskScreen(){...", it)
        //    })
        Spacer(modifier = Modifier.width(20.dp))



        Button(onClick = {
            contador.value == 1
        }){
            Text(text = "MainScreen")
        }
        Text(contador.value.toString())

    }
}

