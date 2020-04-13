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

        var btn_click_me = findViewById(R.id.btnPlayerA) as Button
        btn_click_me.setOnClickListener{
            Toast.makeText(this, "Menambah Skor Pada Player A", Toast.LENGTH_LONG).show()

            var btn_click_me2 = findViewById(R.id.btnPlayerB) as Button
            btn_click_me2.setOnClickListener {
                Toast.makeText(this, "Menambah Skor Pada Player B", Toast.LENGTH_LONG).show()
            }
        }
    }
}