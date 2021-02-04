//Extraccion de la primera iniciar del nombre y apellido

fun main () {
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
}