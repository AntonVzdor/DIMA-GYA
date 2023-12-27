package com.example.dimagya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val bottomYes: Button = findViewById(R.id.YES)
        val bottomNo: Button = findViewById(R.id.NO)

        bottomYes.setOnClickListener {
            startActivity(Intent(this, YesActivity::class.java))
        }
        bottomNo.setOnClickListener {
            startActivity(Intent(this, NoActivity::class.java))
        }
    }
}