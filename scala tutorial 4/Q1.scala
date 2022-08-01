object Q1 {

    def TotalAmout(value:Int) : Double =  
    {
        if (value < 20000) value * 1.02
        else if (value < 200000 ) value * 1.04
        else if (value < 2000000 ) value * 1.035
        else value * 1.065 
    }

    def main (args:Array[String]) : Unit = 
    {
        val deposit = 50000 ;
        println(" actual amount of interest that the money earns in a year : " + TotalAmout(deposit));
    }
}
