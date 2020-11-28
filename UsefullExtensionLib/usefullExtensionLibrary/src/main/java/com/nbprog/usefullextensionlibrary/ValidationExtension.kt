package com.nbprog.usefullextensionlibrary

import java.util.regex.Pattern

/**
 * Check is Email valid
 * Def expression value : "^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$"
 * */
fun String.isEmailValid(expression: String = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\$"): Boolean {
    val pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
    val matcher = pattern.matcher(this)
    return matcher.matches()
}