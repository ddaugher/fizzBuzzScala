package fizzbuzz

import org.scalatest.FunSuite

class FizzBuzzTests extends FunSuite {

  val c = new FizzBuzz

  test("fizzbuzz returns '1' when it takes 1 as an argument.") {
    assert( c.fizzbuzz(1) === "1" )
  }

  test("fizzbuzz returns '2' when it takes 2 as an argument") {
    assert( c.fizzbuzz(2) === "2" )
  }

  test("fizzbuzz returns 'fizz' when argument is multiple of 3") {
    assert( c.fizzbuzz(3) === "fizz" )
  }
}
