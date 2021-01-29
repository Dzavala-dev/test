import java.sql.DriverManager.println
import java.time.Clock.system
import kotlin.system.measureNanoTime

/*fun main (){
    val myAge = 32
    val yourAge = 32

    val myName = "Donn"
    val yourName = "Tusher"

    if ((myAge != yourAge) || (myName == yourName)) {
        println("Both items are true")
    }else{

    }
}*/
/*fun main() {
    val person = person ("David")
    val person2 = person ("David")
    val person3 = person

    println (person == person2)
    println (person === person2)
    println (person === person3)

}
class person (name: String)*/

/*fun main (){

    val people = listOf(
        Person( "Hola"),
        Person ("Hola"),
    Person ("Hola")
    )

    //for (i in 0 until 10 step 2){ //downTo cuenta hacia atras
      //  println(i)
    //}

    for (i in people){
        println(i)
    }
}

data class Person (val name: String)*/

/*fun main (){

    var x= 0;
    //while (keepGoing()){
    while (x < 10){
        println (x) //Todo va a corre siempre y acuanso este dentro del while y sea true
        x++
    }
    println ("All Done")
}

fun keepGoing():Boolean {
    return true
}*/

/*fun main (){

    val people = listOf(
        Person( "Donn"),
        Person ("Jake"),
        Person ("David"),
        Person ("Marcos")
    )
people.map {it.name}
    .map{it.toUpperCase() }
    .forEach{println(it.reversed())
    }
}

data class Person (val name: String)*/

/*fun main (){ //saber cuando tiempo se tarda en correr codigo
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
}*/

/*fun main () {

    //List vs Set vs Map

    //List
    val list = listOf("Donn", "Tushar", "Kavita", "Evelyn", "Felicia")

    //Set valores unicos
    val set = setOf("Donn", "Tushar", "Donn", "Tushar")
    //Will only include "Donn", "Tushar" once each

    //Map: Key Value Pairs
    val map= mapOf("Donn" to "Felker", "Tushar" to "Muhaj", "Evelyn" to "Smith")
    val map2 = mapOf(1 to "Donn", 2 to "Tushar")
    val map3 = mapOf(Person("Donn") to "Android", Person("Tushar") to "J2EE") // se hace un Map del objeto Person

    //Sequence
    val sequence = sequenceOf(1,2,3,4,5)
    list.asSequence()
    map.asSequence()
}

data class Person(val name: String) //Person es el objeto */

/*fun main (){

    val person: Person? = null

    if (checkNotNull(person).name == "Donn"){
        println("Hi Donn!")
    }else {
        println("Hi!")
    }
}

class Person (val name: String)*/

/*fun main () {

    val listOfString: List<String> = listOf("Donn", "Jhon", "Daniel")
    val listOfInts: List<Int> = listOf(1,2,3,4,5)

    val result: EvenList<String> = EvenList(listOfString)
    println(result.evenItems())

    val otherResult: EvenList<Int> = EvenList(listOfInts)
    println(otherResult.evenItems())

    val people: List<Person> = listOf(
        Person("Donn"),
        Person("Bob"),
        Person("Mary"),
        Person("Felicia")
    )
    println(EvenList(people).evenItems())

}

data class Person(val name: String)

class EvenList<T>(val list: List<T>){
    fun evenItems(): List<T> {
        return list.filterIndexed { index, value -> index % 2 == 0 }
    }
}*/

/*fun main () {
    val p = Person("David",13)
    if (p.age < 18) {
        throw Exception("User is not old enough")
    }
}

data class Person(val name: String, val age: Int)*/

 /*fun main () {
     val name = "Donn Felker"
     println(name.initials())

     val book = "Daily Stoic"
     println(book.initials())
 }

fun String.initials(): String {
    val values : List<String> = this.split ( ' ')
    val firstInitial: String = values[0].substring(0, 1)
    val lastInitial: String = values[1].substring(0,1)
    return "$firstInitial$lastInitial"
}*/

//Lambda expression funtion
fun main ()
{
    derbyAnnouncer {player: String ->
        "$player is a great asset to the team."
    }
}

fun derbyAnnouncer(block: (String) -> String){
    val players = listOf(
        "McGwire",
        "Canseco",
        "Honeycutt",
        "David",
        "Weiss")

    val ramdomPlayer = players.random()
    println("The next player is ... $ramdomPlayer")
    val announcerMessage = block(ramdomPlayer)
    println(announcerMessage)
}

