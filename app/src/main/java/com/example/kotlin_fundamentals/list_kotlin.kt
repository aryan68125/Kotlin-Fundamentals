package com.example.kotlin_fundamentals

fun main()
{
    //IMMUTABLE LIST TYPES : LIST HERE CANNOT BE CHANGED ONCE CREATED
    //list of string type
    println("List of String type")
    val months = listOf("January","Febuary","March")
    println(months)

    //list of any type
    println()
    println("Printing the list of any type")
    val anyType = listOf("Aditya", 1,512.256, true,false)
    println(anyType)
    //printing the size of the list
    println(anyType.size)

    println()
    //you can loop through the list just like an array
    println("Printing the elements by traversing the list 'anytype' ")
    for(types in anyType)
    {
        println(types)
    }
    
    //How create a list that is mutable
    println()
    val additionalmonths = months.toMutableList()
    val newMonths = arrayOf("April","May","June","July","August")
    additionalmonths.addAll(newMonths)

    //if you don't want to create a seperate array for adding elements to a mutable list
    additionalmonths.add(8,"September")
    println("Printing additionalmonths list")
    println(additionalmonths)
    println("Printing months list")
    println(months)
}