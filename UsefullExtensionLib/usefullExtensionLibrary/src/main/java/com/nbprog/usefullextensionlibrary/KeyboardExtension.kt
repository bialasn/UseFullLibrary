package com.nbprog.usefullextensionlibrary

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * Show  a keyboard from View
 */
fun View.showKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.showSoftInput(this, 0)
    imm.toggleSoftInput(InputMethodManager.RESULT_SHOWN, 0)
}

/**
 * Hide  a keyboard from View
 */
fun View.hideKeyboard(): Boolean {
    try {
        val inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        return inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    } catch (ignored: RuntimeException) {
    }
    return false
}
