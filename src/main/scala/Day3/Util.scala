package Day3

object Util {
  def printParam(param: String): Unit = {
    println(param)
  }

  def param(param: String): String = param

  def race(race: Any): Any = {
    race
  }

  def param1(param1: String, params: Int): Unit = {
    for (i <- 1 until param1.length if i >= (param1.length - params))
      print(param1.charAt(i))
    println()
  }

  def param2(str1: String, str2: String, char1: Char, char2: Char): String = {

    val strFinal: String = str1 + str2
    val array = scala.collection.mutable.ListBuffer.empty[Char]
    array.addAll(strFinal.toList)
    for (i <- 0 until strFinal.length) {
      if (array(i) == char1) {
        array(i) = char2
        println("yes")
      }
    }
    array.mkString("")
  }

  def add(int1: Int, int2: Int): Int = {
    int1 + int2
  }

  def addIsTrue(int1: Int, int2: Int, boolean: Boolean): Int = {
    if (boolean == true) int1 + int2
    else int1 * int2
  }

  def addUltimate(int1: Int, int2: Int, boolean: Boolean): Int = {

    if (int1 != 0 && int2 != 0) {
      if (boolean == true) int1 + int2
      else int1 * int2
    } else if (int1 == 0 & int2 == 0) {
      int1
    } else {
      if (int1 != 0) {
        int1
      } else {
        int2
      }
    }
  }

  def iterate
}