package com.example.myrestaurantonline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pedido.*

class pedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val bundle = intent.extras
        val articulos = bundle?.get("articulos")
        val eltotal = bundle?.get("total")











pediste.text=articulos.toString()
total.text="El total a pagar es de: "+eltotal.toString()

    }
}