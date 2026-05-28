fun main() 
{
    var a = 0
    var b = 1
    var c = a+b
    var n = 10
    println("First $n Fibonacci Numbers")
    for(i in 1..n)
    {
        print("$a ")
        a=b
        b=c
        c=a+b
    }
}
