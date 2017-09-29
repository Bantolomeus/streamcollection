package com.bantolomeus.streamcollection

import org.springframework.stereotype.Service

@Service
class CollectionData {

    companion object {
        fun fillOutMapOfStringToString(): MutableMap<String, String> {
            return mutableMapOf("1" to "Hello", "2" to "world", "3" to "!", "4" to "Are",
                    "5" to "you", "6" to "ready", "7" to "?", "finally" to "999999999")
        }

        fun fillOutMapOfIntToString(): MutableMap<Int, String> {
            return mutableMapOf(1 to "Hello", 2 to "world", 3 to "!", 4 to "Are",
                    5 to "you", 6 to "ready", 7 to "?")
        }

        fun fillOutMapOfAnyToAny(): MutableMap<Any, Any> {
            return mutableMapOf("1" to "Hello", "2" to "world", "3" to "!", "4" to "Are",
                    "5" to "you", "6" to "ready", "7" to "?", "finally" to "999999999")
        }

        fun fillOutMapOfAnyToAny2(): MutableMap<Any, Any> {
            return mutableMapOf(1 to "Hello", 2 to "world", 3 to "!", 4 to "Are",
                    5 to "you", 6 to "ready", 7 to "?")
        }
    }
}