package com.example.labo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fivecentesImageView: ImageView
    private lateinit var cashTextView: TextView
    private lateinit var tencentesImageView: ImageView
    private lateinit var coracentesImageView: ImageView
    private lateinit var dolarcentesImageView: ImageView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fivecentesImageView = findViewById(R.id.five_centes_image_view)
        cashTextView = findViewById(R.id.cash_text_view)
        tencentesImageView = findViewById(R.id.ten_centes_image_view)
        coracentesImageView = findViewById(R.id.cora_centes_image_view)
        dolarcentesImageView = findViewById(R.id.dolar_centes_image_view)

        tencentesImageView.setOnClickListener {
            cash += 0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "${cash}"
        }
        fivecentesImageView.setOnClickListener {
            cash += 0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "${cash}"
        }
        coracentesImageView.setOnClickListener {
            cash += 0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "${cash}"
        }
        dolarcentesImageView.setOnClickListener {
            cash += 1.0
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "${cash}"
        }

    }
}