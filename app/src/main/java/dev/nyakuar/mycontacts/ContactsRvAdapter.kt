package dev.nyakuar.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.nyakuar.mycontacts.databinding.ContactListItemBinding
import kotlin.coroutines.coroutineContext

class ContactsRvAdapter(var contactList:List<Contact>):
    RecyclerView.Adapter<contactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactViewHolder {
        var binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false
        )

        return contactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: contactViewHolder, position: Int) {
        val content  = holder .itemView .context
        var currentContact=contactList.get(position)
        val contactBinding=holder.binding
        contactBinding.tvName.text=currentContact.name
        contactBinding.tvPhone .text=currentContact.phone
        contactBinding.tvAddress.text=currentContact.address
        contactBinding.tvGmail .text=currentContact.email

        Picasso.get()
            .load(currentContact.image)
            .resize(300,400)
            .centerCrop()
            .into(contactBinding.imageView);

holder.binding .imageView .setOnClickListener{
    val intent=Intent(content ,ViewContact ::class.java)
    intent.putExtra("NAME",currentContact.name)
    intent.putExtra("PHONE_NUMBER",currentContact.phone)
    intent.putExtra("EMAIL",currentContact.email)
    intent.putExtra("ADDRESS",currentContact.address)
    intent.putExtra("IMAGE",currentContact.image)
    content .startActivity(intent )


}
        holder.binding.imageView.setOnClickListener {
            Toast
                .makeText(content , "you have click on face",Toast.LENGTH_LONG )
                .show()
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class contactViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root){

}



























