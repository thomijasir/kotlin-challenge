fun main(args: Array<String>) {
  val a = 5
  val b = 5

  val result = SumNumber(a, b)

  println(result)

  try {
    println(a/b)
  } catch (e: ArithmeticException) {
    print("ERROR: ${e.message}")
  }
}

val SumNumber = {num1: Int, num2: Int ->
  println("MY LAMBDA")
  val result = num1 + num2
  result
}

