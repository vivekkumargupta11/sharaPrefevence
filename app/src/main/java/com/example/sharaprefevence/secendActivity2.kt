package com.example.sharaprefevence

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class secendActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secend2)

        val localStorage = getSharedPreferences("user", Context.MODE_PRIVATE)

        val getname = localStorage.getString("userName","name not Found")
        val getemail = localStorage.getString("userEmail","email not Found")

        val name1 =findViewById<TextView>(R.id.name)
        val email1 =findViewById<TextView>(R.id.email)

        name1.text = getname.toString()
        email1.text = getemail.toString()

        Toast.makeText(this,"$getname",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"$getemail",Toast.LENGTH_SHORT).show()

    }
}