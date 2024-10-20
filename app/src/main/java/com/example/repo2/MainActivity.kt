package com.example.repo2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.passing_data_between)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main3)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var etId = findViewById<TextView>(R.id.etId).text
        var etName = findViewById<TextView>(R.id.etName).text
        var btn_swap = findViewById<Button>(R.id.btn_swap)
        var btn_save = findViewById<Button>(R.id.btn_sv)
        btn_save.setOnClickListener()
        {

            Intent(this, layout2::class.java).also { it ->
                it.putExtra("e_name",etName.toString())
                it.putExtra("e_id",etId.toString())
            }
        }

        btn_swap.setOnClickListener()
        {
            Intent(this,layout2::class.java).also {
                startActivity(it)
            }
//            startActivity(AppCompatActivity(),layout2::class.java)
        }


//        button.setOnClickListener()
//        {
//            Intent(this,layout2::class.java).also { it ->
//                startActivity(it)
//            }
//        }
    }
}