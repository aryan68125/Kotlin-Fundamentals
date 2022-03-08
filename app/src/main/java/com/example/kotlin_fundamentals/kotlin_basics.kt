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
    //while loop example 2
    var y = 100
    while(y>0)
    {
        print("$y ")
        y -= 2
    }
    println()
    //while loop example 3
    var felttemp = "cold"
    var roomtemp = 10
    while(felttemp == "cold"){
        roomtemp++
        print("${roomtemp} degree celcius, ")
        if(roomtemp>=20)
        {
            println()
            felttemp = "comfy"
            println("It's confy now")
        }
    }

    //do while loop in kotlin
    var z=1
    do{
        print ("$z ")
      z++
    }while(z<=10)
    println()

    //for loop in kotlin
    println("executing for loop")
    for(num in 1..10)
    {
        print("${num} ,")
    }

    println()
    //another way of writing a for loop
    println("another way of for loop")
    for(i in 1 until 20)
    {
        print("${i}, ")
    }

    println()
    //for loop in decreasing order
    println("forloop in decreasing order")
    for(i in 10 downTo 0)
    {
        print("${i} ,")
    }

    //for loop with decreasing order in steps of 2 LIKE:-> 10 8 6 4 2 ...
    println()
    println("For loop in decreasing order decreasing in steps of 2")
    for(j in 20 downTo 0 step 2)
    {
        print("${j} ,")
    }

    //for loop in increasing order increasing in the steps of 2 LIKE:-> 2, 4, 6, 8, 10...
    println()
    println("For loop in ascending order in steps of 2")
    for( k in 0 until 20 step 2)
    {
        print("${k}, ")
    }

    //break and continue statements in kotlin
    println()
    //break statement
    println("break statements")
    for(i in 1 until 20)
    {
        print("$i, ")
        if(i/2 == 5){
            println()
            println("i value has reached $i i/2 = 5 hence the loop will break")
            break
        }
    }

    println()
    //continue statement in kotlin
    println("Continue statement in kotlin")
    for(k in 1 until 20)
    {
        // 10/2 = 5 and 11/2 = 5.5 hence 10 and 11 are skipped when continue is used in the if statement
        if(k/2 == 5)
        {
            continue
        }
        print("$k ,")
    }

    println()

    //nullable in kotlin
    var name: String = "Aditya kumar" //non nullable string variable
    //name = null -> compiler error
    var nullableName :String? = "Aditya Kumar" //nullable String variable
    //nullableName = null

    //difference between nullable and non nullable string variable
    var len = name.length
    //var len2 = nullable.length -> compiler error
    //so how can we fix this
    var len2 = nullableName?.length
    /*
        var len2 = nullableName?.length //here this line of code is same as
        if (nullableName != null) // this line of code
        {
           var len2 = nullableName.length
        }
        else
        {
            null
        }
     */
    nullableName?.let {
        //println(it.length)
        //println(nullableName)
    }

    //Elvis operator in Kotlin
    /*
       val name_1 = nullableName?:"Guest"
       if nullableName = null then it gives name_1 = "Guest" which is a default value
     */
    val name_1 = nullableName?:"Guest"
    println(name_1)

    //Not null asertion operator !!
    /*
      It converts a nullable type variable to a num null type variable and throws a null pointer exception error if the nullable type holds a null value
      This is risky and you should only use it when you are 100% sure that there will be some value
     */
    nullableName!!.toLowerCase()
}

