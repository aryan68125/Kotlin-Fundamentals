package com.example.kotlin_fundamentals

//main function
fun main(){
    // main function is the starting function of our app

    var my_name = "Aditya Kumar" //variable = var in kotlin
    my_name = "Leah Gotti" //reassigning the my_name variable with Leah Gotti
    var ageL = 20;

    //val can not be overwritten and var can be overwritten
    val my_name_2 = "Aditya Kumar"
    val ageA = 20;

    print("Hello "+ my_name + " age = "+ ageL +"\n") //print method tells the ide to display something on the console
    print("Hello "+ my_name_2 + " age = "+ ageA+"\n")

    //Datatypes in kotlin
    //assign dataype manually
    /*
      you don't need to do this as kkotlin just like python automatically assigns the datatype to the variable depending on
      the assginment of that particular variable
     */
    var myByte : Byte = 64;
    var myShort : Short = 125;
    var myInt : Int = 1231231231;
    var myLong : Long = 1234567899876543214;
    var is_sunny = true;
    print("Converting Bytes into String and printing it = "+Byte + "\n" + is_sunny)
    print("Converting Short into String and printing it = "+Short + "\n")
    print("Converting Int into String and printing it = "+Int + "\n")
    print("Converting Long into String and printing it = "+Long + "\n")

    //print the first character in string
    var sentence  = "My name is Aditya"
    var sentence_f_char = sentence[0]
    var lastchar = sentence[sentence.length-1] //will return the last character in a sentence
    var sentence_length = sentence.length
    print("sentence = "+ sentence +"\n")
    print("sentence first character = " + sentence_f_char + "\n")
    print("sentence last character = " + lastchar + "\n")
    print("sentence length = " + sentence_length+ "\n")

    //String Template or String interpolation
    print("First charatcer using String interpolation $sentence_f_char \n" )
    /*
    the above print statement replaces
    print("sentence first character = " + sentence_f_char + "\n")
     */

    print("Length of the Sentence using String Template= ${sentence.length} \n")

    //Arithematic operators in Kotlin (+, -, *, /, %)
    var result = 5 + 3;
    print("addition = $result \n")

    var divide = 28/2
    print ("divide = $divide \n")

    var minus = 28 - 14
    print ("Subtraction = $minus \n")

    var mul = 5 * 3
    print( "multiplication  = $mul \n")

    var remainder = 39 % 14
    print("remainder = $remainder \n")

    var d = result/3
    var d_double : Double
    d_double = (result).toDouble()/3
    print("d = $d \n d_couble = $d_double \n")

    println("5 is greater 3 = ${5>3}")

    var mynum = 2
    println("post increament ${mynum++}")
    println("Preincreament ${++mynum}")

    // if and else statements in kotlin
    var height_1 = 512
    var height_2 = 512
    if(height_1 < height_2)
    {
        println("${height_1} < ${height_2}")
    }
    else if(height_1>height_2)
    {
        println("${height_1} > ${height_2}")
    }
    else if (height_1==height_2)
    {
        println("${height_1} == ${height_2}")
    }
    else{
        println("error")
    }

    // when statements are Replacement of switch case statements in kotlin
    var season = 4
    when(season){
        1 -> println("Summer")
        2 -> println("Fall")
        3 -> {
            println("Rainy")
            println("Hate this season")
        }
        else -> println("Unknown")
    }

    //example 2 of when statement
    var age = 16
    when(age)
    {
        in 21..150 -> println("you may drink in the us")
        in 18..20-> println("you may vote now")
        16,17 -> println("you may drive now")
        else -> println("you are too young")
    }

    //while loop in kotlin
    var x= 1
    while (x<=10)
    {
        println("$x")
        x++
    }

    var y = 100
    while(y>0)
    {
        print("$y ")
        y -= 2
    }
}
