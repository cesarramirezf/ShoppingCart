package com.wiedii.shoppingcart.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.wiedii.shoppingcart.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contentFragment = ContentFragment()
        val cartFragment = CartFragment()
        val infoFragment = InfoFragment ()

        replaceFragment(ContentFragment())

        val ivShoppingCart = findViewById<ImageView>(R.id.iv_shopping_cart_toolbar)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.ic_home -> replaceFragment(contentFragment)
                R.id.ic_shop -> replaceFragment(cartFragment)
                R.id.ic_info -> replaceFragment(infoFragment)
            }
        }

        ivShoppingCart.setOnClickListener{ replaceFragment(CartFragment()) }
    }

    private fun replaceFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
}