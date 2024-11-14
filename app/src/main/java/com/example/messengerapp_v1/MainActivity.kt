package com.example.messengerapp_v1

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.example.messengerapp_v1.ui.RegisterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
//            MessengerApp_V1Theme {
//               ActivityFunction()
//            }
            RegisterScreen()
        }

        //launch login activity using intent
//        switchLoginActivity()

    }
}

@Composable
fun ActivityFunction() {
    AndroidView(
        factory = { context ->
            val view = LayoutInflater.from(context).inflate(R.layout.activity_main, null, false)
            view

        }
    )
}



