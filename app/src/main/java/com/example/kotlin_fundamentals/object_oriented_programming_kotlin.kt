package com.example.kotlin_fundamentals

//main function
fun main()
{
    //create an instance or an object of a class
   var Name = Person("Aditya", "Kumar") //Here Name is an object of Person class

}

//a constructor allows us to add values to our objects when we create our objects of our class
//constructor is not manditory
class Person constructor(firstName : String , lastName : String)
{
    //class body

    //init is the initializer
    //initializer initializes the objects of this class Person
    init
    {
        println("Person created")
    }
}