package com.example.kotlin_fundamentals

//structure of inheritance
/*

   The class that inherits the features of another class is called the Sub class OR child class
   Derived class , and the class whose features are inherited is called Super class OR Parent class
   Or Base class

 */

//Vehicle is the Super class OR Base class
//open class Vehicle
//{
//    //Properties
//
//    //methods
//}

/*
if we inherit from our Vehicle class then that means we can re use the Properties and methods of Vehicle class
in this class also
NOTE:->
   -> IF YOU WANT TO INHERIT FROM THE VEHICLE CLASS THEN YOU NEED TO MAKE IT OPEN INORDER TO DO THAT
   -> ALL CLASSES IN KOTLIN ARE NON-INHERITABLE BY DEFAULT IE. THEY ARE FINAL BY DEFAULT
   -> SO YOU NEED TO USE open KEYWORD TO MAKE THAT CLASS INHERITABLE

NOTE:->
   -> YOU CAN USE sealed KEYWORD TO MAKE YOUR CLAS NON-INHERITABLE
 */
//Car is the Sub-class of Vehicle class
//open class Car : Vehicle()
//{
//
//}

/*
   Now let's create another class that inherits from the Car class
 */
// Electic_Cars is the sub-class of Car class
//class Electric_Cars : Car()
//{
//
//}

/*
override maxspeed property of interface drivable
 */
open class Car(override var maxspeed : Double , var Name:String, var Brand:String) : drivable
{
   open var range: Double = 0.0
    fun extendRange(amount: Double)
    {
        if(amount > 0)
        {
            range+=amount
            println("Extended range is now $range")
        }
    }

    override fun drive() : String
    {
        return "Driving the interface drive"
    }

   open fun drive(distance:Double){
        println("Drove for $distance KM")
    }
}

class Electric_Cars(maxspeed:Double , Name: String, Brand: String, batteryLife : Double) : Car(maxspeed , Name, Brand)
{
    var chargertype = "type1"
   //override the range functionality
   override var range = batteryLife *6

    //override the drive functionality
    //this function drive is the function that we overrided of the parent class Car
   override fun drive(distance:Double)
   {
       println("Drove for $distance KM on electicity")
   }

    //drive function created inside the sub class
    override fun drive() : String
    {
        return ("Drove for $range KM on electicity")
    }
}
//Any class inherits from Any class here Any is the name of the Class in Kotlin
//every class that we create in Kotlin has Any as its Super class
fun main()
{
    var mycar = Car(250.25,"A3","Audi")
    mycar.drive(200.2)

    var myEcar = Electric_Cars(320.6,"Model X", "Tesla",512.25)
    myEcar.drive(128.5)
    myEcar.extendRange(250.36)
    myEcar.drive()
    myEcar.brake()
    myEcar.chargertype = "type 3"
    println("charger type ${myEcar.chargertype}")
}

/*
interface
interfaces can provide default implementation on all of its properties or functions
But it doen't have to
and if a property of a function has a default implementation the class that uses this interface may choose to override it
 */
interface drivable
{
    //property of the interface
    var maxspeed : Double

    //functions of the interface
    /*
    fun drive():String doesn't have a function body so we need to implement this function of interface in the class Car
    which extends to this interface
     */
    fun drive():String
    fun brake()
    {
        println("The drivable is breaking")
    }
}