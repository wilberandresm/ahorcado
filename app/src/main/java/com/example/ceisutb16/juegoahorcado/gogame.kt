package com.example.ceisutb16.juegoahorcado

import android.app.Activity

import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_gogame.*


class gogame : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gogame)

        aleatorio.setOnClickListener{
            val ale = Intent(this,play::class.java)
            startActivity(ale)

        }

        cosas.setOnClickListener{
            val co = Intent(this,com.example.ceisutb16.juegoahorcado.cosas::class.java)
            startActivity(co)

        }

        musica.setOnClickListener{
            val mu= Intent(this,com.example.ceisutb16.juegoahorcado.musica::class.java)
            startActivity(mu)

        }
        animales.setOnClickListener{
            val ani = Intent(this,com.example.ceisutb16.juegoahorcado.animales::class.java)
            startActivity(ani)

        }
       peliculas.setOnClickListener{
            val pelis = Intent(this,com.example.ceisutb16.juegoahorcado.peliculas::class.java)
            startActivity(pelis)

        }

        nombres.setOnClickListener{
            val nom= Intent(this,com.example.ceisutb16.juegoahorcado.nombres::class.java)
            startActivity(nom)

        }





    }
}
