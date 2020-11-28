package com.nbprog.usefullextensionlibrary

import android.content.res.Resources

/**
 * Convert Int to dp
 */
val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()

/**
 * Convert Int to px
 */
val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()
