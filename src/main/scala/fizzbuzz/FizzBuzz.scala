package fizzbuzz

class FizzBuzz {

  def calculate(list: List[Int]): List[String] = {
    list map { calculateFizzBuzz(_) }
  }

  private def calculateFizzBuzz(num: Int): String = {
    def string = calculateFizz(num) + calculateBuzz(num)
    string
  }

  private def calculateFizz(num: Int): String = {
    if (num.toString.contains("3")) {
      return "Fizz"
    }

    (num % 3) match {
      case (0) => "Fizz"
      case _ => ""
    }
  }

  private def calculateBuzz(num: Int): String = {
    if (num.toString.contains("5")) {
      return "Buzz"
    }

    (num % 5) match {
      case (0) => "Buzz"
      case _ => ""
    }
  }
}