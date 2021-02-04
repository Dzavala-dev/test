import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main (){ //saber cuando tiempo se tarda en correr codigo
    lateinit var list:List<Int>
    mesuare {
        list = generateSequence(1) {it + 1 }
            .take(50_000_000)
            .toList()

        val result = list
            .filter {it % 3 ==0 }
            .average()
        println("done")
        println(result)
    }
}

fun mesuare(block: ()-> Unit){
    val nantime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nantime)
    println("$millis ms")
}