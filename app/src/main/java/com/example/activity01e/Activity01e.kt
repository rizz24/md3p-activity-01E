package com.example.activity01e

fun main() {
    // Array example
    val arrayExample: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Array example:")
    arrayExample.forEach { print("$it ") }
    println()

    // ArrayList example
    val arrayListExample: ArrayList<String> = ArrayList()
    arrayListExample.add("apple")
    arrayListExample.add("banana")
    arrayListExample.add("orange")
    println("\nArrayList example:")
    arrayListExample.forEach { println(it) }

    // Set example
    val setExample: Set<String> = setOf("apple", "banana", "orange")
    println("\nSet example:")
    setExample.forEach { println(it) }

    // Map example
    val mapExample: Map<String, Int> = mapOf(
        "apple" to 1,
        "banana" to 2,
        "orange" to 3
    )
    println("\nMap example:")
    mapExample.forEach { (key, value) -> println("$key -> $value") }
}
