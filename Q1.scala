package labsheet9
object Q1 extends App {
  val r1 = new Rational(3, 7)
  println(r1)

  println("Negative value of the rational number : " + r1.neg)

  class Rational(n: Int, d: Int) {
    def numer = n

    def denom = d


    def neg = new Rational(-this.numer, this.denom)


    def +(that: Rational) = new Rational(this.numer * that.denom + this.denom * that.numer, this.denom * that.denom)


    def -(that: Rational) = this + that.neg
    override def toString = numer + "/" + denom
  }
}


