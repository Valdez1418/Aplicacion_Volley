package com.valdez.nuevanueva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.valdez.nuevanueva.adaptador.Adaptador_personaje
import com.valdez.nuevanueva.personaje.Personaje1

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista_Personajes = ArrayList<Personaje1>()


        lista_Personajes.add(Personaje1("Mario","https://mario.nintendo.com/static/908b49b78a35561f154527804283c517/slide-mpss-0.png"))
        lista_Personajes.add(Personaje1("Gonzo","https://www.infobae.com/new-resizer/9TD3GH_6Pj0reAPCCCsJysKaFQU=/1200x628/filters:format(webp):quality(85)//cloudfront-us-east-1.images.arcpublishing.com/infobae/2CFIYULIW5D6TJMNQNRNI6XUVY.jpg"))

        miRecycler = findViewById(R.id.recyclerPersonaje)

        miRecycler.adapter = Adaptador_personaje(lista_Personajes)
        miRecycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }

    fun getPersonajes(){

        val queue = Volley.newRequestQueue(this)
        val url = "https://rickandmortyapi.com/api/character"




    }

}