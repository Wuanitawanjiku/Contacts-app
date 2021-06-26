package com.example.contacts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter (var contactsList: List<Contacts>, var context: Context): RecyclerView.Adapter<ContactsViewHolder>(){
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
            //default picture
            .placeholder(R.drawable.person)
            .into(holder.imgContact)

        holder.cvContact.setOnClickListener {
            var intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("name", currentContacts.contactsName)
            intent.putExtra("phoneNumber", currentContacts.contactsPhoneNumber)
            intent.putExtra("email", currentContacts.contactsEmail)
            intent.putExtra("image", currentContacts.imageUrl)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactsList.size
            }
}

class ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber1)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail1)
    var imgContact =itemView.findViewById<ImageView>(R.id.imgContact)
    var cvContact = itemView.findViewById<CardView>(R.id.cvContact)
}