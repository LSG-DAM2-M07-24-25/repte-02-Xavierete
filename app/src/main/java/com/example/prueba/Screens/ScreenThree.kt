package com.example.prueba.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ScreenTwo(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = "Logo",
            modifier = Modifier
        )
    }
    Spacer(modifier = Modifier.height(8.dp))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("¡Ya has escogido a tu personaje!", style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(Screen.ScreenFour.route) },
            modifier = Modifier
                .background(Color.Blue)
                .padding(16.dp)
                .height(50.dp)
                .width(200.dp)
                .shadow(4.dp, RoundedCornerShape(12.dp))
        ) {
            Text(
                text = "Mostrar el personaje a gran escala",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}