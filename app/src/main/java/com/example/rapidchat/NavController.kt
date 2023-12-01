package com.example.rapidchat

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Login") {
        composable(route = "Login") { LoginScreen(navController) }
        composable(route = "Register") { RegisterScreen(navController) }
    }
}