package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts_page)

        displayContacts()

    }

    fun displayContacts(){
        var rvContacts = findViewById<RecyclerView>(R.id.rvContacts)
        var contactsList = listOf(
            Contacts("Deborah Mutua", "0111997545", "deborahmutua@gmail.com"),
            Contacts("Faith Mwende", "0123859435", "mwendefaith@gmail.com"),
            Contacts("Kiprop Emma", "0115784578", "emmakiprop@gmail.com"),
            Contacts("Tony Gaya", "0111803305", "gayatony@gmail.com"),
            Contacts("Alex Muindi", "0145212545", "muindialex@gmail.com"),
            Contacts("Manu Abuya", "0189533954", "abuyamanu@gmail.com"),
            Contacts("Victor Mutisya", "01240249052", "mutisyavictor@gmail.com"),
            Contacts("Mary Wanjiru", "0114204285", "wanjirumary@gmail.com"),
            Contacts("Irene Nyambura", "0134613316", "githuairene@gmail.com")
        )
        var contactsAdapter = ContactsAdapter(contactsList)
        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        rvContacts.adapter = contactsAdapter
    }
}