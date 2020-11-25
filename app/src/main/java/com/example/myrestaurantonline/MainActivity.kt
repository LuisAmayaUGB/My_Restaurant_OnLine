package com.example.myrestaurantonline

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var pizza: CheckBox
    lateinit var coffee: CheckBox
    lateinit var burger: CheckBox
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "KotlinApp"
        pizza = findViewById(R.id.checkBox1)
        coffee = findViewById(R.id.checkBox2)
        burger = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)


        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Selected Items")
            if (pizza.isChecked) {
                result.append("\nPizza \$100")
                totalAmount += 100
            }
            if (coffee.isChecked) {
                result.append("\nCoffee \$50")
                totalAmount += 50
            }
            if (burger.isChecked) {
                result.append("\nBurger $120")
                totalAmount += 120
            }

            val intent = Intent(this, pedido::class.java)
            intent.putExtra("articulos", result.toString())
            intent.putExtra("total",totalAmount)


            startActivity(intent)


            result.append("\nTotal: " + totalAmount + "$")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}