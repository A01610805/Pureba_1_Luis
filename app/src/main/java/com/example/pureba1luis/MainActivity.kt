package com.example.pureba1luis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTxtNombre = findViewById<EditText>(R.id.txtNombre)
        val myNumEdad = findViewById<EditText>(R.id.numEdad)
        val myButtonSubmit = findViewById<Button>(R.id.button)

        myButtonSubmit.setOnClickListener {
            var Nombre : String = myTxtNombre.text.toString()
            var edad : Int = parseInt(myNumEdad.text.toString())

            val myIntent = Intent(this, MainActivity2::class.java)
            myIntent.putExtra("keyNombre", Nombre)
            myIntent.putExtra("keyEdad", edad)
            startActivity(myIntent)
        }

        Log.d("Prueba 1 Luis","Fin de la ejecución de onCreate de Main Activity")

    }
    override fun onStart(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onStart de Main Activity")
        super.onStart()
    }

    override fun onPause(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onPause de Main Activity")
        super.onPause()
    }

    override fun onResume(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onResume de Main Activity")
        super.onResume()
    }

    override fun onStop(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onStop de Main Activity")
        super.onStop()
    }

    override fun onDestroy(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onDestroy de Main Activity")
        super.onDestroy()
    }

    override fun onRestart(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onRestart de Main Activity")
        super.onRestart()
    }
}




