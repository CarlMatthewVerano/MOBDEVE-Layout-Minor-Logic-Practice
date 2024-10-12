package com.mobdeve.s11.verano.carl.non_gradedexercise_layoutminorlogicpractice

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var fab1_btn: FloatingActionButton;
    lateinit var fab2_btn: FloatingActionButton;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fab1_btn = findViewById(R.id.floatingActionButton);
        fab2_btn = findViewById(R.id.floatingActionButton2);

        fab1_btn.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Adding S16...",
                Toast.LENGTH_SHORT
            ).show();
        }

        fab2_btn.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Adding S15...",
                Toast.LENGTH_SHORT
            ).show();
        }
    }
}