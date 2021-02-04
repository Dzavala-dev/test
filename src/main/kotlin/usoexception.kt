
//uso de la Exception, cuando la condicion no es cumplida

class Person(val name: String, val age: Int)

fun main () {
    val p = Person("David",13)
    if (p.age < 18) {
        throw Exception("User is not old enough")
    }


}
