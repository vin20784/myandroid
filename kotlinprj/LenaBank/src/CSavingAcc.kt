
class CSavingAcc(private val sacc :Int, private val sholderName:String, var sbalance:Double , val sMinBal:Double) :
    Account(sacc,sholderName,sbalance)
{
    override infix fun Withdraw (amount: Double) = if((sbalance-amount) < sMinBal)
        {
            println("limit exceeded , please try less amount!")
        }
        else {
        sbalance -= amount
        println(message = "Collect your money , $sbalance")
    }
}

// data class is like struct
data class User(var name: String = "", var age: Int = 0)
{
     private var hidden =100
}
fun main()
{
    var sobj = CSavingAcc(345, "vins", 5000.0, 500.0).also {
        it.Withdraw(6000.0)
        it.Withdraw(4500.0)
    }
    var dobj = User()
    dobj.age=78
    dobj.name="jiji"
    //dobj.hidden

    var test=1
    fun insidemain(): Int {
        var testb =2
        return testb
    }

    var sachin:String

    println(insidemain())
}