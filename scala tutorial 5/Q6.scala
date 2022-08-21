object Q6{

    def Fibonacchi(a:Int): Int = a match {
        case x if x==0 => 0 
        case x if x==1 => 1
        case x => Fibonacchi(a-1) + Fibonacchi(a-2)
    }

    def FibonacchiPrint(a:Int) : Unit = {
        if(a>0) FibonacchiPrint(a-1)
        println(Fibonacchi(a))
    }

    def main (args:Array[String]) : Unit = {
        FibonacchiPrint(10) ;
    }

}