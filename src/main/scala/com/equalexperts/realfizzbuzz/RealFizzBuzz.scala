package com.equalexperts.realfizzbuzz

object RealFizzBuzz {

  /**
   * Determines if a number is a multiple of 3
   *
   * @param x   number to verify
   * @return    true if it is a multiple, otherwise false
   */
  def isMultipleOfThree(x: Int) = x % 3 == 0

  /**
   * Determines if a number is a multiple of 5
   *
   * @param x   number to verify
   * @return    true if it is a multiple, otherwise false
   */
  def isMultipleOfFive(x: Int) = x % 5 == 0

  /**
   * Determines if a number is a multiple of 15
   *
   * @param x   number to verify
   * @return    true if it is a multiple, otherwise false
   */
  def isMultipleOfFifteen(x: Int) = x % 15 == 0

  /**
   * Determines if a number contains the digit 3
   *
   * @param x   number to verify
   * @return    true if this number contains the digit 3, otherwise false
   */
  def containsTheDigitThree(x : Int) = x.toString.contains("3")

  /**
   * Map a number to a string
   *
   * If a multiple of 3, 5 or 15 is found then either
   * fizz, buzz or fizzbuzz is returned respectively.
   * Otherwise, the string representation of the number
   * is returned.
   *
   * @param x   number to map
   * @return    returns a string
   */
  def numberToWord(x: Int): String = x match {
    case n if containsTheDigitThree(n) => "lucky"
    case n if isMultipleOfFifteen(n) => "fizzbuzz"
    case n if isMultipleOfFive(n) => "buzz"
    case n if isMultipleOfThree(n) => "fizz"
    case n => n.toString
  }


  /**
   * Parse the number range for multiples
   *
   * @param xs   a contiguous number range
   * @return     a string with the multiples of 3, 5 or 15
   *             replaced with their corresponding string
   *             or just the number itself
   */
  def parseNumbers(xs: Range): String = xs.map(x => numberToWord(x)).mkString(" ").trim

  def main(args: Array[String]) {
    println(parseNumbers(1 to 20))
  }
  
}
