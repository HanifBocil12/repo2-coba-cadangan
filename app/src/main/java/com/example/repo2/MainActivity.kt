package com.example.repo2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        var etName =;
        var button = findViewById<Button>(R.id.button3)
        button.setOnClickListener()
        {

            Intent(this, layout2::class.java).also { it ->
                startActivity(it)
            }
        }


//        button.setOnClickListener()
//        {
//            Intent(this,layout2::class.java).also { it ->
//                startActivity(it)
//            }
//        }
    }
}