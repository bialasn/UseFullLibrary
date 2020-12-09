package com.nbprog.usefullextensionlibrary

import java.util.regex.Pattern

/**
 * Check is Email valid
 * Def expression value : "^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$"
 * */

private  val defRegex = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\$".toRegex()

fun String.isEmailValid(expression: Regex = defRegex): Boolean {
    return expression.matches(this)
}