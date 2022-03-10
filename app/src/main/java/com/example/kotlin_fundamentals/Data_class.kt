package com.example.kotlin_fundamentals

//here data class primary constructor must have atleast one parameter
//data classses connot be abstreact , open , or inner class
data class User(val id:Long,var name: String)

fun main()
{
   var user1 = User(1,"Aditya Kumar") //creating objects of data class
   var name = user1.name
    val id = user1.id
    println("name = ${name} and id  = ${id}")
    var user2 = User(2,"Leah Gotti")
    var name2 = user2.name
    val id2 = user2.id
    println("name = ${name2} id = ${id2}")

    //dataclasses also have a toString method
    println("User Details : ${user1}")

    //dataclassses also have a copy function
    //this function allows you to copy the content of a class into its object
    //you can also copy the contents of a class except the contents that you want to change in the object
    val Updated_User_Object = user1.copy(name = "Kendra Sunderland")
    println("id = ${Updated_User_Object.id} and name  = ${Updated_User_Object.name}")
}
