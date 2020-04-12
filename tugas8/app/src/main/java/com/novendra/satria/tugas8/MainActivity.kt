package com.novendra.satria.tugas8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Muhammad Kirdi",
        "Bobi Mikael",
        "Awanda Putra",
        "Novendra Satria",
        "Tyas Sasmita",
        "Rohmawati",
        "Puspasari",
        "Dhelian Aan",
        "Nurhadi",
        "Pak Angling",
        "Alex Nurdin",
        "Janu Putra",
        "Zaki Maliki"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size) {
            list.add(Users(listUsers.get(i)))
            if (listUsers.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
            }
        }
    }
}
