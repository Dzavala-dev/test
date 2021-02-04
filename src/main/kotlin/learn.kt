import java.sql.DriverManager.println

fun main() {
    val person = person ("David")
    val person2 = person ("David")
    val person3 = person

    println (person == person2)
    println (person === person2)
    println (person === person3)

}
class person (name: String)



