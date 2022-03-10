package com.example.kotlin_fundamentals

//main function
fun main()
{
    //create an instance or an object of a class
   var Name = Person("Kandra", "Sunderland") //Here Name is an object of Person class
   var defaultname = Person()// Here is another object of class Person this will display default name
   var Name2 = Person(firstName = "Alice" ) // only assigning first name in the class Person

    //calling stateHobbie function within the class Person
    Name.stateHobby()
    //you can change what the Hobbie function in the Person class displays on the console
    //So now we can have a unique hobbie for every single person using Person class and it's methods
    Name.hobbie = "I love to fuck Akd"
    Name.stateHobby()

    var Name3 = Person(firstName ="Liah", lastName = "Gotti",19) //Name3, Name2, defaultname, Name are all objects of Person class( class = Blue print)
    Name3.hobbie = "I love to spend time with Akd" //hobbie is a property of Person class
    Name3.stateHobby() //stateHobby() is the method of Person class
}

//a constructor allows us to add values to our objects when we create our objects of our class
//constructor is not manditory
class Person constructor(firstName : String = "default first name", lastName : String = "default last name")
{
    //class body

    //Member Variable - Properties
    var age : Int? = null //age will be nullable
    var hobbie: String = "watch Amazon Prime"

    //init is the initializer
    //initializer initializes the objects of this class Person
    //initializes our first or primary constructor
    init
    {
        println("Person created" +
        "First name = ${firstName} and Last name = ${lastName}")
    }

    //create a constructor here
    //To be honest it is a secondary constructor
    //A constructor is also a member (Member constructor)
    constructor(firstName: String, lastName : String, age: Int): this(firstName,lastName){
        //this.age means we are refering to the member variable of this class
        //age means the variable that is used to assign the age passed in the age from the class parameter to the member variable
        this.age = age
    }

    //member function -> Methods
    //Methods are the functions within a class
    fun stateHobby()
    {
        println("My hobby is ${hobbie}")
        println("My age is = ${age}")
    }
}