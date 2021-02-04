//el uso de dos lista implementado el index para la obtencion de la informacion requerida

fun main () {

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

//data class Person(val name: String)

class EvenList<T>(val list: List<T>){
    fun evenItems(): List<T> {
        return list.filterIndexed { index, value -> index % 2 == 0 }
    }
}