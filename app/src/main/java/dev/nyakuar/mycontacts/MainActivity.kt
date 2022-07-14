package dev.nyakuar.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nyakuar.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding .inflate(layoutInflater)
        setContentView(binding.root)
         displayContact()
    }
    fun displayContact(){
        var contact = Contact ("Sarah ","0704624204","nyakuarrr@gmail.com","616 Korogoi Road","https://i.pinimg.com/236x/f5/23/ab/f523aba282011c1ec9626ebc4292707b.jpg")
        var contact1 = Contact ("Gattouch","0843656437","waracra@gmial.com","Karen Nairobi","https://scontent.fnbo12-1.fna.fbcdn.net/v/t39.30808-6/271593045_2095597380596990_744640293950309997_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=pwRnCvLgf8UAX9PUFqV&_nc_ht=scontent.fnbo12-1.fna&oh=00_AT_V1cq-2sWVb1tAakhxys3FNoFk7gq1gLm_IxmofMlukQ&oe=62D23713")
        var contact2 = Contact ("Mary","074365643","marrygmail.com","Kampala City","https://i.pinimg.com/236x/ea/61/9d/ea619d387f72a52ee09697b24a0fa30c.jpg")
        var contact3 = Contact ("Jane","07365643","jane@gmail.com","Lavingtone Nairobi","https://i.pinimg.com/236x/a5/6e/30/a56e301f8181095294435adaa272b474.jpg")
        var contact9 = Contact ("Homdi","07365643","home@gmail.com","jub city","https://i.pinimg.com/236x/3d/05/bb/3d05bb004fa68421dd33122c08c87ccb.jpg")
        var contact5 = Contact ("Mary","074365643","marrygmail.com","Dodoma city","https://i.pinimg.com/236x/ea/61/9d/ea619d387f72a52ee09697b24a0fa30c.jpg")
        var contact7 = Contact ("Jane","07365643","jane@gmail.com","Lavingtone New york ","https://i.pinimg.com/236x/a5/6e/30/a56e301f8181095294435adaa272b474.jpg")
        var contact4 = Contact ("Hanna","07365643","home@gmail.com","jubcity tongpiny","https://i.pinimg.com/236x/3d/05/bb/3d05bb004fa68421dd33122c08c87ccb.jpg")
        var contact65 = Contact ("Mary","074365643","marrygmail.com","Nakuru kenya","https://i.pinimg.com/236x/1a/f6/26/1af626c91f10267931c05ab252f36ab9.jpg")
        var contact17 = Contact ("Lucy","07365643","jane@gmail.com","Lavingtone Dubia","https://i.pinimg.com/236x/d1/bc/1b/d1bc1b467f2038ba852808757eeda029.jpg")
        var contact34 = Contact ("Charity","07365643","home@gmail.com","jubcity arrea","https://i.pinimg.com/236x/c7/7d/05/c77d05aa4f8e828d339dbd8f1f3d0381.jpg")
        var contact22 = Contact ("Mollen","074365643","marrygmail.com","Canada galvaery","https://i.pinimg.com/236x/e1/9d/9d/e19d9df6663eb1c026e2357ea58cac10.jpg")
        var contact44 = Contact ("Verite","07365643","jane@gmail.com","Lavingtone Paris","https://i.pinimg.com/236x/3a/a9/5b/3aa95b798c2f36601bcf00339d75536d.jpg")
        var contact23 = Contact ("Jackie","07365643","home@gmail.com","jubcity Muniki","https://i.pinimg.com/236x/04/71/b9/0471b9d3a378678b6a8da425a31448b2.jpg")


        var contactList = listOf(contact,contact1,contact2,contact3,contact4 ,contact7, contact5 ,contact9,contact17 ,contact65 ,contact34,contact22,contact44,contact23  )
        var contactsRvAdapter = ContactsRvAdapter (contactList )
        binding .rvContact.layoutManager = LinearLayoutManager (this ,)
        binding .rvContact .adapter = contactsRvAdapter
    }
}
