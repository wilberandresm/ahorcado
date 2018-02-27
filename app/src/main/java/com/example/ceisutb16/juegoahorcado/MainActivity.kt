package com.example.ceisutb16.juegoahorcado

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import android.content.Intent

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        empezar.setOnClickListener{
            val inicio = Intent(this,gogame::class.java)
            startActivity(inicio)

        }

        salir.setOnClickListener{
            salir.setOnClickListener{
                AlertDialog.Builder(this)
                        .setTitle("Desea salir de la aplicacion?")
                        .setPositiveButton("Si") { dialog, which ->finish()
                        }
                        .setNegativeButton("No") { dialog, which -> dialog.dismiss() }
                        .show()

            }
        }

    }

}
