package com.novendra.satria.praktikumrecycleview

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ToastActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list)

        var btn_click_me = findViewById(R.id.ibList) as Button

        btn_click_me.setOnClickListener{
            Toast.makeText(this, "Hey ini adalah Toast, Baby!", Toast.LENGTH_LONG).show()
        }
    }
}