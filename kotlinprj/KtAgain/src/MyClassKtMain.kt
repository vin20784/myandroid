class MyClassKtMain {

    var m_max =89
    companion object {

        var m_max = 42
        fun mygetMax() = m_max

    }

    fun doWhatever()
    {

        println("Whatever!")
    }


}

//blueprint IsAKindOf
abstract class Human(){

    abstract fun eat()
}

interface Musician {

    fun play()

}
class Person:Human(),Musician
{




    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun play() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}


fun main()
{
    //var obj = Human()

    MyClassKtMain.m_max =10 // accessing companion obj
    //MyClassKtMain.m_max
    //var outmax = MyClassKtMain.merasathi.mygetMax()
    var myobj = MyClassKtMain()
    myobj.doWhatever()


}