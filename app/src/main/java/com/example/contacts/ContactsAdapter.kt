package com.example.contacts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter (var contactsList: List<Contacts>): RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contacts_list_item, parent, false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContacts  = contactsList.get(position)
        holder.tvName.text = currentContacts.contactsName
        holder.tvPhoneNumber.text = currentContacts.contactsPhoneNumber
        holder.tvEmail.text = currentContacts.contactsEmail
        Picasso
            .get()
            .load(currentContacts.imageUrl)
            .into(holder.imgContact)
    }

    override fun getItemCount(): Int {
        return contactsList.size
            }
}

class ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var imgContact =itemView.findViewById<ImageView>(R.id.imgContact)
}