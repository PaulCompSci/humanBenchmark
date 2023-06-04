package com.firstAndroidApp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout3)

        val actButton = findViewById<Button>(R.id.button3)
        actButton.setOnClickListener{
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
            finish()
        }
    }
}