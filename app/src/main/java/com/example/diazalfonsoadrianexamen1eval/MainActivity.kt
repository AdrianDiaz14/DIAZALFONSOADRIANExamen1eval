package com.example.diazalfonsoadrianexamen1eval

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.myapplication.TarjetaLugar
import com.example.myapplication.TarjetaLugarAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private val lugaresImages = mutableListOf(
        TarjetaLugar(R.drawable.image1, "Card1"),
        TarjetaLugar(R.drawable.image2, "Card2"),
        TarjetaLugar(R.drawable.image3, "Card3"),
        TarjetaLugar(R.drawable.image4, "Card4"),
        TarjetaLugar(R.drawable.image5, "Card5"),
        TarjetaLugar(R.drawable.image6, "Card6"),
        TarjetaLugar(R.drawable.image7, "Card7"),
        TarjetaLugar(R.drawable.image8, "Card8"),
        TarjetaLugar(R.drawable.image9, "Card9")
    )

    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.adapter = TarjetaLugarAdapter(lugaresImages)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

        val fabButton = findViewById<FloatingActionButton>(R.id.fab)
        //val buttonCancel = findViewById(R.id.button2) as Button


        fabButton.setOnClickListener {
            lanzarLayoutDos()
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "PlacesInTheWorld"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    fun lanzarLayoutDos() {
        val i = Intent(this, LayoutDos::class.java)
        startActivity(i)
    }
}