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
  
  test("fizzbuzz returns '1' when argument 1") {
    assert(c.calculate(List(1)) === List("1"))
  }

  test("fizzbuzz returns 'FizzBuzz' when argument is multiple of 3 and 5") {
    assert(c.calculate(List(15)) === List("FizzBuzz"))
  }

  test("fizzbuzz returns list of 'Fizz' when argument list is all multiple of 3") {
    assert(c.calculate(List(3,6,9,12,18)) === List("Fizz","Fizz","Fizz","Fizz","Fizz"))
  }

  test("fizzbuzz returns list of 'Buzz' when argument list is all multiple of 5") {
    assert(c.calculate(List(5,10,20,25,40)) === List("Buzz","Buzz","Buzz","Buzz","Buzz"))
  }

  test("fizzbuzz returns list of 'FizzBuzz' when argument list is all multiple of 3 and 5") {
    assert(c.calculate(List(15,30,45,60,75)) === List("FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz"))
  }

  test("fizzbuzz returns 'ZERO' when argument is 0") {
    assert(c.calculate(List(0)) === List("ZERO"))
  }
}
