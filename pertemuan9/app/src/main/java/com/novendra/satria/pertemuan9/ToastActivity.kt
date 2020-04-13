package com.novendra.satria.pertemuan9

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ToastActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPlayerA = findViewById(R.id.btnPlayerA) as Button
        btnPlayerA.setOnClickListener{
            Toast.makeText(this, "Menambah Skor Pada Player A", Toast.LENGTH_LONG).show()

            var btnPlayerB = findViewById(R.id.btnPlayerB) as Button
            btnPlayerB.setOnClickListener {
                Toast.makeText(this, "Menambah Skor Pada Player B", Toast.LENGTH_LONG).show()
            }
        }
    }
}