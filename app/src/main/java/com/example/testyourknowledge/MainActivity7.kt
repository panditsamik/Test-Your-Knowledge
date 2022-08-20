package com.example.testyourknowledge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

public class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        var text : TextView = findViewById(R.id.display)
        var text1 : TextView = findViewById(R.id.display1)

        text.setText("Congratulations " + carry)
        text1.setText("YOUR SCORE  : " + count + " / 5")
    }
}
