package com.example.app1

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.Alignment.Vertical

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import androidx.navigation.NavController
import androidx.compose.material3.ButtonDefaults

import androidx.compose.ui.unit.dp
import com.example.app1.LeaveButton
import com.example.app1.PlusButton
import com.example.app1.CollectButton

//Align
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape

@Composable
fun Screen1(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 10.dp, vertical = 35.dp)
            .border(  width = 5.dp,
                color = Color.Black,
            ),
    ) {


        Column( Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center ){
            Text(
                text = "Esta es la Pantalla 1"
            )

            Button(onClick = {
                navController.navigate("screen2")
            }) {
                Text(text = "Ir a Pantalla 2")
            }

            Row(modifier = Modifier.fillMaxSize().padding(20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Bottom){
                CollectButton(onClick = { println("Hola") }, modifier = Modifier.padding(horizontal = 10.dp))

                Box(modifier = Modifier.padding(vertical = 20.dp)){
                    PlusButton(onClick = { println("Hola") }, modifier = Modifier.padding(horizontal = 10.dp))
                }

                PlusButton(onClick = { println("Hola") }, modifier = Modifier.padding(horizontal = 10.dp))
            }
        }

    }
}

@Composable
fun Screen2(navController: NavController) {
    val Elements = listOf("Toro", "Baul", "Alfombra", "Nube", "Roca", "Puerta", "Mar", "Pelota", "Lapiz", "Reloj")
    var currentElement by remember { mutableStateOf<String?>(null) } // Para mostrar el elemento actual


    Box(
        modifier = Modifier.fillMaxSize().
        padding(horizontal = 10.dp, vertical = 35.dp)
    ) {
        LeaveButton(
            onClick = {navController.navigate("screen1")},
            modifier = Modifier.align(Alignment.TopStart)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            LaunchedEffect(Unit) {
                for (element in Elements.indices) {
                    currentElement = "$element"  // Actualiza el elemento a mostrar
                    delay(3000)  // Espera de 3 segundos
                }
            }

            currentElement?.let {
                Text(
                    text = Elements[it.toInt()]?: "Nada",
                    style = TextStyle(
                        fontSize = 55.sp,
                        fontWeight = FontWeight.Bold,  // Peso de la fuente
                        color = Color.Black  // Color del texto
                    )
                )

                if (Elements.size - 1 == it.toInt()) {
                    Text("Esta es la ultima palabra")
                }
            }



    }










    }
}
