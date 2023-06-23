package com.example.viewsapps

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    @RequiresApi(Build.VERSION_CODES.O)
    var counterValue: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.Heading)
        var subHeading: TextView = findViewById(R.id.SubHeading)
        val btn = findViewById<Button>(R.id.click) as Button


        var profieImg: ImageView = findViewById(R.id.profile)
        var btn_bg: Int = 1

        val increase = findViewById<Button>(R.id.increase) as Button
        val decrease = findViewById<Button>(R.id.decrease) as Button
        val reset = findViewById<Button>(R.id.reset) as Button

        var counterText: TextView = findViewById(R.id.counterText)

        reset.setOnClickListener {
            counterText.text = resetValue()
        }

        decrease.setOnClickListener {
            if (counterValue > 0) {
                counterText.text = decrementConter()
            }
        }
        increase.setOnClickListener {
            if (counterValue >= 0) {
                counterText.text = increateConter()
            }
        }

        btn.setOnClickListener {
            var text: String = textView.text.toString()
            if (btn_bg == 1) {
                btn.setBackgroundColor(Color.BLUE)
                textView.setTextColor(Color.parseColor("#a83232"))
                subHeading.setTextColor(Color.RED)
                btn.setTextColor(Color.WHITE)
                profieImg.setImageResource(R.drawable.bg2)
                btn_bg += 1
            } else {
                btn.setBackgroundColor(Color.BLACK)
                textView.setTextColor(Color.parseColor("#57a832"))
                subHeading.setTextColor(Color.BLACK)
                btn.setTextColor(Color.RED)
                profieImg.setImageResource(R.drawable.cherry_1380021)
                btn_bg -= 1
            }
            Toast.makeText(this, text, Toast.LENGTH_LONG).show()


        }
    }

    fun increateConter(): String {
        counterValue += 1
        return " $counterValue"
    }

    fun decrementConter(): String {
        counterValue -= 1
        return "$counterValue"
    }

    fun resetValue(): String {
        counterValue = 0
        return "$counterValue"
    }
}


