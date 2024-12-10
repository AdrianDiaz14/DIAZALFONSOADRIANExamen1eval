package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.diazalfonsoadrianexamen1eval.R

class TarjetaLugarAdapter(val lugaresImagesList:List<TarjetaLugar>) : RecyclerView.Adapter<LugarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LugarViewHolder(layoutInflater.inflate(R.layout.item_lugar, parent, false))
    }

    override fun onBindViewHolder(holder: LugarViewHolder, position: Int) {
        val item = lugaresImagesList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return lugaresImagesList.size
    }
}