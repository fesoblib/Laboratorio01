package com.example.laboratorio01

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var apellidoPaterno: EditText
    lateinit var apellidoMaterno: EditText
    lateinit var nombre: EditText
    lateinit var fechaNacimiento: EditText
    lateinit var colegio: EditText
    lateinit var carrera: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById(R.id.button) as Button
        boton.setOnClickListener{
            apellidoPaterno = findViewById(R.id.editTextTextPersonName)
            apellidoMaterno = findViewById(R.id.editTextTextPersonName2)
            nombre = findViewById(R.id.editTextTextPersonName3)
            fechaNacimiento = findViewById(R.id.editTextTextPersonName4)
            colegio = findViewById(R.id.editTextTextPersonName5)
            carrera = findViewById(R.id.editTextTextPersonName6)
            Log.d(TAG,"\nApellido Paterno: "+apellidoPaterno.text.toString()+
                    "\nApellido Materno: "+apellidoMaterno.text.toString()+
                    "\nNombre: "+nombre.text.toString()+
                    "\nFecha de Nacimiento: "+fechaNacimiento.text.toString()+
                    "\nColegio: "+colegio.text.toString()+
                    "\nCarrera: "+carrera.text.toString()
            )
        }
    }

}