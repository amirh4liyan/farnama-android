package com.example.farnama.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.farnama.ui.associations.AssociationsScreen
import com.example.farnama.ui.auth.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate("associations") {
                        // صفحه ورود از پشته حذف شود تا با دکمه Back برنگردیم
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }
        composable("associations") {
            AssociationsScreen()
        }
    }
}