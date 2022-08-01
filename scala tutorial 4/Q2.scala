import java.{util => ju}
object Q4 {

    def typeofnumber(number : Int ) : String = 
    {
        if ( number > 0 && number%2==0 ) "Even number";
        else if (number > 0 && number%2!=0) "Odd number";
        else if ( number == 0 ) "Zero" ;
        else "Negative"
    }
    def main (args:Array[String]) : Unit =
    { 
        println("Enetr number : ");
        var number = scala.io.StdIn.readInt() ;
        println(typeofnumber(number));
    }

}