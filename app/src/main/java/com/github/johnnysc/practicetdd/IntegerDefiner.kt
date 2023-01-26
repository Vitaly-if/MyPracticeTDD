package com.github.johnnysc.practicetdd

/**
 * @author Vitaly.N on 26.01.2023.
 */
interface IntegerDefiner {
    fun isInteger(input: String): Boolean
    class Base(): IntegerDefiner {
        override fun isInteger(input: String): Boolean {
            return false
        }
    }
}