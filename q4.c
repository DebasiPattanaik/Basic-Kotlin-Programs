fun main() 
{
    var n = 12345
    var dup = n
    var rev = 0
    while(n!=0)
    {
        rev=rev*10
        rev=rev+n%10
        n=n/10
    }
    println("Reverse of $dup is $rev")
}
