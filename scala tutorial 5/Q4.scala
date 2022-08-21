object Q4{

    def isodd(a:Int) : Boolean = !(isEven(a))
    
    def isEven(a:Int) : Boolean = a match {
        case 0 => true
        case _ => isodd(a-1)
    }

    def main (args:Array[String]) : Unit = {
        println(isEven(2));
    }
}