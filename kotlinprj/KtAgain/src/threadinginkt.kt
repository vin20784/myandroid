import kotlin.concurrent.thread

class MyRunnable : Runnable{

    override fun run() {
        println("Runnable ${Thread.currentThread().name} is sleeping")
        Thread.sleep(2000).also {  println("Runnable ${Thread.currentThread().name} is in also")}
        println("Runnable ${Thread.currentThread().name} is running")
            }
}
class MyThread : Thread() {

    override fun run() {

        println("Thread ${Thread.currentThread().name} is sleeping")
        sleep(1000L)
        println("Thread ${Thread.currentThread().name} is running")


    }
}


fun main() {
    var thrdobj = MyThread().also { it.start() }

    Thread(MyRunnable()).apply { start() }
    thrdobj.run()

    Thread{println("SAM ${Thread.currentThread().name} is running")}.start()

    thread ( start=true,name="whateverthread" ){
        repeat(10_000)
        {
        println("SAM func ${Thread.currentThread().name}  is running")
        }
    }
}
