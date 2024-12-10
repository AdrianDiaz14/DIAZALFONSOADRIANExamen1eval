package com.example.myapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.diazalfonsoadrianexamen1eval.R

class LugarViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val imagen: ImageView = itemView.findViewById(R.id.imageView)
    val titulo = view.findViewById<TextView>(R.id.imageName)


    fun bind(lugarModel:TarjetaLugar) {
        imagen.setImageResource(lugarModel.imagenLugar)
        titulo.text = lugarModel.nombre

    }
}