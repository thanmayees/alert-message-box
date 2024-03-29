package com.example.alertmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
//set title for alert dialog
            builder.setTitle("Delete File")
//set message for alert dialog
            builder.setMessage("Deleting file would harm the system")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes"){dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
            }
//performing cancel action
            builder.setNeutralButton("Cancel"){dialogInterface , which ->
                finish()
            }
//performing negative action
            builder.setNegativeButton("No"){dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
            }
// Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
// Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}