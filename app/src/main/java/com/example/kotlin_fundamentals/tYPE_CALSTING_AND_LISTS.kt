package com.example.kotlin_fundamentals

fun main()
{
    val StringList: List<String> = listOf("Aditya", "Leah", "Kandra" , "Emi" )
    val mixedTypeList : List<Any> = listOf("Aditya", 24 , 5 , "Badday" , 70.5 , "weight" ,1 ,  "Kg" )

    println("printing result using for loop and if else")
    for(value in mixedTypeList)
    {
        if(value is Int)
        {
            println("Integer: $value")
        }
        else if (value is Double)
        {
            println("Double $value with Floor value ${Math.floor(value)}")
        }
        else if(value is String)
        {
            println("String $value of length ${value.length}")
        }
        else
        {
            println("Unknow type")
        }
    }

    //Alternatively
    println("printing the result using forloop and when statements")
    for(value in mixedTypeList)
    {
        when(value)
        {
            is Int -> println("Integer: $value")
            is Double -> println("Double $value with Floor value ${Math.floor(value)}")
            is String -> println("String $value of length ${value.length}")
            else -> println("Unknow type")
        }
    }

    //Smart Cast
    val obj1: Any = "I have a dream"
    if(obj1 !is String)
    {
        println("Not a String")
    }
    else
    {
        //obj is automatically cast to a String in this scope
        println("Found a String of length ${obj1.length}")
    }

    //explicite (unsafe) Casting using the "as" keyword - can go wrong
    val str1 = obj1 as String
    println(str1.length)
    val obj2 : Any = 1337
    /*
    Object 2 is of type Any and what is behind it is 1337 which is an integer so It will throw an exception
     */
//    val str2 : String = obj2 as String
//    println(str2)

    //Explicit (safe) casting using "as?" keyword
    val obj3 : Any = 420
    val str3:String? = obj3 as? String //Works because if obj3 is not casted successfully then it will be a null as str3 is nullable
    println(str3) //Prints null
}


