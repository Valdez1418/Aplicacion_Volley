package com.valdez.navegacinkico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class BlankFragment2 : Fragment() {

    lateinit var boton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_blank2, container, false)
        boton = vista.findViewById(R.id.boton2)
        boton.setOnClickListener {
            findNavController().navigate(R.id.dosauno)
        }

        return vista
    }


}