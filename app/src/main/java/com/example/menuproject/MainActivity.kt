package com.example.menuproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// Step 1 -> Design in XML
// Step 2 -> Create meny directory/folder and inside this folder create menu resource file
// Step 3 -> Create a class for Menu options
// Step 4 -> Add Menu in Main item

class MainActivity : AppCompatActivity() {

    val customMenu = com.example.menuproject.CustomMenu()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showPopUp = findViewById<Button>(R.id.button)

        showPopUp.setOnClickListener {
            customMenu.customeMenu(this, it)
        }
    }
}