package com.example.prueba.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.prueba.Navigation.Screen
import com.example.prueba.Navigation.AppViewModel

@Composable
fun ScreenOne(navController: NavController, viewModel: AppViewModel) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .clip(RoundedCornerShape(50))
                .border(2.dp, Color.Black)
                .graphicsLayer(alpha = 0.8f)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = viewModel.screenOneTitle,
            color = Color.Blue,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = viewModel.screenOneSubtitle,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(32.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(viewModel.screenOneBody, style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate(Screen.ScreenFour.route) },
                modifier = Modifier
                    .background(Color.white)
                    .padding(16.dp)
                    .height(50.dp)
                    .width(200.dp)
                    .shadow(4.dp, RoundedCornerShape(12.dp))
            ) {
                Text(
                    text = "Entrar!",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
        }
    }
}