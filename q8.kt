fun main() 
{
    var n = 54362
    var digits = 0
    while(n!=0)
    {
        digits++
        n=n/10
    }
    println("Number of digits is $digits")
}
