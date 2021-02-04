import java.sql.DriverManager

//Lambda expression funtion, creacion de una lambda en una funcion
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
    DriverManager.println("The next player is ... $ramdomPlayer")
    val announcerMessage = block(ramdomPlayer)
    DriverManager.println(announcerMessage)
}
