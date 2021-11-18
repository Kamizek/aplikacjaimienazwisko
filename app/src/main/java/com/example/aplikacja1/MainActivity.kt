package com.example.aplikacja1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<EditText>(R.id.editTextTextMultiLine).setText("Kamil \n Kozłowski")
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<EditText>(R.id.editTextTextMultiLine).setText(R.string.imienazwisko)

        }

    }
}