package com.github.johnnysc.practicetdd

/**
 * @author Vitaly.N on 26.01.2023.
 */
class CharDefiner : Definer {
    override fun isType(input: String): Boolean {
        if (input.length != 1)
            return false
        return input.toCharArray()[0] !in '1'..'8'
    }
}