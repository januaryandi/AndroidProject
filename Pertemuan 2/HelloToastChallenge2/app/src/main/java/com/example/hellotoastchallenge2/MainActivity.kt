package com.example.hellotoastchallenge2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var mCount = 0
    private var mShowCount: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById<View>(R.id.show_count) as TextView
    }

    fun showToast(view: View?) {
        mCount = 0
        mShowCount!!.text = mCount.toString()
        val toast: Toast = Toast.makeText(
            this, R.string.toast_message,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }

    fun countUp(view: View?) {
        mCount++
        if (mShowCount != null) mShowCount!!.text = Integer.toString(mCount)
    }
}