package functionsNdata

class Rational (a:Int, b:Int){
  require(denominator != 0, "Cannot define as Rational number")
  def numerator: Int = a
  def denominator: Int = b

  def neg(r:Rational): Rational = new Rational(-r.numerator, r.denominator)

  def add(r:Rational):Rational = new Rational(this.numerator*r.denominator+this.denominator*r.numerator, this.denominator*r.denominator)

  def -(r:Rational):Rational = this.add(r.neg(r: Rational))


}
