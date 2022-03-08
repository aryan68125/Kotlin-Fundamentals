package com.example.kotlin_fundamentals

//main function
fun main()
{
    //create an instance or an object of a class
   var Name = Person("Kandra", "Sunderland") //Here Name is an object of Person class
   var defaultname = Person()// Here is another object of class Person this will display default name
   var Name2 = Person(firstName = "Alice" ) // only assigning first name in the class Person
}

//a constructor allows us to add values to our objects when we create our objects of our class
//constructor is not manditory
class Person constructor(firstName : String = "default first name", lastName : String = "default last name")
{
    //class body

    //init is the initializer
    //initializer initializes the objects of this class Person
    init
    {
        println("Person created" +
        "First name = ${firstName} and Last name = ${lastName}")
    }
}