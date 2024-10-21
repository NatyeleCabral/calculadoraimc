package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        //Criar variavel e associar o componente de UI<EditText>

        //Colocar ação no botão

        val edtpeso = findViewById<TextInputEditText>(R.id.text_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.text_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {

            val pesoStr: String = edtpeso.text. toString()
            val alturaStr: String = edtaltura.text. toString()

            if (pesoStr == "" || alturaStr == "") {
                //Mostrar mensagem para o usuario

                Snackbar.make(edtpeso,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                ).show()
            }else{
                val peso= pesoStr. toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2
                println("Natyele" + resultado)
            }


        }
    }
}