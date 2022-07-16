object Q1 {


    def main (args:Array[String]) : Unit = 
    {
        def area(radius : Double) : Double = {
            math.Pi * radius * radius
        }

        println("Area : " + area(5))
    }
}