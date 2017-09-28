package com.bantolomeus.streamcollection

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class StreamcollectionApplication

fun main(args: Array<String>) {
    SpringApplication.run(StreamcollectionApplication::class.java, *args)

    println("input")
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
}
