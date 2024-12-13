package com.example.prueba.Navigation

sealed class Screen(val route: String) {
    object ScreenOne : Screen("screen_one")
    object ScreenTwo : Screen("screen_two")
    object ScreenThree : Screen("screen_three")
    object ScreenFour : Screen("screen_four")
}