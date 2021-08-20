//1. Implement a Data Structure for Rational Number and create a method neg to class Rational that is used like this:
//x.neg  evaluates to -x

import java.util.Scanner

package functionsNdata{
  object Q1 {
    def main(args: Array[String]): Unit ={
      val input = new Scanner(System.in)
      print("Enter integer as numerator : ")
      val x = input.nextInt()
      print("Enter integer as denominator : ")
      val y = input.nextInt()
      val rational_num = new Rational(x,y)
      val result = rational_num.neg(rational_num)

      println("Negative value of the rational number : "+result.numerator+" / "+result.denominator)
    }
  }

}


