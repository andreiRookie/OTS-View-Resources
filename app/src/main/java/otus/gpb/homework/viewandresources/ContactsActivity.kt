package otus.gpb.homework.viewandresources

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        supportActionBar?.apply {
//            setHomeButtonEnabled(true) - enabled by default
            setHomeAsUpIndicator(R.drawable.ic_arrow_back_24)
            setDisplayHomeAsUpEnabled(true)
        }

        val nameBlock = findViewById<ViewGroup>(R.id.name_block)
        nameBlock.findViewById<EditText>(R.id.edit_text).hint = getString(R.string.name_hint)
        nameBlock.findViewById<ImageView>(R.id.icon).setImageResource(R.drawable.ic_person_24)

        val phoneBlock = findViewById<ViewGroup>(R.id.phone_block)
        phoneBlock.findViewById<EditText>(R.id.edit_text).hint = getString(R.string.phone_number_hint)
        phoneBlock.findViewById<ImageView>(R.id.icon).setImageResource(R.drawable.ic_phone_24)

        val selectBlock = findViewById<ViewGroup>(R.id.select_block)
        selectBlock.findViewById<TextView>(R.id.text_view).text = getString(R.string.select_hint)

        val addressBlock = findViewById<ViewGroup>(R.id.address_block)
        addressBlock.findViewById<EditText>(R.id.edit_text).hint = getString(R.string.address_hint)
        addressBlock.findViewById<ImageView>(R.id.icon).setImageResource(R.drawable.ic_location_on_24)

        val cityBlock = findViewById<ViewGroup>(R.id.city_block)
        cityBlock.findViewById<EditText>(R.id.edit_text).hint = getString(R.string.city_hint)

        val stateBlock = findViewById<ViewGroup>(R.id.state_block)
        stateBlock.findViewById<TextView>(R.id.text_view).text = getString(R.string.state_hint)

        val zipBlock = findViewById<ViewGroup>(R.id.zip_block)
        zipBlock.findViewById<EditText>(R.id.edit_text).hint = getString(R.string.zip_hint)

        val birthdayBlock = findViewById<ViewGroup>(R.id.birthday_block)
        birthdayBlock.findViewById<EditText>(R.id.edit_text).hint = getString(R.string.birthday_hint)
        birthdayBlock.findViewById<ImageView>(R.id.icon).setImageResource(R.drawable.ic_calender_day_24)

        val notesBlock = findViewById<ViewGroup>(R.id.notes_block)
        notesBlock.findViewById<EditText>(R.id.edit_text).hint = getString(R.string.notes_hint)
        notesBlock.findViewById<ImageView>(R.id.icon).setImageResource(R.drawable.ic_mode_edit_24)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                Toast.makeText(this, "OnBackPressed", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}