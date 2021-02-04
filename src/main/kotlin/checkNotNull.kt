
//uso del notNull
fun main (){

    val person: Person? = null

    if (checkNotNull(person).name == "Donn"){
        println("Hi Donn!")
    }else {
        println("Hi!")
    }
}

//class Person (val name: String)