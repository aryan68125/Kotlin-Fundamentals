package com.example.kotlin_fundamentals

fun main()
{
    //Arrays
    //integer type arrays
    val numbers: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,15,16,17,18,19,20)
    var i = 0
    println("printing the numbers array")
    while(i<numbers.size)
    {
        println(numbers[i])
        i++
    }

    println("Printing numbers2 array")
    val numbers2 = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var j=0;
    while(j<numbers2.size)
    {
        println(numbers2[j])
        j++
    }

    val numbers3  = arrayOf(1,2,3,4,5,6,7,8,91,0,128,256,64,32,16,8,2,4,1024,512,2048)
    //another way of printing the numbers
    //contentToString() converts the array contents into a string after which the print statement displays the numbers
    println(numbers3.contentToString())

    //Now lets traverse through the array
    //i.e go through the array and print the elements of the array individually using a loop
    //Honestly it reminds me of how python handles the list in a loop the syntax is almost the same which is good thing I guess
    for(element in numbers3)
    {
        println(element)
    }
}