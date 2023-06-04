package com.firstAndroidApp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import java.util.Random

class MainActivity : ComponentActivity() {
    var level = 0
    var arr = mutableListOf<Int>()
    var pointer = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity2)

         val buttons: Array<Button> = arrayOf(
             findViewById(R.id.button0),
            findViewById(R.id.button1),
            findViewById(R.id.button2),
             findViewById(R.id.button3),
             findViewById(R.id.button4),
             findViewById(R.id.button5),
             findViewById(R.id.button6),
             findViewById(R.id.button7),
             findViewById(R.id.button8)
        )

        fun rand(start: Int, end: Int): Int {
            require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
            return Random(System.nanoTime()).nextInt(end - start + 1) + start
        }

        fun animation() {
            level++;
            val text: TextView = findViewById(R.id.level) as TextView
            text.setText("Level : "+ level)
            arr.add(rand(0,8))
            Thread{
                for (i in arr) {
                    val button = buttons[i]
                    Thread.sleep(1000);
                    button.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                    button.postDelayed({
                        button.setBackgroundColor(ContextCompat.getColor(this, R.color.buttonPurple))
                    }, 500)
                }
            }.start()
        }

        for (i in 0 until 8) {
            buttons[i].setOnClickListener {
                buttons[i].setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                buttons[i].postDelayed({
                    buttons[i].setBackgroundColor(ContextCompat.getColor(this, R.color.buttonPurple))
                }, 500)
                if (i == arr[pointer]) {
                    pointer++;
                    if (pointer == arr.size){
                        pointer = 0;
                        animation()
                    }
                }else{

                }
            }
        }

        animation()

    }
}

