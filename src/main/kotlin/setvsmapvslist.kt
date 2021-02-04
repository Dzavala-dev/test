

//List vs Set vs Map

fun main () {



    //List
    val list = listOf("Donn", "Tushar", "Kavita", "Evelyn", "Felicia")

    //Set valores unicos
    val set = setOf("Donn", "Tushar", "Donn", "Tushar")
    //Will only include "Donn", "Tushar" once each

    //Map: Key Value Pairs
    val map= mapOf("Donn" to "Felker", "Tushar" to "Muhaj", "Evelyn" to "Smith")
    val map2 = mapOf(1 to "Donn", 2 to "Tushar")
    // se hace un Map del objeto Person
    val map3 = mapOf(Person("Donn") to "Android", Person("Tushar") to "J2EE")

    //Sequence
    val sequence = sequenceOf(1,2,3,4,5)
    list.asSequence()
    map.asSequence()
}

//data class Person(val name: String) //Person es el objeto