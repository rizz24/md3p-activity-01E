package com.example.activity01e

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val itemsArray = ArrayList<String>()

    while (true) {
        println("Choose an option:")
        println("1. Add item")
        println("2. Edit item")
        println("3. Remove item")
        println("4. Exit")
        print("Enter your choice: ")

        when (scanner.nextInt()) {
            1 -> {
                print("\nEnter the item to add: ")
                val newItem = scanner.next()
                itemsArray.add(newItem)
                println("$newItem added to the array.\n")
            }
            2 -> {
                if (itemsArray.isEmpty()) {
                    println("The array is empty. Nothing to edit.\n")
                } else {
                    print("\nEnter the index of the item to edit: ")
                    val index = scanner.nextInt()

                    if (index in 0 until itemsArray.size) {
                        print("\nEnter the new item: ")
                        val newItem = scanner.next()
                        itemsArray[index] = newItem
                        println("Item at index $index updated.\n")
                    } else {
                        println("Invalid index. Please enter a valid index.\n")
                    }
                }
            }
            3 -> {
                if (itemsArray.isEmpty()) {
                    println("The array is empty. Nothing to remove.\n")
                } else {
                    print("\nEnter the index of the item to remove: ")
                    val index = scanner.nextInt()

                    if (index in 0 until itemsArray.size) {
                        val removedItem = itemsArray.removeAt(index)
                        println("Item \"$removedItem\" removed from the array.\n")
                    } else {
                        println("Invalid index. Please enter a valid index.\n")
                    }
                }
            }
            4 -> {
                println("Exiting the program.")
                return
            }
            else -> println("Invalid choice. Please enter a valid option.")
        }

        println("Current items in the array: $itemsArray\n")
    }
}
