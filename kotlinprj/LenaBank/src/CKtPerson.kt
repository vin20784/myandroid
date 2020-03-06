class CKtPerson(_id:Int,_name:String) {
    var id:Int
    var name:String

    init {
        id=0
        name=""
        if (id>0) id=_id
        _name?.let { name=_name }
    }
}
fun main()
{
    var obj = CKtPerson(2,"Andrey")

}

/*class CKtPerson( var id: Int, var name: String) {

}*/