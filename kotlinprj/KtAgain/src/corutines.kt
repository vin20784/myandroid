import kotlinx.coroutines.*
fun main ()
{

    runBlocking {hell()}

}

 fun hell()
{
    //runBlocking{

        var job = launch(Dispatchers.Default){repeat(100_0){println("im in launch") }}

        async(Dispatchers.Default){repeat(100_0){println("im in async") }}

        run { repeat(100_0){println("im in run") }}

        //job.join()
        println("im in runBlocking")

    //}

}
