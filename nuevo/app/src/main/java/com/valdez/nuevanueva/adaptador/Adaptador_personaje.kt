package com.valdez.nuevanueva.adaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.valdez.nuevanueva.R
import com.valdez.nuevanueva.personaje.Personaje1


class Adaptador_personaje (val lista_Personjes:ArrayList<Personaje1>):RecyclerView.Adapter<Adaptador_personaje.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.vistarecicle, parent, false)

        return ViewHolder(view)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvNombre.text = lista_Personjes[position].nombre
        Picasso.get().load(lista_Personjes[position].foto).into(holder.ivFoto)


    }

    override fun getItemCount(): Int {


        return lista_Personjes.size

    }

    class ViewHolder(vista: View):RecyclerView.ViewHolder(vista){
        val tvNombre:TextView
        val ivFoto:ImageView

        init {
            tvNombre = vista.findViewById(R.id.iden)
            ivFoto = vista.findViewById(R.id.idfoto)


        }


    }

}