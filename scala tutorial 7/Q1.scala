object Q1 extends App {
    val obj1 = new Rational(1,2)
    val obj2 = new Rational(4,5)
    println(obj1.neg)
    val q = obj1.add(obj2)
    println(q)
}

class Rational(x:Int, y:Int) {
    require(denom > 0, "Denominator must be greater than 0")     // check the condition
    def numer = x
    def denom = y

    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}