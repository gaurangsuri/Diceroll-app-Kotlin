package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollbutton)
        val textview: TextView = findViewById(R.id.txt)
        val imageView: ImageView = findViewById(R.id.imageView)


                rollButton.setOnClickListener {
            var c: Int = (1..6).random()

            when(c){
                1->imageView.setImageResource(R.drawable.dice_1)
                2->imageView.setImageResource(R.drawable.dice_2)
                3->imageView.setImageResource(R.drawable.dice_3)
                4->imageView.setImageResource(R.drawable.dice_4)
                5->imageView.setImageResource(R.drawable.dice_5)
                6->imageView.setImageResource(R.drawable.dice_6)
            }
            textview.text=c.toString()
       // (rollno-name) :- 2010991251 -Gaurang


        }
    }
}