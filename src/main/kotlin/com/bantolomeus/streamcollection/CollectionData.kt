package com.bantolomeus.streamcollection

import org.springframework.stereotype.Service

@Service
class CollectionData {

    companion object {
        fun fillOutMapOfStringToString(): MutableMap<String, String> {
            return mutableMapOf("1" to "Hello", "2" to "world", "3" to "!", "4" to "Are",
                    "5" to "you", "6" to "ready", "7" to "?")
//            return mutableMapOf()
        }

        fun fillOutMapOfIntToString(): MutableMap<Int, String> {
            return mutableMapOf(1 to "Hello", 2 to "world", 3 to "!", 4 to "Are",
                    5 to "you", 6 to "ready", 7 to "?")
        }
    }
}