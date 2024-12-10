package com.example.diazalfonsoadrianexamen1eval

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LayoutDos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_dos)

        val chipGroup = findViewById<ChipGroup>(R.id.chipGroup)
        val titulo = findViewById<TextView>(R.id.textPointsOfInterest)
        titulo.typeface = ResourcesCompat.getFont(this, R.font.saltyocean)

        //Muestra un Toast con el nombre del item seleccionado en el ChipGroup
        chipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            if (checkedIds.isNotEmpty()) {
            val chipSeleccionado = findViewById<Chip>(checkedIds[0])
            val chipText = chipSeleccionado.text.toString()
            Toast.makeText(this, "$chipText", Toast.LENGTH_SHORT).show()
            }
        }

        val experiences = arrayOf("Adventures", "Guided visits", "Trekking")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, experiences)

        val list_experiences = findViewById(R.id.spinner) as Spinner
        list_experiences.adapter = adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val fabButtonBack = findViewById<FloatingActionButton>(R.id.fabBack)

        fabButtonBack.setOnClickListener {
            lanzarMainActivity()
        }
    }
    fun lanzarMainActivity() {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}