object Q4b {

    def TotalPeople(bestPrice : Int) : Int =
        { 120 + ( ( 15 - bestPrice) * 5 / 20 ) }
    

    def TotalIncome(bestPrice : Int) : Int =
        { TotalPeople(bestPrice) * bestPrice  }
    

    def TotalOutcome(bestPrice : Int ) : Int =
        { 500 + 3 * TotalPeople(bestPrice) } 
    

    def Totalprofit(bestPrice : Int ) : Double =
        { TotalIncome(bestPrice) - TotalOutcome(bestPrice) }
    
    def main(args:Array[String]) : Unit = 
    {
		var bestPrice = 24 ;
		println(Totalprofit(bestPrice)); 
    }
}