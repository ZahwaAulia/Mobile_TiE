package com.example.zahwa_3tie.Pertemuan_3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zahwa_3tie.R
import com.example.zahwa_3tie.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
     //   val inputnotujuan: EditText = findViewById(R.id.InputNoTujuan)
        // val btnkirim: Button = findViewById(R.id.btnkirim)

        binding.btnkirim.setOnClickListener {

            val intent = Intent(this, ThirdResultActivity::class.java)
            startActivity(intent)

            val nomor = binding.InputNoTujuan.text
            Log.i("Klik btnSubmit", "Tombol berhasil di tekan. Isi dari inputNama = $nomor")

            Toast.makeText(this, "Pesan berhasil dikirim ke  $nomor", Toast.LENGTH_SHORT).show()
        }
    }
}