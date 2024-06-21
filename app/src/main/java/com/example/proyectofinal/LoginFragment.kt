package com.example.proyectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.proyectofinal.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar y vincular el layout usando View Binding
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val rootView = binding.root

        // Configurar OnClickListener para el botón de inicio de sesión
        binding.buttonLogin.setOnClickListener {
            // Validar el inicio de sesión (aquí deberías realizar la lógica de validación)

            // Navegar hacia HomeFragment si el inicio de sesión es exitoso
            navigateToHomeFragment()
        }

        // Inicializar NavController desde el NavHostFragment
        navController = findNavController()

        return rootView
    }

    private fun navigateToHomeFragment() {
        // Navegar hacia HomeFragment usando el NavController
        navController.navigate(R.id.action_loginFragment_to_homeFragment)
    }
}