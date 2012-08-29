package fizzbuzz

import org.scalatest.FunSuite

class FizzBuzzTests extends FunSuite {

  val c = new FizzBuzz

  test("fizzbuzz returns 'Fizz' when argument is multiple of 3") {
    assert(c.calculate(List(3)) === List("Fizz"))
  }

}
