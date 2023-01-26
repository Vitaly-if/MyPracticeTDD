package com.github.johnnysc.practicetdd

import java.lang.IllegalStateException

/**
 * @author Vitaly.N on 24.01.2023.
 */
interface Parser {
    fun parse(raw: String): List<Any?>
    class Base(private val delimiter: String) : Parser {
        private val listPair = listOf<Pair<TypeParser<*>, Definer>>(Pair(BooleanParser(),
            BooleanDefiner.Base()),
        Pair(CharParser(), CharDefiner()))

        init {
            if (delimiter == "")
                throw IllegalStateException()
        }

        override fun parse(raw: String): List<Any?> {
            var result = mutableListOf<Any?>()

            val splitList = raw.split(delimiter)
            for (raw in splitList) {
                for (i in listPair.indices)
                    if (listPair[i].second.isType(raw)) {
                        result.add(listPair[i].first.parse(raw))
                    }
            }
            return result
        }

    }

}