package com.senai.vsconnect_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
//databinding pega info do layout.
import com.senai.vsconnect_kotlin.databinding.ActivityLoginBinding
import com.senai.vsconnect_kotlin.models.Login

class LoginActivity : AppCompatActivity() {
    //é uma propriedade privada como o nome binding do tipo activityloginBinding
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Atribui à variável binding um objeto que contem referencias(propriedades)
        // aos elementos definidos no layout
        binding = ActivityLoginBinding.inflate(layoutInflater)

        binding.btnEntrar.setOnClickListener {
            //variável mainIntent com a intençãode sair do LoginActivity e ir para MainActivity
            val mainIntent = Intent(this@LoginActivity, MainActivity::class.java)

            //executa a intenção armazenada na variável mainTntent
            startActivity(mainIntent)

            //finaliza a loginActivity
            finish()
        }

        setContentView(binding.root)

    }

    private fun autenticarUsuario() {}
        val root: View = binding.root

        val idEmail = root.findViewById<EditText>(R.id.campo_email)
        val idSenha = root.findViewById<EditText>(R.id.campo_senha)

        val emailDigitado = idEmail.text.toString()
        val senhaDigitado = idSenha.text.toString()

        val usuario = Login(emailDigitado, senhaDigitado)
}