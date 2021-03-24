fun main() {
  greeting("Aisha")
    var x=moduls(88,3)
    println(x)
    var y=addition(44,22,21,5)
    println(y)
    interesting()
}
//Assignment 2
fun greeting(name:String){
    println("Hello $name")
}
fun moduls(num1:Int,num2:Int):Int{
    val remainder=num1%num2
    return remainder
}
fun addition(a:Int,b:Int,c:Int,d:Int):Int{
    var sum=a+b+c+d
    return sum
}
fun interesting(){
    var mySelf=("Hello am a nice person")
    println(mySelf)
}