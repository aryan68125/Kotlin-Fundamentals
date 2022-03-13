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
    newFruits.add(6, "Pear")
    println("Printing newFruits set which is mutable")
    println(newFruits)

    //MAPS
    //Map is a type of collection that holds the data in form of key value pair just like a dictionary in python
    //NOTE : HERE WE ARE USING NUMBERS TO "STRINGS" BUT YOU CAN ALSO USE THIS MAP FOR NUMBERS TO "OBJECTS" SO YOU ARE NOT LIMITED HERE
    println()
    println("Creating a map")
    val daysOfTheWeek = mapOf(1 to "Monay", 2 to "Tuesday", 3 to "Tuesday", 4 to "Thursday" , 5 to "Friday", 6 to "Saturday")
    println("Printing just one item")
    println(daysOfTheWeek[2]) // printing only one item in a map

    //now printing all the items in a map using for loop
    println()
    println("Printing all the items in a map")
    for(key in daysOfTheWeek.keys)
    {
        println("$key is to ${daysOfTheWeek[key]}")
    }
}