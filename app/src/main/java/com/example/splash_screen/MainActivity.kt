package com.example.splash_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val up_to_down = AnimationUtils.loadAnimation(this,R.anim.up_to_down)
        val down_to_up = AnimationUtils.loadAnimation(this,R.anim.down_to_up)

        val imageview = findViewById<ImageView>(R.id.image)
        val textview = findViewById<TextView>(R.id.textview)

        imageview.startAnimation(up_to_down)
        textview.startAnimation(down_to_up)
    }
}