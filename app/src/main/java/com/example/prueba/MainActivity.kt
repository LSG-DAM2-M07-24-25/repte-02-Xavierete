package com.example.prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.prueba.Screens.ScreenOne
import com.example.prueba.ui.theme.PruebaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Screen.ScreenOne.route
                ) {
                    composable(Screen.ScreenOne.route) {
                        ScreenOne(navController)
                    }
                    composable(Screen.ScreenTwo.route) {
                        com.example.prueba.Screens.ScreenTwo(navController)
                    }
                    composable(Screen.ScreenTwo.route) {
                        ScreenThree(navController)
                    }
                    composable(Screen.ScreenTwo.route) {
                        ScreenFour(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PruebaTheme {
        Greeting("Android")
    }
}