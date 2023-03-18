
fun main() {
    println("Digite sua idade:")
    val idade = readLine()!!.toInt()

    val podeBeber = if (idade >= 18) {
        println("Opa!")
        "sim"
    } else {
        println(":(")
        "não"
    }

    var podeBeber2:String = ""
    if (idade >= 18) {
        podeBeber2 = "sim"
    } else {
        podeBeber2 = "não"
    }

    println("Digite uma operação matemática:")
    val a = readLine()!!.toInt()
    val op = readLine()!!
    val b = readLine()!!.toInt()

    val resultado = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> {
            println("Erro!")
            -1
        }
    }
    println("$a $op $b = $resultado")


//    when (op) {
//        "+" -> println("$a + $b = ${a + b}")
//        "-" -> println("$a - $b = ${a - b}")
//        "*" -> println("$a * $b = ${a * b}")
//        "/" -> println("$a / $b = ${a / b}")
//        else -> println("Operador inválido")
//    }


}