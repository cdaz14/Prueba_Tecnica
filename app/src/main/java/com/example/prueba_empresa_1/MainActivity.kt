package com.example.prueba_empresa_1

import android.os.Bundle
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        val n=findViewById<EditText>(R.id.eTn)
        val a=findViewById<EditText>(R.id.eTa)
        val r=findViewById<TextView>(R.id.textView)
        val btn_sum=findViewById<Button>(R.id.bTs)
        val btn_lim=findViewById<Button>(R.id.bTl)




        btn_sum .setOnClickListener{
            r.setText(
                "Hola"+ " " + (n.text.toString()) + " " + (a.text.toString())


            )
            n.setText("")
            a.setText("")
        }

        btn_lim .setOnClickListener {

            n.setText("")
            a.setText("")
            r.setText("")


        }


    }


}