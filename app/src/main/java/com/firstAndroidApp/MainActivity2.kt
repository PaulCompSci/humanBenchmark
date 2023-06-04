package com.firstAndroidApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        val Intent = Intent(this,MainActivity3::class.java)
        startActivity(Intent)
        finish()
    }
}