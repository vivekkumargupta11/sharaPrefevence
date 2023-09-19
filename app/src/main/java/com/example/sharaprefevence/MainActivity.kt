package com.example.sharaprefevence

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.enter_name)
        val email = findViewById<EditText>(R.id.enter_email)
        val  save= findViewById<Button>(R.id.next_button)
        val show = findViewById<Button>(R.id.show_button)

        val localStorage = getSharedPreferences("user", Context.MODE_PRIVATE)

        save.setOnClickListener {
            val editPref = localStorage.edit()
            editPref.putString("userName",""+name.text.toString())
            editPref.putString("userEmail",""+email.text.toString()).apply()
        }
        show.setOnClickListener {

            val intent = Intent(this,secendActivity2::class.java)
            startActivity(intent)

        }
    }
}