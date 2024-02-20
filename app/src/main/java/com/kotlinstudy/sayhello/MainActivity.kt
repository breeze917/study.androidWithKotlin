package com.kotlinstudy.sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlinstudy.sayhello.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityMain = ActivityMainBinding.inflate(layoutInflater)

        setContentView(activityMain.root)

        activityMain.textView.text = "Hello"

        activityMain.btnSay.setOnClickListener {
            activityMain.textView.text = "Hello Kotlin!"
        }
    }
}