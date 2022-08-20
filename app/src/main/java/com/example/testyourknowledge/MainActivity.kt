package com.example.testyourknowledge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
public var carry : String = ""
public var count : Int = 0
public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"WELCOME TO TEST YOUR KNOWLEDGE",Toast.LENGTH_LONG).show()
        var start : Button = findViewById(R.id.Start)
        var inputtext : EditText = findViewById(R.id.InputText)
        start.setOnClickListener {
            if (inputtext.text.isEmpty()){
                Toast.makeText(this,"Please Enter a Valid Name!",Toast.LENGTH_LONG).show()
            }
            else{
                carry = inputtext.text.toString()
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
