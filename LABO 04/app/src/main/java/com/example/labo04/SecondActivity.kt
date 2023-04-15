package com.example.labo04

import android.content.Intent
import android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {

    private lateinit var shareInformationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameTextView = findViewById<TextView>(R.id.name_textview)
        val emailTextView = findViewById<TextView>(R.id.email_textview)
        val numberTextView = findViewById<TextView>(R.id.number_textview)
        shareInformationButton = findViewById(R.id.share_button)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val number = intent.getStringExtra("number")

        nameTextView.text = name
        emailTextView.text = email
        numberTextView.text = number


        shareInformationButton.setOnClickListener{

            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Name: $name\nEmail: $email\nCellphone: $number\n")
            startActivity(Intent.createChooser(shareIntent, "Share to:"))
        }
    }
}