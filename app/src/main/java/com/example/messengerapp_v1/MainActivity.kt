package com.example.messengerapp_v1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.messengerapp_v1.ui.LoginScreen
import com.example.messengerapp_v1.ui.RegisterScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyNavigation()
        }

        //launch login activity using intent
        //Firebase authentication to create a user with email and password

    }

    @Composable
    fun MyNavigation() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "register") {
            composable("login") { LoginScreen(navController) }
            composable("register") { RegisterScreen(navController) }
        }
    }


}



