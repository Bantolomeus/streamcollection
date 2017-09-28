package com.bantolomeus.streamcollection

import org.springframework.stereotype.Service

@Service
class CollectionOperations {

    companion object {
        fun filterAndCountKeysMutableMapStringToString(map: MutableMap<String, String>): Int {
//            return map.filter { it.key.isNotEmpty() }.keys.count()
            return map.keys.size
        }

        fun filterMutableMapStringToStringByExclamationMarkInValue(map: MutableMap<String, String>): Map<String, String> {
            return map.filter { it.value.contentEquals("!") }
        }

        fun filterMutableMapStringToStringByAnyDigitInKeys(map: MutableMap<String, String>): Map<String, String> {
            return map.filter { it.key.any{ it.isDigit()} }
        }

        fun filterMutableMapStringToStringByAnyDigitInValues(map: MutableMap<String, String>): Map<String, String> {
            return map.filter { it.value.any{ it.isDigit()} }
        }

        fun filterMutableMapStringToStringByAnyValuesInLowerCase(map: MutableMap<String, String>): Map<String, String> {
            return map.filter { it.value.any{ it.isLowerCase()} }
        }

        fun mutableMapStringToStringMapValuesToLowerCase(map: MutableMap<String, String>): List<String> {
            return map.map { it.value.toLowerCase() }
        }

        fun countMutableMapStringToStringValuesLengthAfterMapThemToLowerCase(map: MutableMap<String, String>): List<Int> {
            return map.map { it.value.toLowerCase() }.map { it.length }
        }

//        return map.map { it.value.toLowerCase() }.map { it.any{ it.isLowerCase()}length }


    }
}