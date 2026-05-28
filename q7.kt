fun main() 
{
    var a = 5
    var b = 8
    var c = 2
    if(a>b)
    {
        if(a>c)
        {
            println("$a is largest")
        }
        else
        {
            println("$c is largest")
        }
    }
    else
    {
        if(b>c)
        {
            println("$b is largest")
        }
        else
        {
            println("$c is largest")
        }
    }
}
