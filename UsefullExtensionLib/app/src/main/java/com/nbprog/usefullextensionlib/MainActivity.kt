package com.nbprog.usefullextensionlib

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nbprog.usefullextensionlibrary.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setShowHideOnClickListener()
        convertTestLog()
    }

    private fun setShowHideOnClickListener() {
        showKeyboard.setOnClickListener {
            it.showKeyboard()
        }
        hideKeyboard.setOnClickListener {
            it.hideKeyboard()
        }
    }

    private fun convertTestLog() {
        Log.i("convert Int to dp", 10.dp.toString())
        Log.i("convert Int to px", 10.px.toString())
    }
}