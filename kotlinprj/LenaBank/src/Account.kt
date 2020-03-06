//class Account (paccountNumber :Int,pholderName:String,pbalance:Double )
open class Account (private val accountNumber :Int, private val holderName:String, private var balance:Double )
{
    /*var accountNumber :Int = paccountNumber
    var holderName:String = pholderName
    var balance:Double = pbalance*/


    /*protected val test:Int = 0
         get() =field
    set(itest:Int){
        field = itest
    }*/

    infix fun deposit (amount: Double){

        balance+=amount
        //return this
    }

     /*fun deposit (amount: Double){

        balance+=amount

    }*/
    open infix fun Withdraw (amount: Double){

        balance-=amount
       // return this
    }

    fun printme() // this function can be made extention function
    {
        println("printing the values $accountNumber ,$holderName, $balance ")
    }

    //operator fun plusAssign(input:Double):Unit = deposit(input)
}

/*fun Account.printme()
{
    println("printing the values $accountNumber ,$holderName, $balance ")
}*/
// if extension function overrides the class memmber
/*fun Account.printme()
{
    println("printing baharwali values $accountNumber ,$holderName, $balance ")

}*/

/*fun Int.Cube():Int
{
    return this*this*this;
}*/


// fun main()
// {
//
// var ap = Account(562394,"vinz",5000.00)
// ap.printme()
// //ap deposit 6700.89 Withdraw 500.00  // using infix function
//
// //ap.printme()
// //ap.printme("hello")
// //10.Cube();
//
// //var i =0
// // i.plus(1)
//
// //ap += 3000.00 // calling operator overloading
// //ap.printme()
// //i plus 1
//
//
// }