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
        // Inicializa el BottomNavigationView
        val bottomNav: BottomNavigationView = findViewById(R.id.bottomnav)
        // Establece el listener para la selección de elementos en el BottomNavigationView
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navHome -> {
                    // Carga el HomeFragment cuando se selecciona el elemento Home en el menú
                    loadFragment(homeFragment())
                    true
                }
                R.id.navShop -> {
                    // Carga el ShopFragment cuando se selecciona el elemento Shop en el menú
                    loadFragment(ShopFragment())
                    true
                }
                R.id.navShopping -> {
                    // Carga el ShoppingFragment cuando se selecciona el elemento Shopping en el menú
                    loadFragment(ShoppingFragment())
                    true
                }
                else -> false
            }
        }


        // Carga el fragmento predeterminado al iniciar la actividad
        loadFragment(homeFragment())
    }
    // Función privada para cargar un fragmento en el contenedor principal
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            // Reemplaza el contenido del contenedor con el fragmento proporcionado
            replace(R.id.container, fragment)
            // Agrega el fragmento actual a la pila de retroceso
            addToBackStack(null)
            // Confirma la transacción
            commit()
        }
    }
}
