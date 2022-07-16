object Q3
{
    def main (args : Array[String]) : Unit =
    {
        def volume(radius : Double) : Double =
        {
           4.0 / 3.0  * math.Pi * math.pow(radius,3)
        }

        println("Volume : " + volume(5))
    }
}