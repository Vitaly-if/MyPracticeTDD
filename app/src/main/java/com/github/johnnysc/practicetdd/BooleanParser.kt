package com.github.johnnysc.practicetdd

/**
 * @author Vitaly.N on 26.01.2023.
 */
class BooleanParser: TypeParser<Boolean> {
    override fun parse(input: String): Boolean {
        return input == "true"
    }
}