package com.example.proyectofinal;


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottomnav)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navHome -> {
                    loadFragment(homeFragment())
                    true
                }
                R.id.navShop -> {
                    loadFragment(ShopFragment())
                    true
                }
                R.id.navShopping -> {
                    loadFragment(ShoppingFragment())
                    true
                }
                else -> false
            }
        }


        // Load the default fragment
        loadFragment(homeFragment())
    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            addToBackStack(null)
            commit()
        }
    }
}
