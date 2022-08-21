object Q3 {

    def sum(a:Int): Int = {
        a match{
            case 1 => a;
            case _ => a + sum(a-1);
        } 
    }
    def main (args:Array[String]) : Unit = {
        println(sum(5));
    }
}