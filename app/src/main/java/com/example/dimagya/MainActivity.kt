package com.example.dimagya

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val bottonYes: Button = findViewById(R.id.YES)
        bottonYes.setOnClickListener {
            val textYes = "Это пока заглушка для 'ДА'"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, textYes, duration)
            toast.setGravity(Gravity.CENTER, 0, 0)
        }

        val bottonNo: Button = findViewById(R.id.NO)
        bottonNo.setOnClickListener {
            val textNo = "Это пока заглушка для 'НЕТ'"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, textNo, duration)
            toast.setGravity(Gravity.CENTER, 0, 0)
        }
    }
}