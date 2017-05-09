package _1_Hello._1_public

/**
  * Created by Ruslan.Kazantsev on 6/23/2016.
  */
object Class_Obj {
  def main(args: Array[String]) {
    println(new Example().f(0))
    println(new Example().f(1))
    println(Example.g(2)) // Static
    println(Example.g(3)) // Static

  }
}

class Example {
  def f(x: Int): Int = x + 1
}

object Example {
  def g(x: Int): Int = x + 1
}