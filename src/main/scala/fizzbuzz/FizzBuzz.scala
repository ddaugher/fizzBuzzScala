package fizzbuzz

class FizzBuzz {

  def calculate(list: List[Int]): List[String] = {
    list map { calculateFizzBuzz(_) }
  }

  private def calculateFizzBuzz(num: Int): String = {
    if (num.equals(0)) return "ZERO"

    def string = calculateFizz(num) + calculateBuzz(num)
    if (string.isEmpty) num.toString else string
  }

  private def calculateFizz(num: Int): String = {
    if (num.toString.contains("3")) {
      return "Fizz"
    }

    performModCalc(num, 3, "Fizz")
  }

  private def calculateBuzz(num: Int): String = {
    if (num.toString.contains("5")) {
      return "Buzz"
    }

    performModCalc(num, 5, "Buzz")
  }

  private def performModCalc(num: Int, mod: Int, retString: String): String = {
    (num % mod) match {
      case (0) => retString
      case _ => ""
    }
  }
}