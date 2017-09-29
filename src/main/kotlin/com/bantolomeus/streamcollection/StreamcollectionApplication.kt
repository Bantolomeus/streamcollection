package com.bantolomeus.streamcollection

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class StreamcollectionApplication

fun main(args: Array<String>) {
    SpringApplication.run(StreamcollectionApplication::class.java, *args)

    println("input(keys = string, values = string):")
    println(CollectionData.fillOutMapOfStringToString())

    println("count Keys")
    println(CollectionOperations.filterAndCountKeysMutableMapStringToString(CollectionData.fillOutMapOfStringToString()))

    println("give out pairs with exclamation mark in values")
    println(CollectionOperations.filterMutableMapStringToStringByExclamationMarkInValue(CollectionData.fillOutMapOfStringToString()))

    println("all pairs with digit in keys")
    println(CollectionOperations.filterMutableMapStringToStringByAnyDigitInKeys(CollectionData.fillOutMapOfStringToString()))

    println("all pairs with digit in values")
    println(CollectionOperations.filterMutableMapStringToStringByAnyDigitInValues(CollectionData.fillOutMapOfStringToString()))

    println("all pairs where values has at least one char in lower case")
    println(CollectionOperations.filterMutableMapStringToStringByAnyValuesInLowerCase(CollectionData.fillOutMapOfStringToString()))

    println("map all values to lower case and return them as list")
    println(CollectionOperations.mutableMapStringToStringMapValuesToLowerCase(CollectionData.fillOutMapOfStringToString()))

    println("map values to lower case and then count the length of every value")
    println(CollectionOperations.countMutableMapStringToStringValuesLengthAfterMapThemToLowerCase(CollectionData.fillOutMapOfStringToString()))

    println("check if all chars of the values are in lowercase after mapping the values to lowercase")
    println(CollectionOperations.checkIfMutableMapStringToStringValuesCharsAreLowerCaseAfterMappingToLowerCase(CollectionData.fillOutMapOfStringToString()))

    println("filter all pairs where the value has at least one char in lower case and then look if all chars are in lower case")
    println(CollectionOperations.filterMutableMapStringToStringValuesWhereAtLeastOneCharInValueIsLowerCaseAndFinallyCheckIfAllCharsAreInLowerCase(CollectionData.fillOutMapOfStringToString()))

    println("filter all pairs where the value has only lower case chars")
    println(CollectionOperations.filterMutableMapStringToStringValuesIfAllCharsAreLowerCase(CollectionData.fillOutMapOfStringToString()))

    println("sums up one to nine:")
    println(CollectionOperations.sumUpAListOfInt())

    println("sums up all keys, if they are digits:")
    println(CollectionOperations.sumsUpMutableMapStringToStringKeys(CollectionData.fillOutMapOfStringToString()))

    println("sums up all keys from right to left, if they are digits:")
    println(CollectionOperations.sumsUpMutableMapStringToStringKeysFromEndToStart(CollectionData.fillOutMapOfStringToString()))

    println("sums up all keys and values if they are digits:")
    println(CollectionOperations.sumsUpMutableMapStringToStringKeysAndValues(CollectionData.fillOutMapOfStringToString()))

    println("filter out all Strings:")
    println(CollectionOperations.filterStringsOutOfMutableMapAnyToAny(CollectionData.fillOutMapOfAnyToAny()))




    println("\n\ninput(keys = int, values = string):")
    println(CollectionData.fillOutMapOfAnyToAny2())

    println("filter out all Strings:")
    println(CollectionOperations.filterStringsOutOfMutableMapAnyToAny(CollectionData.fillOutMapOfAnyToAny2()))
}
