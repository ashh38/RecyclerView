package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class SplashScreenActivity : AppCompatActivity() {

    private val splashScreenDuration: Long = 2000 // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Use coroutines to delay for a few seconds before starting MainActivity
        CoroutineScope(Dispatchers.Main).launch {
            delay(splashScreenDuration)
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish() // Close the splash screen
        }
    }
}
