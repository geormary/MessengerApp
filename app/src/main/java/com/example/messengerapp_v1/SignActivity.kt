package com.example.messengerapp_v1

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignActivity {
    // Firebase instance variables
//    private lateinit var auth: FirebaseAuth
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        // ...
//        // Initialize FirebaseAuth
//        auth = Firebase.auth
//        // ADD THIS
//        private val signIn: ActivityResultLauncher<Intent> =
//            registerForActivityResult(FirebaseAuthUIActivityResultContract(), this::onSignInResult)
//
//    }
//    public override fun onStart() {
//        super.onStart()
//
//        // If there is no signed in user, launch FirebaseUI
//        // Otherwise head to MainActivity
//        if (Firebase.auth.currentUser == null) {
//            // Sign in with FirebaseUI, see docs for more details:
//            // https://firebase.google.com/docs/auth/android/firebaseui
//            val signInIntent = AuthUI.getInstance()
//                .createSignInIntentBuilder()
//                .setLogo(R.mipmap.ic_launcher)
//                .setAvailableProviders(listOf(
//                    AuthUI.IdpConfig.EmailBuilder().build(),
//                    AuthUI.IdpConfig.GoogleBuilder().build(),
//                ))
//                .build()
//
//            signIn.launch(signInIntent)
//        } else {
//            goToMainActivity()
//        }
//    }
//
//    private fun onSignInResult(result: FirebaseAuthUIAuthenticationResult) {
//        if (result.resultCode == RESULT_OK) {
//            Log.d(TAG, "Sign in successful!")
//            goToMainActivity()
//        } else {
//            Toast.makeText(
//                this,
//                "There was an error signing in",
//                Toast.LENGTH_LONG).show()
//
//            val response = result.idpResponse
//            if (response == null) {
//                Log.w(TAG, "Sign in canceled")
//            } else {
//                Log.w(TAG, "Sign in error", response.error)
//            }
//        }
//    }
}
