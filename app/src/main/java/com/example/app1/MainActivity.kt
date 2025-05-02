package com.example.app1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Vertical
import androidx.compose.ui.Alignment.Horizontal
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app1.ui.theme.App1Theme
import androidx.compose.ui.unit.dp

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background

import com.example.app1.Screen1
import com.example.app1.Screen2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App1Theme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "screen1"
                ) {
                    composable("screen1") { Screen1(navController) }
                    composable("screen2") { Screen2(navController) }
                }
            }
        }


    }



}





