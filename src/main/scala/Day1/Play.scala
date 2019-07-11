package Day1

object Play {

  def main(args: Array[String]): Unit = {
    val a = for (i <- 1 to 8 if i > 2 if i < 6; j <- 1 to 8 if j > 1 if j < 6) yield (i, j)
    print(a)
  }


}
