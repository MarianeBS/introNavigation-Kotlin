package com.example.myapp.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(19.dp)
    ){
        Text(
            text = "TextoDaMainScreen",
            color = Color.Cyan
        )
        Text(
            text = "Colun",
            color = Color.Green)

        Row (){
            Button(
                onClick = {
                    Log.i("### MainScreen{..", "Botão1 Clicado!!")
                }

            ){
                Text(text = "button1")
            }

            Button(
                onClick = {
                    Log.i("### MainScreen{..", "Botão1 Clicado!!")
                }
            ){
                Text(text = "TaskScreen")
            }


        }
    }
}