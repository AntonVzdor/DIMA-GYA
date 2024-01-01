package com.example.dimagya

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class NoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no)

        val buttonBack = findViewById<Toolbar>(R.id.back)
        buttonBack.setOnClickListener{super.finish()}
    }
}