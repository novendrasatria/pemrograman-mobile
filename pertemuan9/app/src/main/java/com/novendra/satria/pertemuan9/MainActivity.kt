package com.novendra.satria.pertemuan9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var tvScoreA: TextView
    lateinit var tvScoreB: TextView
    lateinit var btnPlayerA: Button
    lateinit var btnPlayerB: Button
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        mainViewModel =
            ViewModelProviders.of(this).get(MainViewModel::class.java)
        tvScoreA.text = mainViewModel.initialCountA.toString()
        tvScoreB.text = mainViewModel.initialCountB.toString()
    }
    private fun initView(){
        tvScoreA = findViewById(R.id.tvScorePlayerA)
        tvScoreB = findViewById(R.id.tvScorePlayerB)
        btnPlayerA = findViewById(R.id.btnPlayerA)
        btnPlayerB = findViewById(R.id.btnPlayerB)
        btnPlayerA.setOnClickListener(this)
        btnPlayerB.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id){
                R.id.btnPlayerA ->
                    tvScoreA.text = mainViewModel.currentCountA.toString()
                R.id.btnPlayerB ->
                    tvScoreB.text = mainViewModel.currentCountB.toString()
            }
        }
    }
}
