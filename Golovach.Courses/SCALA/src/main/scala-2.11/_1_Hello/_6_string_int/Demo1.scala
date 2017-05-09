package _1_Hello._6_string_int

object Demo1 {
  val x: Int = 0
  val from0to5: Range = x.to(5)

  val s: String = "ABC"
  val c: Char = s.last
  val capitalized: String = s.capitalize

  def main(args: Array[String]) {
    println(from0to5)
    println("ABC".charAt(0))
  }
}
