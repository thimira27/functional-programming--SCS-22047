object Q2
{

    def main(args:Array[String]) : Unit =
    {
        def CtoFconverter(temperature : Double) : Double =
        {
            temperature * 1.8000 + 32.00
        }

        println("Fahrenheit : " + CtoFconverter(35) + " F")
    }
}