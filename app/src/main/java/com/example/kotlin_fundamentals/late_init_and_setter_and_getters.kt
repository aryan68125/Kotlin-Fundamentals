package com.example.kotlin_fundamentals

fun main()
{
    var mycar = car()
    mycar.owner
    var car_brand = mycar.myBrand
    println("My car brand is ${car_brand}")
    mycar.maxSpeed = 320
    println("Max speed of the car is ${mycar.maxSpeed}")
}

class car()
{
    lateinit var owner :String //lateinit allows us to initialize the varable later on in the program

    val myBrand:String = "ASTON MARTIN"
    //creating a custom getter
    get()
    {
       return field.toLowerCase()
    }

    var maxSpeed : Int = 250
        /*
           when we write var maxSpeed : Int = 250 then
             get() = field
        set(value)
    {
        field = value
    }
    is sutomatically generated for us in the background we do not need to write this piece of code b y ourselves in kotlin
         */
        get() = field
        set(value)
    {
        field = if(value>0) value else throw IllegalArgumentException("Max speed should be a positive number")
    }

    var myModel : String = "M5"
        //make the setter private
        //private means something is available within the same class and anyone outside this class will not be able to access this setter
        //Note the getter for this variable myModel is not private only the setter is private so we will be able to print the myModel but will not be able to set any value to it
    private set

    init {
        owner = "Frank"
    }
}