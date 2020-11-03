package com.android.aprendendokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var drawNumber : TextView
    lateinit var drawBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeComponents()

        drawBtn.setOnClickListener {
            drawNumber()
        }
    }

    fun initializeComponents(){
        drawNumber = findViewById(R.id.textView_drawNumber)
        drawBtn = findViewById(R.id.button_draw)
    }

    fun drawNumber(){
        val drawNumber = Random().nextInt(11)
        this.drawNumber.text = drawNumber.toString()
    }
}