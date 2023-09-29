package otus.gpb.homework.viewandresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        supportActionBar?.apply {
            setHomeAsUpIndicator(R.drawable.ic_arrow_back_24)
            setDisplayHomeAsUpEnabled(true)
        }

        val itemsCountTextView = findViewById<TextView>(R.id.items_in_cart_count)
        itemsCountTextView.text = getString(R.string.items_count_in_your_cart, "4")

        val item1 = findViewById<ViewGroup>(R.id.item_1)
        item1.apply {
            findViewById<ImageView>(R.id.item_image).setImageResource(R.drawable.donut)
            findViewById<TextView>(R.id.item_title).text = getString(R.string.donut)
            findViewById<TextView>(R.id.item_price).text = getString(R.string.item_price, "1.50")
        }
        val item2 = findViewById<ViewGroup>(R.id.item_2)
        item2.apply {
            findViewById<ImageView>(R.id.item_image).setImageResource(R.drawable.gingerbread)
            findViewById<TextView>(R.id.item_title).text = getString(R.string.gingerbread)
            findViewById<TextView>(R.id.item_price).text = getString(R.string.item_price, "4.50")
        }
        val item3 = findViewById<ViewGroup>(R.id.item_3)
        item3.apply {
            findViewById<ImageView>(R.id.item_image).setImageResource(R.drawable.honeycomb)
            findViewById<TextView>(R.id.item_title).text = getString(R.string.honeycomb)
            findViewById<TextView>(R.id.item_price).text = getString(R.string.item_price, "8.00")
        }
        val item4 = findViewById<ViewGroup>(R.id.item_4)
        item4.apply {
            findViewById<ImageView>(R.id.item_image).setImageResource(R.drawable.lollipop)
            findViewById<TextView>(R.id.item_title).text = getString(R.string.lollipop)
            findViewById<TextView>(R.id.item_price).text = getString(R.string.item_price, "14.00")
        }
        val item5 = findViewById<ViewGroup>(R.id.item_5)
        item5.apply {
            findViewById<ImageView>(R.id.item_image).setImageResource(R.drawable.oreo)
            findViewById<TextView>(R.id.item_title).text = getString(R.string.oreo)
            findViewById<TextView>(R.id.item_price).text = getString(R.string.item_price, "22.00")
        }

        val orderTotalLine = findViewById<ViewGroup>(R.id.order_total)
        orderTotalLine.findViewById<TextView>(R.id.line_title).apply {
            text = getString(R.string.order_total)
        }
        orderTotalLine.findViewById<TextView>(R.id.line_sum).apply {
            text = "55.50"
        }

        val subtotalLine = findViewById<ViewGroup>(R.id.subtotal)
        subtotalLine.findViewById<TextView>(R.id.line_title).apply {
            text = getString(R.string.subtotal)
        }
        subtotalLine.findViewById<TextView>(R.id.line_sum).apply {
            text = "50.00"
        }

        val shippingLine = findViewById<ViewGroup>(R.id.shipping)
        shippingLine.findViewById<TextView>(R.id.line_title).apply {
            text = getString(R.string.shipping)
        }
        shippingLine.findViewById<TextView>(R.id.line_sum).apply {
            text = "2.00"
        }

        val taxLine = findViewById<ViewGroup>(R.id.tax)
        taxLine.findViewById<TextView>(R.id.line_title).apply {
            text = getString(R.string.tax)
        }
        taxLine.findViewById<TextView>(R.id.line_sum).apply {
            text = "3.50"
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                Toast.makeText(this, "Cart OnBackPressed", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.cart_action_bar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}