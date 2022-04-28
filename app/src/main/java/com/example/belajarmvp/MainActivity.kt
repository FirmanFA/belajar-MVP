package com.example.belajarmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), IMainView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainPresenterImp = MainPresenterImp(this)

        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val etBil1 = findViewById<EditText>(R.id.editTextNumber)
        val etBil2 = findViewById<EditText>(R.id.editTextNumber2)
        btnHitung.setOnClickListener {
            val bil1 = etBil1.text.toString().toInt()
            val bil2 = etBil2.text.toString().toInt()
            val bilangan = Bilangan(bil1,bil2)
            mainPresenterImp.penjumlahan(bilangan)
            mainPresenterImp.pengurangan(bilangan)
        }

    }

    override fun hasilJumlah(hasil: Int) {
        val tvHasil = findViewById<TextView>(R.id.textView)
        tvHasil.text = "Hasil: $hasil"
    }

    override fun clearField() {
        val etBil1 = findViewById<EditText>(R.id.editTextNumber)
        val etBil2 = findViewById<EditText>(R.id.editTextNumber2)
        etBil1.text.clear()
        etBil2.text.clear()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}