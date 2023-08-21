package com.example.mad_practical_3_21012011096

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btnlogin: Button = findViewById(R.id.btn_login)
        val i = Intent(this,LoginActivity::class.java)
        btnlogin.setOnClickListener {
            startActivity(i)
        }
    }
}