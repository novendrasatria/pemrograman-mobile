package com.novendra.satria.viewmodel9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var model: CommonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragments()

        model = ViewModelProviders.of(this).get(CommonViewModel::class.java)
        model.data.observe(this, Observer {
            tv_activity.text = it
        })
    }
    private fun setFragments(){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_one,FragmenOne()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_two,FragmentTwo()).commit()
    }
}
