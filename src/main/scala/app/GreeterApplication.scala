package app

import scala.io.StdIn

object GreeterApplication extends App {

//  def greet(name : String) : Unit =
//    if(name == "Andrew") {
//      println(("You don't get a Hello"))
//    }
//    else {
//      println(s"Hello $name")
//    }

  val name = StdIn.readLine("What is your name?\n")

  val person : Person = new Person(name)

  println(person.speak())

//  greet(name)
}
