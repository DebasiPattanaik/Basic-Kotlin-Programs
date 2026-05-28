fun main() 
{
    var n = 12345
    var dup = n
    var sum = 0
    while(n!=0)
    {
        sum=sum+n%10
        n=n/10
    }
    println("Sum of digits of $dup is $sum")
}
