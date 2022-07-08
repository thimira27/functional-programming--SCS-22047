object Q4a {

  def NormalSalary(NHours:Int): Int =
    { NHours * 250 }

  def OtSalary(OHours:Int): Int =
    { OHours * 85 }

  def BasicSalary(NHours:Int,OHours:Int):Int =
    { NormalSalary(NHours) + OtSalary(OHours) }

  def Tax(salary:Int, NHours:Int , OHours:Int) : Double =
    { salary * 0.12 }

  def finalSalary(NHours:Int,OHours:Int): Double =
    { BasicSalary(NHours,OHours) - Tax(BasicSalary(NHours,OHours),NHours,OHours) }

  def main(args:Array[String]):Unit = 
    { println( finalSalary(40,30)) }

}