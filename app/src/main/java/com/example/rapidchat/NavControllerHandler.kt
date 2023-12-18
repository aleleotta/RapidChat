package com.example.rapidchat

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class NavControllerHandler {

    @Composable
    fun Navigation(navController: NavHostController) {
        NavHost(navController = navController, startDestination = "Login") {
            composable(route = "Login") { LoginScreen() }
            composable(route = "Register") { RegisterScreen() }
        }
    }

}