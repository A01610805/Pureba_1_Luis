package com.example.pureba1luis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myTxtNombre = findViewById<TextView>(R.id.textView4)
        val myNumEdad = findViewById<TextView>(R.id.textView6)
        val botonRegresar = findViewById<Button>(R.id.button2)

        var myExtras : Bundle? = intent.extras

        var nombreRecibido : String = myExtras?.getString("keyNombre")?:"NoName"
        var edadRecibida : Int = myExtras?.getInt("keyEdad")?:-1

        myTxtNombre.text = nombreRecibido
        myNumEdad.text = edadRecibida.toString()

        botonRegresar.setOnClickListener{
            val myIntent : Intent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

        Log.d("Prueba 1 Luis","Fin de la ejecución de onCreate de Main Activity 2")

    }

    override fun onStart(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onStart de Main Activity 2")
        super.onStart()
    }

    override fun onPause(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onPause de Main Activity 2")
        super.onPause()
    }

    override fun onResume(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onResume de Main Activity 2")
        super.onResume()
    }

    override fun onStop(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onStop de Main Activity 2")
        super.onStop()
    }

    override fun onDestroy(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onDestroy de Main Activity 2")
        super.onDestroy()
    }

    override fun onRestart(){
        Log.d("Prueba 1 Luis","Fin de la ejecución de onRestart de Main Activity 2")
        super.onRestart()
    }

}