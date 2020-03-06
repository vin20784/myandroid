import javax.sql.CommonDataSource
import kotlin.reflect.KProperty

interface Documenter {
    fun writeDoc()/*{println("hello im in Documenter")}*/
}

class CommonDoc :Documenter {

    var p: String by DelegateMe()
    override fun writeDoc(){
        println("im in CommonDoc ")
    }
}

 // first way : self implement
/*class Developer : Documenter
{
    override fun writeDoc() {println("im in Developer + Doc creator")}
}

class Developer : Documenter by CommonDoc()
{
    override fun writeDoc() {println("im in Developer by commondoc")}
}*/

class Developer (var common: Documenter ) : Documenter by CommonDoc()
{

}

class what {
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
}

class Box<T>(t: T) {
    var value = t
}

fun main() {

    val box: Box<Int> = Box<Int>(1)
    val boxstr: Box<String> = Box<String>("hello")


    var wobj = what()
    println(wobj.lazyValue)
    println(wobj.lazyValue)

    var common = CommonDoc()
    println(common.p)
    var dev = Developer(common)
    dev.writeDoc()
}