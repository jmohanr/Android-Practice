package com.example.viewsapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.Heading)
        /*
text.setText("Hello Welcome to Andriod")
text.setTextColor(ContextCompat.getColor(this,R.color.black))
text.setTextSize(TypedValue.COMPLEX_UNIT_SP,50F)
text.textAlignment = View.TEXT_ALIGNMENT_CENTER
*/

    }
}