package com.example.kotlin_fundamentals

/*
An abstract class cannot be instantiated
(You cannot create objects of an abstract class)
However , you can inherit subclasses from an abstract class
The members (properties and methods) of an abstract class are non-abstract
unless you explicitely use the keyword to make them abstract
 */
abstract class Mammal(private val name:String , private val origin:String, private val weight:Double)
{
    //Concrete (Non Abstract) Properties

    //Abstract Property (Must be overriden by the sub-classes)
    abstract var maxSpeed:Double

    //Abstract Methods (Must be implemented by the SubClasses)
    abstract fun run()
    abstract fun breath()

    //Concrete (Non Abstract) Method
    fun displayDetails()
    {
        println("Name : $name , Origin : $origin , Weight : $weight, " + "Max Speed : $maxSpeed")
    }
}

class Human(name: String, origin : String, weight : Double,
            override var maxSpeed: Double) :Mammal (name , origin , weight)
{
    override fun run() {
        println("Humans runs on two legs")
    }

    override fun breath() {
        //Code to breath
        println("Breath through mouth or nose")
    }

}

class Elephant (name: String, origin: String, weight: Double,
                         override var maxSpeed: Double) : Mammal (name, origin, weight)
{
    override fun run() {
        println("Elephant runs on Four legs")
    }

    override fun breath() {
        println("Breath through mouth or trunk")
    }

}

//main function OR entry point in this kotlin program file
fun main()
{
    val human = Human( "Aditya Kumar", "India" , 75.0,28.0)
    val elephant = Elephant("Jason", "Thiland", 5400.00,32.5)
    human.run()
    human.breath()

    elephant.run()
    elephant.breath()
}