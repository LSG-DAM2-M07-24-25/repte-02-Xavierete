package com.example.prueba.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.prueba.Navigation.Screen

@Composable
fun ScreenTwo(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    )
    {
        Text(
            text = viewModel.screenOneSubtitle,
            color = Color.Blue,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
    }
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
    )

    {
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(Screen.ScreenThree.route) },
            modifier = Modifier
                .background(Color.White)
                .padding(16.dp)
                .height(50.dp)
                .width(200.dp)
                .shadow(4.dp, RoundedCornerShape(12.dp))
        ) {
            Text(
                text = "Continuar",
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}