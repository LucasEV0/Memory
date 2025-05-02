package com.example.app1

import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.size

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.KeyboardArrowLeft

//Buttons
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Collections

//Campos
import androidx.compose.material3.TextField
import androidx.compose.runtime.*

//Iconos

import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.ui.graphics.vector.ImageVector

//Hovers
import androidx.compose.runtime.remember
import androidx.compose.material.ripple.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.Indication
import androidx.compose.foundation.LocalIndication


@Composable
fun PrimaryButton(modifier: Modifier){
    Button(
        onClick = { println("Button Clicked") },
        modifier = modifier,
        ) {
        Text(text = "Primary Button")
    }
}

@Composable
fun TertiaryButton(onClick: () -> Unit, modifier: Modifier, icon : ImageVector, description : String, color : Color  ){

    Icon(
        imageVector = icon?: Icons.Filled.KeyboardArrowLeft,
        contentDescription = description?: "Icono default",
        tint = color?: Color.Black,
        modifier = Modifier
            .size(60.dp)
            .border(
                width = 3.dp,
                color = Color.Black,
                shape = CircleShape
            )
            .padding(2.dp)
            .clickable{onClick()}
    )


}

@Composable
fun LeaveButton(onClick: () -> Unit, modifier: Modifier){

TertiaryButton(
    onClick = { onClick() },
    modifier = modifier?: Modifier.padding(0.dp),
    icon = Icons.Filled.KeyboardArrowLeft,
    description = "Volver",
    color = Color.Black
    )


}



@Composable
fun PlusButton(onClick: () -> Unit, modifier: Modifier){

    TertiaryButton(
        onClick = { onClick() },
        modifier = modifier?: Modifier.padding(0.dp),
        icon = Icons.Filled.Add,
        description = "Volver",
        color = Color.Black
    )


}

@Composable
fun CollectButton(onClick: () -> Unit, modifier: Modifier){

    TertiaryButton(
        onClick = { onClick() },
        modifier = modifier?: Modifier.padding(0.dp),
        icon = Icons.Filled.Collections,
        description = "Volver",
        color = Color.Black
    )


}


//--------------------------------

fun FieldText(){

}

