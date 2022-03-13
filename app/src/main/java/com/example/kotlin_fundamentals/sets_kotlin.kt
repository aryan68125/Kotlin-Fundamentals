package com.example.kotlin_fundamentals

fun main()
{
    //IMMUTABLE SET
    //Set is a type of collection that removes all duplicate data
    //the set is collection that is unordered that means the collection is unsorted
    println("Creating a set and then printing its size ->")
    //as we can see here the number of elements we entered are 6
    val fruits = setOf("Apple","Orange", "Grapes", "Mango", "Apple","Orange")
    //but when we print the size we only get the size of 4 of this set hence the duplicate elements are ignored
    println(fruits.size)
    println()
    //we can also sort the set
    println("Printing the set in sorted order")
    //here we can see that this sorted the set in alphabetical order
    println(fruits.toSortedSet())

    println()
    //MUTABLE SET
    println("This Fruit set is mutable")
    val newFruits = fruits.toMutableList()
    newFruits.add(4,"Melon")
    newFruits.add(5,"Water Melon")
    println("Printing newFruits set which is mutable")
    println(newFruits)
}