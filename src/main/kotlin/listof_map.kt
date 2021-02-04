//creacion de una lista de personas y mapeando a cada una de ellas

fun main (){

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

