package com.example.hellotoastchallange

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var mCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvMessage = findViewById<TextView>(R.id.show_count)
        val btToast = findViewById<Button>(R.id.button_toast)
        val btCount = findViewById<Button>(R.id.button_count)
        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("mCount")
            tvMessage.text = mCount.toString()
        }
        btToast.setOnClickListener { v: View? ->
            mCount = 0
            tvMessage.text = mCount.toString()
            Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show()
        }
        btCount.setOnClickListener { v: View? ->
            mCount++
            tvMessage.text = mCount.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("mCount", mCount)
    }
}