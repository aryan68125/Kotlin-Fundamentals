package com.example.kotlin_fundamentals

fun main()
{
    //Set is a type of collection that removes all duplicate data
    //the set is collection that is unordered that means the collection is unsorted
    println("Creating a set and then printing its size ->")
    //as we can see here the number of elements we entered are 6
    val fruits = setOf("Apple","Orange", "Grapes", "Mango", "Apple","Orange")
    //but when we print the size we only get the size of 4 of this set hence the duplicate elements are ignored
    println(fruits.size)
}