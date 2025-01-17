package com.example.messengerapp_v1

import android.content.Intent
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
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
    // Firebase  instance variables
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyNavigation()
        }

        val email = LoginScreen.email
        //launch login activity using intent
        // Initialize Firebase Auth and check if the user is signed in
        auth = Firebase.auth
        if (auth.currentUser == null) {
            // Not signed in, launch the Sign In activity
            startActivity(Intent(this, SignActivity::class.java))
            finish()
            return
        }
        //Firebase authentication to create a user with email and password
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener{

            }
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



