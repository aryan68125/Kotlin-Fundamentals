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

    println()
    //creating a mutable list of a particular data type
    println("creating a mutable list of a particular data type")
    val days2 = mutableListOf<String>("Monday", "Tuesday","Wednesday")
    println("Printing days2 list before adding -> $days2")
    days2.add(3,"Thursday")
    days2.add(4,"Friday")
    days2.add(5,"Saturday")
    println("Printing days2 after adding -> $days2")

    println()
    //how to override an already present item in a list
    println("how to override an already present item in a list")
    days2[2] = "Aditya Kumar"
    println("After overriding an item at position 2 in the list named days2 -> $days2")

    println()
    //how to remove an item from a list
    println("how to remove an item from a list")
    days2.removeAt(2) //this will remove the item at index 2
    println("Printing the elements in list named days2 after removing the item at index 2 -> $days2")

}