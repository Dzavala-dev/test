fun main () {

    println ("Please enter an aritmetic problem ... ")
    var input  = readLine()
    while (input != null && input.isNotBlank()) {
        //println ("You entered $input")

        val values  = input.split(' ')

        //validaciones

        if (values.size < 3){
            println("invalid input. Expected: value + value. Receiived: $input")
        }else {

            val operator = values[1]
            val lhs = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("invalid input: ${values[0]}")
            val rhs = values[2].toDoubleOrNull() ?: throw IllegalArgumentException("invalid input: ${values[1]}")

            val result = when (operator) {
                "+" -> lhs + rhs
                "-" -> lhs - rhs
                "*" -> lhs * rhs
                "/" -> lhs / rhs
                else -> throw IllegalArgumentException("invalid Operator: $operator")
            }
            println(result)
        }
        input = readLine()
    }
    println ("Goodbye!")
}
