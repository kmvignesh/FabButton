package com.example.vicky.fabbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar.progress = 23

        fab.setOnClickListener {
            progressBar.progress = (progressBar.progress + 5) % 100
        }

    }
}
