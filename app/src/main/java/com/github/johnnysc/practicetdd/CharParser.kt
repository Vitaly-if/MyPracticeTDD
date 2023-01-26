package com.github.johnnysc.practicetdd

/**
 * @author Vitaly.N on 26.01.2023.
 */
class CharParser: TypeParser<Char> {
    override fun parse(input: String): Char {
        val result = input as CharSequence
        return result[0]

    }
}