package com.example.repo2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class layout2:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        val etName = findViewById<TextView>(R.id.textView)
        val etId = findViewById<TextView>(R.id.textView2)

        val valName = intent.getStringExtra("e_name")
        val valId = intent.getStringExtra("e_id")
        val button = findViewById<Button>(R.id.button2)


        etName.text = "Nama: $valName"
        etId.text = "Id: $valId"
    }
}