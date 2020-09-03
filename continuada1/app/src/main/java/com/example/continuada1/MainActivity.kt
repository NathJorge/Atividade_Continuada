package com.example.continuada1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun botao(componente:View){

        val valor1 = texto_7.text.toString().toInt()
        val valor2 = texto_5.text.toString().toInt()
        val nome = texto_2.text.toString().toString()

        val resultado = valor1 - valor2

        val frase = when (resultado){
            0 -> "Cara, você nem nasceu ainda."
            1,2,3,4,5 -> "Cut cut, que fofinho."
            in 6..15 -> "Essa idade é top! Aproveita em."
            in 16..25 -> "Idade das baladas, cuidado em!"
            in 26 ..Int.MAX_VALUE -> "Vixi, aqui paramos de contar..."
            else -> "Normal"
        }

        if (texto_2.length() < 3){
            Toast.makeText(this, "Isso é um apelido? Por favor digite seu nome.",
                Toast.LENGTH_SHORT).show()

        }

        if (texto_5.length() < 4 || texto_5.length() >= 5) {
            Toast.makeText(this, "Epa! Um ano possui 4 digitos",
                Toast.LENGTH_SHORT).show()
        }

        if (texto_7.length() < 4 || texto_7.length() >= 5){
            Toast.makeText(this, "Epa! Um ano possui 4 digitos",
                Toast.LENGTH_SHORT).show()
        }

        else {
                if(resultado < 15) {
                    texto_8.text = " $nome sua idade é $resultado. $frase"
                    texto_8.setTextColor(Color.BLUE)
                }

            else{

                    texto_8.text = " $nome sua idade é $resultado. $frase"
                    texto_8.setTextColor(Color.GRAY)

            }

        }


    }
}