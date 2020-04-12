package com.novendra.satria.tugas8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class Adapter (private val list:ArrayList<Users>): RecyclerView.Adapter<Adapter.Holder>(){

    override  fun onCreateViewHolder(parent: ViewGroup, vireType: Int): Holder{
        return  Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int =list.size
    override fun onBindViewHolder(holder: Adapter.Holder, position: Int) {
        holder.view.ibList.text = list.get(position).name
    }
    class  Holder(val view: View) : RecyclerView.ViewHolder(view)
}