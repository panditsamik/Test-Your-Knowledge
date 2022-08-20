package com.example.testyourknowledge

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

public class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var optionA : Button = findViewById(R.id.OptionA)
        var optionB : Button = findViewById(R.id.OptionB)
        var optionC : Button = findViewById(R.id.OptionC)
        var optionD : Button = findViewById(R.id.OptionD)

        var next : Button = findViewById(R.id.Next)

        optionA.setOnClickListener {
            optionA.setBackgroundColor(Color.RED)
            optionB.setBackgroundColor(Color.GREEN)
            Toast.makeText(this,"Oops! " +
                    "Option B : DIPHU, ASSAM is Correct",Toast.LENGTH_LONG).show()
        }
        optionB.setOnClickListener {
            optionB.setBackgroundColor(Color.GREEN)
            count++
            Toast.makeText(this,"Correct Answer",Toast.LENGTH_LONG).show()
        }
        optionC.setOnClickListener {
            optionC.setBackgroundColor(Color.RED)
            optionB.setBackgroundColor(Color.GREEN)
            Toast.makeText(this,"Oops! " +
                    "Option B : DIPHU, ASSAM is Correct",Toast.LENGTH_LONG).show()
        }
        optionD.setOnClickListener {
            optionD.setBackgroundColor(Color.RED)
            optionB.setBackgroundColor(Color.GREEN)
            Toast.makeText(this,"Oops! " +
                    "Option B : DIPHU, ASSAM is Correct",Toast.LENGTH_LONG).show()
        }

        next.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
    }
}
