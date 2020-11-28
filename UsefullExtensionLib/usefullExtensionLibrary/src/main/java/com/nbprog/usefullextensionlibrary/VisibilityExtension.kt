package com.nbprog.usefullextensionlibrary

import android.view.View

/**
 * Show the view  (visibility = View.VISIBLE)
 */
fun View.show() : View {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
    return this
}

/**
 * Hide the view (visibility = View.GONE)
 */
fun View.hideGone() : View {
    if (visibility != View.GONE) {
        visibility = View.GONE
    }
    return this
}
/**
 * Hide the view (visibility = View.INVISIBLE)
 */
fun View.hideInvisible() : View {
    if (visibility != View.INVISIBLE) {
        visibility = View.INVISIBLE
    }
    return this
}