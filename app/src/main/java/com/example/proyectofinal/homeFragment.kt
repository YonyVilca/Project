package com.example.proyectofinal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    class HomeFragment : Fragment() {

        private lateinit var recyclerViewCategoryList: RecyclerView
        private lateinit var recyclerViewPopularList: RecyclerView

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            val rootView = inflater.inflate(R.layout.fragment_home, container, false)

            recyclerViewCategoryList = rootView.findViewById(R.id.recyclerCategorias)
            recyclerViewPopularList = rootView.findViewById(R.id.recyclerPopular)

            setupRecyclerViews()

            return rootView
        }

        private fun setupRecyclerViews() {
            // Configurar el RecyclerView para categorías
            val layoutManagerCategory = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            recyclerViewCategoryList.layoutManager = layoutManagerCategory


            // Configurar el RecyclerView para elementos populares
            val layoutManagerPopular = LinearLayoutManager(requireContext())
            recyclerViewPopularList.layoutManager = layoutManagerPopular

        }
    }

}