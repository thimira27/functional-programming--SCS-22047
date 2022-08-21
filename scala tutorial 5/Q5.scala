object Q5{

    def GivenN(a:Int) : Int =  {
        a match{
            case 0 => a ;
            case x if( a % 2 == 0) => a + GivenN(a-2) ;
            case x if( a % 2 != 0) => GivenN(a-1) ; 
        }
    }

    def main (args:Array[String]) : Unit = {
        val number =12 ;
        println(GivenN(number-1));
    }
}

