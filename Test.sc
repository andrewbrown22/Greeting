
def add1(
          a: Int,
          b: Int,
          c: Int): Int = {

  val result = a + b + c
  result
}

def testfunction (
                 a : String,
                 b : String) : String = {


  val result1 = a + b
    result1
}

testfunction("Hello ", "Andrew")



add1(5, 4, 1)


add1(4,3,1)

package app

object FizzBuzz {

  var x : Int = 0

  while( x < 100){
    x = x + 1

    if(x % 3 == 0 && x % 5 == 0){
      println("FizzBuzz")

    }
    else if(x % 3 == 0){
      println("Fizz")
    }
    else if(x % 5 == 0){
      println("Buzz")
    }
    else{
      println(x)
    }

  }



}