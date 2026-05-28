fun main() 
{
    var n = 20
    var count = 0
    println("Prime numbers from 1 to $n")
    for(i in 1..n)
    {
        count = 0
        for(j in 1..i)
        {
            if(i%j==0)
            {
                count++
            }
        }
        if(count==2)
        {
            print("$i ")
        }
    }
}
