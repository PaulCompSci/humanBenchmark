package com.firstAndroidApp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout1)

        val actButton = findViewById<Button>(R.id.button2)
        actButton.setOnClickListener{
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
            finish()
        }
    }
    
}


