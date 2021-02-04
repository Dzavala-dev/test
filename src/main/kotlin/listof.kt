
//creacion de una lista
//For comentado cuenta de 2 en 2 hasta llegar 10
fun main (){

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

data class Person (val name: String)