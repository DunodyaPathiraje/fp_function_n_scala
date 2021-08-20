//2. Create a method sub to subtract two rational numbers
// and find an answer  x-y-z
// where x=3/4, y=5/8, z=2/7.


package functionsNdata {
  object Q2 extends App {
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)

    val result = x-y-z
    println("Result of x-y-z : "+result.numerator+" / "+result.denominator)
  }

}

