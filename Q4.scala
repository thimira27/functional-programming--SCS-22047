object Q4 
{
    def main(args:Array[String]) : Unit =
    {
        def TotalCost(copies : Int) : Double = 
        {
            val TcoverPrice = (copies * 24.95 * 0.4) 

            if(copies <= 50) (copies * 3 + TcoverPrice)
            else ((3 * 50) + ((copies-50) * 0.75) + TcoverPrice )
        }

        println("Rs. " + TotalCost(30))
    }
}
