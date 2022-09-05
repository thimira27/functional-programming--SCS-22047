object Main extends App {

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val Encryption=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)               //anonymous function

    val Decryption=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)               //anonymous function

    val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))   //high order function

    val stringName = "TTTTTT"
    val EncryptedString=cipher(Encryption,stringName,5,alphabet)
    println(EncryptedString);

    val DecryptedString=cipher(Decryption,EncryptedString,5,alphabet)
    println(DecryptedString);

} 