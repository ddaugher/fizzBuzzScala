package fizzbuzz

import org.scalatest.FunSuite

class FizzBuzzTests extends FunSuite {

  val c = new FizzBuzz

  test("fizzbuzz returns 'Fizz' when argument is multiple of 3") {
    assert(c.calculate(List(3)) === List("Fizz"))
  }

  test("fizzbuzz returns 'Fizz' when argument contains a digit equal to three") {
    assert(c.calculate(List(37)) === List("Fizz"))
  }

  test("fizzbuzz returns 'Buzz' when argument is multiple of 5") {
    assert(c.calculate(List(5)) === List("Buzz"))
  }
}
