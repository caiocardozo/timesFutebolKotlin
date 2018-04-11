package com.caio.caiocardozo.timesfutebolkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textBrasileiro: TextView = findViewById(R.id.textBrasileiro)

        textBrasileiro.setOnClickListener {
            val intent = Intent(this, CBrasileiroActivity::class.java)
            startActivity(intent)
        }

        val textIngles: TextView = findViewById(R.id.textIngles)

        textIngles.setOnClickListener{
            val intent = Intent(this, CInglesActivity::class.java)
            startActivity(intent)
        }

        val textEspanhol: TextView = findViewById(R.id.textEspanhol)

        textEspanhol.setOnClickListener {
            val intent = Intent(this, CEspanholActivity::class.java)
            startActivity(intent)
        }

        val textItaliano: TextView = findViewById(R.id.textItaliano)

        textItaliano.setOnClickListener {
            val intent = Intent(this, CItalianoActivity::class.java)
            startActivity(intent)
        }

        val textAlemao: TextView = findViewById(R.id.textAlemao)

        textAlemao.setOnClickListener {
            val intent = Intent(this, CAlemaoActivity::class.java)
            startActivity(intent)
        }
    }
}
