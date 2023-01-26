package com.github.johnnysc.practicetdd

/**
 * @author Vitaly.N on 26.01.2023.
 */
interface BooleanDefiner:  Definer{
    fun isBoolean(input: String): Boolean
    class Base() : BooleanDefiner {
        override fun isBoolean(input: String): Boolean {
            var result = false
            if("true".equals(input)||("true".equals(input)))
            return true
            return result
        }

        override fun isType(input: String): Boolean {
            return isBoolean(input)
        }
    }
}