package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgContacts = findViewById<ImageView>(R.id.imgContacts)
        imgContacts.setOnClickListener {
            var intent = Intent(baseContext, ContactsPage::class.java)
            startActivity(intent)
        }

        var btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent = Intent(baseContext, ContactsPage::class.java)
            startActivity(intent)
        }
    }
}

