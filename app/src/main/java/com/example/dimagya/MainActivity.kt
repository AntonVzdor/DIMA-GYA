package com.example.dimagya

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val bottonYes: Button = findViewById(R.id.YES)
        val bottonNo: Button = findViewById(R.id.NO)

        bottonYes.setOnClickListener {
            Toast.makeText(this@MainActivity, "Заглушка для 'ДА'", Toast.LENGTH_SHORT).show()
        }

        bottonNo.setOnClickListener {
            Toast.makeText(this@MainActivity, "Заглушка для 'НЕТ'", Toast.LENGTH_SHORT).show()
        }

    }
}

//коммент