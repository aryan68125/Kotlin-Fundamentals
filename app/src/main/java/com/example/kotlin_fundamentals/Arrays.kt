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
    println()
    println("Printing numbers2 array")
    val numbers2 = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var j=0;
    while(j<numbers2.size)
    {
        println(numbers2[j])
        j++
    }
    println()
    println("Print the number3 array")
    val numbers3  = arrayOf(1,2,3,4,5,6,7,8,91,0,128,256,64,32,16,8,2,4,1024,512,2048)
    //another way of printing the numbers
    //contentToString() converts the array contents into a string after which the print statement displays the numbers
    println(numbers3.contentToString())

    //Now lets traverse through the array
    //i.e go through the array and print the elements of the array individually using a loop
    //Honestly it reminds me of how python handles the list in a loop the syntax is almost the same which is good thing I guess
    for(element in numbers3)
    {
        println("${element}")
    }
    println()
    //accessing the elements of an array using the indexes
    //NOTE:-> THE INDEX IN HERE WILL ALWAYS START WITH 0 THAT MEANS IF WE WANT TO ACCESS THE 4TH ELEMENT THEN WE NEED TO PASS IN 4-1=3 IN THE numbers3[index]
    println("element in index 3 an number3 array : ${numbers3[3]}")

    //making changes to numbers 3 array
    //NOTE ARRAYS HAVE FIXED LENGTH
    numbers3[0] = 7150
    numbers3[1] = 420
    numbers3[3] = 117
    println("Numbers3 array after making changes to it :->")
    println("${numbers3.contentToString()}")

    //another array example this time it will be of String type
    println()
    println("Print the array of String type that stores week days ")
    val days = arrayOf("sunday","monday","tuesday","wednesday","thursday","friday","saturday")
    println(days.contentToString())

    //creating an array using a data class Fruit
    println()
    println("printing the fruits array that takes data from the data class Fruit")
    val fruits = arrayOf(Fruit("Apple",2.5), Fruit("banana", 3.5))
    println(fruits.contentToString())
    //access individual items of fruits array
    for(index in fruits.indices)
    {
        //${fruits[index].name} will get the elements in the array
        // $index will the index of the elements of the array
        println("${fruits[index].name} is in index $index")
    }
    //another and more simpler way to access the elements of the fruits array if you do not want to access the indexs of the elements of the array then
    println()
    for(fruit in fruits)
    {
        println("${fruit.name}")
    }

    println()
    //arrays that can hold elements of multiple data types like a list would
    println("Printing the array holding multiple data types")
    val multiarray = arrayOf("sunday", 1, 2.568, 'a')
    println(multiarray.contentToString())

}

data class Fruit(val name:String, val price:Double)