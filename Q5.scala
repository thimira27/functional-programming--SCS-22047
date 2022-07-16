object Q5 
{
    def main(args:Array[String]) : Unit =
    {
        def EasyPace(km : Double) : Double =
        {
            km * 8.0
        }

        def Tempo(km : Double) : Double =
        {
            km * 7.0
        }

        println(EasyPace(2)+Tempo(3)+EasyPace(2)+ " minutes" )
    }
}