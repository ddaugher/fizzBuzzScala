package fizzbuzz

import org.scalatest.FunSuite

class FizzBuzzTests extends FunSuite {

  val c = new FizzBuzz

  test("fizzbuzz returns '1' when it takes 1 as an argument.") {
    assert(c.fizzbuzz(1) === "1" )
  }

}
