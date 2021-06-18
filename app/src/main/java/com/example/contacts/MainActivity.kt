package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent = Intent(baseContext, ContactsPage::class.java)
            startActivity(intent)
        }
    }
}

