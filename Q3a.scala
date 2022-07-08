object Q2a{

    def main(args:Array[String]) : Unit = 
    {
        var a : Int = 2 ;
        var b : Int = 3 ;
        var c : Int = 4 ;
        var d : Int = 5 ;
        var k : Float = 4.3f ;

        println(  --b * a + c * d--) ;     //  -- is not valid operator
        println(  a++ ) ;                  //  ++ is not valid operator
        println(  -2 *  (g - k)  + c ) ;   //  rounding error
        println(  c = c++) ;               //  ++ is not valid operator
        println(  c = ++c * a++ ) ;        //  ++ is not valid operator
    }

}