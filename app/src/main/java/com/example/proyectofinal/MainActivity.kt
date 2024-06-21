package com.example.proyectofinal;


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar Navigation Component
        // Busca el fragmento del host de navegación en el layout y obtiene el NavController
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        // Configurar BottomNavigationView para la navegación entre fragmentos
        // Encuentra el BottomNavigationView por su ID
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomnav)
        // Establece un listener para los elementos seleccionados en el BottomNavigationView
        bottomNav.setOnItemSelectedListener { item ->
            // Usa un when para manejar la navegación basada en el ID del ítem seleccionado
            when (item.itemId) {
                R.id.navHome -> {
                    // Navega al fragmento del inicio
                    navController.navigate(R.id.homeFragment)
                    true
                }
                R.id.navShop -> {
                    // Navega al fragmento de la tienda
                    navController.navigate(R.id.shopFragment)
                    true
                }
                R.id.navShopping -> {
                    // Navega al fragmento del carrito de compras
                    navController.navigate(R.id.shoppingFragment)
                    true
                }
                else -> false
            }
        }
    }
    // Sobrescribe el método onSupportNavigateUp para manejar la navegación hacia arriba
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}