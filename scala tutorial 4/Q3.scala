object Q5 {

    def toUpper(line:String):String={
    var letter=""
    line.foreach(i=>{
        if (i.isLower){
            letter+=i.toUpper ;
        }
        else{
            letter += i;
        }
        
    })
    return letter
    }

    def toLower(line:String):String={
    var letter=""
    line.foreach(i=>{
        if(i.isUpper)
        {
            letter += i.toLower ;
        }
        else
        {
            letter += i ;
        }
    })
    return letter
    }
    
    val formatName=(f:(String)=>String,name:String)=>{
    val string=f(name)
    println(string)
    }

    def main (args:Array[String]) : Unit =
    { 
        var word1="Benny"
        var word2="Niroshan"
        formatName(toUpper,word1)
        formatName(toLower,word2)
    }
}