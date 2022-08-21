object Q2 {

  def gcd( a: Int , b: Int) : Int=b match {
    case 0 => a;
    case x if x>a => gcd(x,a);
    case x if x<=a => gcd(x,a%x);
  }

  def Prime(n : Int , i : Int = 2 ) : Int = i match {
    case x if(n==1) => 0 ;
    case x if(x==n) => n ;
    case x if (gcd(n , x) > 1) => 0 ;
    case x => Prime(n , x+1) ;
            
  }

  def PrimeSeq(a:Int) : Unit = {
    if(a > 2) PrimeSeq(a-1)
    if(Prime(a) != 0) println(a) 
  }

  def main (args:Array[String]) : Unit = {
    PrimeSeq(10) ;
  }

}