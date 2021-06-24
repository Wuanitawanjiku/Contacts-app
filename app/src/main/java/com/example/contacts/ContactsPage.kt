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
        var contactsList = listOf(
            Contacts("Deborah Mutua", "0111997545", "deborahmutua@gmail.com", "https://bit.ly/3xLHLmj"),
            Contacts("Faith Mwende", "0123859435", "mwendefaith@gmail.com", "https://bit.ly/3xOkYpR"),
            Contacts("Kiprop Emma", "0115784578", "emmakiprop@gmail.com", "https://bit.ly/3vRKdpV"),
            Contacts("Tony Gaya", "0111803305", "gayatony@gmail.com", "https://bit.ly/3gT27Va"),
            Contacts("Alex Muindi", "0145212545", "muindialex@gmail.com", "https://bit.ly/3xLHLmj"),
            Contacts("Manu Abuya", "0189533954", "abuyamanu@gmail.com", "https://bit.ly/3vRKdpV"),
            Contacts("Victor Mutisya", "01240249052", "mutisyavictor@gmail.com", "https://bit.ly/3xOkYpR"),
            Contacts("Mary Wanjiru", "0114204285", "wanjirumary@gmail.com", "https://bit.ly/3gT27Va"),
            Contacts("Irene Nyambura", "0134613316", "githuairene@gmail.com", "https://bit.ly/3xLHLmj"),
            Contacts("Joy Jahenda", "0117387284", "jahendajoy@gmail.com", "https://bit.ly/3xLHLmj")
        )

        var rvContacts = findViewById<RecyclerView>(R.id.rvContacts)

        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        var contactsAdapter = ContactsAdapter(contactsList)
        rvContacts.adapter = contactsAdapter
    }
}