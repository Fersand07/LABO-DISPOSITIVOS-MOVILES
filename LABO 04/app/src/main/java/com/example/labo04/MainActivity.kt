package com.example.labo04

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputEditText
    private lateinit var correoEditText: TextInputEditText
    private lateinit var numeroEditText: TextInputEditText
    private lateinit var actionNext: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        correoEditText = findViewById(R.id.Input_email)

        numeroEditText = findViewById(R.id.Input_number)
        nameEditText = findViewById(R.id.Input_name)
        actionNext = findViewById(R.id.save_button)

        actionNext.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("email", correoEditText.text.toString())
            intent.putExtra("number", numeroEditText.text.toString())
            startActivity(intent)

        }
    }
}