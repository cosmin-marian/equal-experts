package com.equalexperts.realfizzbuzz

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class RealFizzBuzzTest extends FeatureSpec with GivenWhenThen with Matchers {

  feature("RealFizzBuzz Parser") {
    scenario("An empty number range") {
      Given("an empty number range")
      val range = 0 until 0

      When("this number range is parsed")
      val actual = RealFizzBuzz.parseNumbers(range)

      Then("an empty string should be returned")
      actual should equal("")
    }

    scenario("Handle special case of zero") {
      Given("a number range with just zero")
      val range = 0 to 0

      When("this number range is parsed")
      val actual = RealFizzBuzz.parseNumbers(range)

      Then("fizzbuzz should be returned since 0 is a multiple of any integer")
      actual should equal("fizzbuzz")
    }

    scenario("Handle special case of a number range with just three") {
      Given("a number range with just three")
      val range = 3 to 3

      When("this number range is parsed")
      val actual = RealFizzBuzz.parseNumbers(range)

      Then("fizz should be returned")
      actual should equal("fizz")
    }

    scenario("Handle special case of a number range with just five") {
      Given("a number range with just five")
      val range = 5 to 5

      When("this number range is parsed")
      val actual = RealFizzBuzz.parseNumbers(range)

      Then("buzz should be returned")
      actual should equal("buzz")
    }

    scenario("Handle special case of a number range with just 15") {
      Given("a number range with just 15")
      val range = 15 to 15

      When("this number range is parsed")
      val actual = RealFizzBuzz.parseNumbers(range)

      Then("fizzbuzz should be returned")
      actual should equal("fizzbuzz")
    }

    scenario("Handle special case of a single number which is not a multiple of 3,5, or 15") {
      Given("a number range which does not have a multiple of 3,5 or 15")
      val range = 28 to 29

      When("this number range is parsed")
      val actual = RealFizzBuzz.parseNumbers(range)

      Then("the numbers should be returned")
      actual should equal("28 29")
    }

    scenario("A number range with multiples of 3, 5, and 15") {
      Given("a number range with multiples of 3, 5, and 15")
      val range = 1 to 20

      When("this number range is parsed")
      val actual = RealFizzBuzz.parseNumbers(range)

      Then("all multiples should be replaced with their corresponding word")
      actual should equal("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz")
    }

    scenario("A negative number range with multiples of 3, 5, and 15") {
      Given("a negative number range with multiples of 3, 5, and 15")
      val range = -20 to -1 by 1

      When("this number range is parsed")
      val actual = RealFizzBuzz.parseNumbers(range)

      Then("all multiples should be replaced with their corresponding word")
      actual should equal("buzz -19 fizz -17 -16 fizzbuzz -14 -13 fizz -11 buzz fizz -8 -7 fizz buzz -4 fizz -2 -1")
    }

  }

}
