package com.example.kotlin_fundamentals

fun main()
{
    //creating a kotlin funtion and calling those function in this main function
    //function calling
    myFunction()

    //calling function with parameters
    var result = addup(18.0,2.0)
    println("a/b= ${result}")

    //calling average function
    var result_avg = avg(25.256,36.5596)
    println("average of a and b is  = ${result_avg}")
}

//creating a function in kotlin
fun myFunction()
{
    println("called from my fun")
}

//we can extend the functions that we are creating
fun addup(a: Double, b: Double): Double
{
    var result = a/b
    return result
}

//Method is a function that is within a class

//function to calculate average
fun avg(a:Double, b: Double):Double{
    var result = (a+b)/2
    return result
}