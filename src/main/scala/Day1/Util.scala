package Day1


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
  }
}

