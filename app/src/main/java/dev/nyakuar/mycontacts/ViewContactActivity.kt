package dev.nyakuar.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.nyakuar.mycontacts.databinding.ActivityMainBinding
import dev.nyakuar.mycontacts.databinding.ActivityViewContactBinding


class ViewContact : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }

    fun getExtras(){
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        val extras = intent.extras
        var name = extras?.getString("NAME","")
        var phone= extras?.getString("PHONE_NUMBER","")
        var email = extras?.getString("EMAIL","")
        var address = extras?.getString("ADDRESS","")
        var image = binding.imgProfile

        binding.tvNameOne.text = name
        binding.tvNumber.text = phone
        binding.tvEmailFirst.text = email
        binding.tvAddress.text = address

        Picasso.get()
            .load(intent.getStringExtra("PROFILE"))
            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(image)

    }
}

