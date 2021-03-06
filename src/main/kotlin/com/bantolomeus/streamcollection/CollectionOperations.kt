package com.bantolomeus.streamcollection

import org.springframework.stereotype.Service
import org.funktionale.composition.andThen

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

        fun checkIfMutableMapStringToStringValuesCharsAreLowerCaseAfterMappingToLowerCase(map: MutableMap<String, String>): List<Boolean> {
            return map.map { it.value.toLowerCase() }.map { it.any{ it.isLowerCase()}}
        }

        fun filterMutableMapStringToStringValuesWhereAtLeastOneCharInValueIsLowerCaseAndFinallyCheckIfAllCharsAreInLowerCase(map: MutableMap<String, String>): List<Boolean> {
            return map.filter { it.value.any{ it.isLowerCase() } }.map { it.value }.map { it.any{ it.isLowerCase()} }
        }

        fun filterMutableMapStringToStringValuesIfAllCharsAreLowerCase(map: MutableMap<String, String>): List<Boolean> {
            return map.filter { it.value.all{ it.isLowerCase() } }.map { it.value }.map { it.all{ it.isLowerCase()} }
        }

        fun sumUpAListOfInt(): Int {
            return listOf(1,2,3,4,5,6,7,8,9).fold(0, { count, next -> count + next })
        }

        fun sumsUpMutableMapStringToStringKeys(map: MutableMap<String, String>): Int {
            return map.filter { it.key.all{ it.isDigit()} }.map { it.key.toInt() }.fold(0, { sum, next -> sum + next})
        }

        fun sumsUpMutableMapStringToStringKeysFromEndToStart(map: MutableMap<String, String>): Int {
            return map.filter { it.key.all{ it.isDigit()} }.map { it.key.toInt() }.foldRight(0, { sum, next -> sum + next})
        }

        fun sumsUpMutableMapStringToStringKeysAndValues(map: MutableMap<String, String>): Int {
            return convertMapKeysToList(map.filter { it.key.all{ it.isDigit()} })
                    .plus(convertMapValuesToList(map.filter { it.value.all{ it.isDigit()} }))
                    .map { it.toInt() }
                    .fold(0, { sum, next -> sum + next})
        }

        private fun convertMapValuesToList(map: Map<String,String>): MutableList<String> {
            return map.values.toMutableList()
        }

        private fun convertMapKeysToList(map: Map<String,String>): MutableList<String> {
            return map.keys.toMutableList()
        }

        fun filterStringsOutOfMutableMapAnyToAny(map: MutableMap<Any, Any>): List<String> {
            return map.filter{ it.key is String }.map { it.key.toString()}.plus(map.filter { it.value is String }.map { it.value.toString() })
        }

        fun checkForNullOnInt(value: Int?): Int {
            value?.let { myValue -> return myValue }
            return 0
        }

        fun add5andMultiplyBy2(value: Int): Int {
            val add5 = { i: Int -> i + 5 }
            val multiplyBy2 = { i: Int -> i * 2 }
            val add5andMultiplyBy2 = add5 andThen multiplyBy2
            return add5andMultiplyBy2(value)
        }

        private fun powerBy2(value: Int):Int {
            return value * value
        }

//        fun calculatePowerFunction(value1: Int, exponent: Int): Int {
//            return mit times value1 value2 mal mit sich selbst multiplizieren
//        }


    }
}