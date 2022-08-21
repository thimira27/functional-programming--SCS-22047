object Q1 {

    def gcd( a: Int , b: Int) : Int=b match {
            case 0 => a;
            case x if x>a => gcd(x,a);
            case x if x<=a => gcd(x,a%x);
        }


    def Prime(n : Int , i : Int = 2 ) : Boolean= i match {
            case x if(n==1) => false ;
            case x if(x==n) => true ;
            case x if (gcd(n , x) > 1) => false ;
            case x => Prime(n , x+1) ;
            
        }

    def main (args:Array[String]) : Unit = {
            println(Prime(2)) ;
        }
}