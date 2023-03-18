fun imprimeA() {
    println("A")
}

fun soma(a: Int, b: Int): Int {
    //...
    return a + b
}

fun subt(a: Int, b: Int) = a - b

fun imprimeIntervalo(x: Int = 5, y: Int = 10) {
    for (i in x..y) {
        print("$i, ")
    }
    println()
}


fun main() {
    imprimeA()

    println("10 + 10 = ${soma(10, 10)}")
    println("10 - 10 = ${subt(10, 10)}")

    imprimeIntervalo(0, 5)
    imprimeIntervalo(0)
    imprimeIntervalo()
    imprimeIntervalo(x = 20, y = 30)
    imprimeIntervalo(y = 8, x = 5)

}