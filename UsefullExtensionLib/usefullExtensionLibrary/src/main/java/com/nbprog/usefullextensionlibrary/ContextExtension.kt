package com.nbprog.usefullextensionlibrary

import android.content.Context
import android.widget.Toast

/**
 * Show toast (duration basic val Toast.LENGTH_SHORT)
 */
fun Context.showToast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}