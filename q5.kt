fun main() 
{
    var n = 1331
    var dup = n
    var rev = 0
    while(n!=0)
    {
        rev=rev*10
        rev=rev+n%10
        n=n/10
    }
    if(dup==rev)
    {
        println("Palindrome")
    }
    else
    {
        println("Not Palindrome")
    }
}
