package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)

        var nameIntent = intent.getStringExtra("name")
        var phoneNumberIntent = intent.getStringExtra("phoneNumber")
        var emailIntent = intent.getStringExtra("email")
        var imageIntent = intent.getStringExtra("image").toString()

        var tvName1 = findViewById<TextView>(R.id.tvName1)
        var tvPhoneNumber1 = findViewById<TextView>(R.id.tvPhoneNumber1)
        var tvEmail1 = findViewById<TextView>(R.id.tvEmail1)
        var imgPerson = findViewById<ImageView>(R.id.imgPerson)

        tvName1.text = nameIntent
        tvPhoneNumber1.text= phoneNumberIntent
        tvEmail1.text = emailIntent
        Picasso.get().load(imageIntent).into(imgPerson)
    }
}
