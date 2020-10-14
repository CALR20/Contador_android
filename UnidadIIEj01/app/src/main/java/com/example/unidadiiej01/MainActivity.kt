package com.example.unidadiiej01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    /// Variable paracontar
    var cont: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ///Traigo los componentes de la vista
        val txtNum =findViewById<TextView>(R.id.txtNum)
        val btnContar = findViewById<Button>(R.id.btnContar)
        val btnReset = findViewById<Button>(R.id.btnResetear)

        btnContar.setOnClickListener{
            cont = cont.inc()
            txtNum.setText("$cont")
        }
        btnReset.setOnClickListener {
            cont = 0
            txtNum.setText("$cont")
        }
    }
}