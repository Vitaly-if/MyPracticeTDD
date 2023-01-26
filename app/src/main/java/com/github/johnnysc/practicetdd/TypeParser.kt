package com.github.johnnysc.practicetdd

/**
 * @author Vitaly.N on 26.01.2023.
 */
interface TypeParser<T> {
    fun parse(input: String): T
}