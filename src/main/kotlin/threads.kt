import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun threadsCount(limit: Int)
{
    for (i in 1.. limit) thread {
        Thread.sleep(100)
        print("T$i ")
    }
    println()
}

fun doCoroutines(limit: Int)
{
    runBlocking {
        for (i in 1..limit) {
            launch {
                delay(100)
                print("A $i")
            }
        }
        println()
    }
}

fun  main(){
    doCoroutines(100)
    threadsCount(100)
}