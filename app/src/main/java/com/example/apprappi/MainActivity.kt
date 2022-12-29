package com.example.apprappi

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@MainActivity, Login::class.java)
                startActivity(intent)
            }
        }, 1500)
    }
}