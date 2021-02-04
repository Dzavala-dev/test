
//creación de un while dentro de una funcion
fun main (){

    var x= 0;
    //while (keepGoing()){
    while (x < 10){
        println (x) //Todo va a corre siempre y a cuando este dentro del while y sea true
        x++
    }
    println ("All Done")
}

fun keepGoing():Boolean {
    return true
}