class CPrim(id:Int,name:String) {

    var _id:Int
    var _name:String
    init {

        _id=id
        _name=name

    }
    constructor(id:Int) : this(id,"what") {
        //println()
       // _id=id
    }

}
fun main()
{
    var c = CPrim(5,"ju")
    println("${c._id},${c._name}")
    var c1 = CPrim(2)
    println("${c1._id},${c1._name}")
}