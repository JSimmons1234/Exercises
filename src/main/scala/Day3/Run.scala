package Day3

import Day3.Util._

object Run {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val a = "Hello World"
    println(a)

    printParam(a)
    println (param(a))

    val b : Int = 6
    val c = true
    val d : Double = 6

    println(race(a))
    println(race(b))
    println(race(c))
    println(race(d))

    param1("Hello",3)

    println(param2("Ha","llo",'a','e'))
  }

}
