fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("O saldo é positivo")
    } else if (saldo == 0.0) {
        println("O saldo é neutro")
    } else {
        println("O saldo é negativo")
    }

    when {
        saldo > 0.0 -> println("O saldo é positivo")
        saldo == 0.0 -> println("O saldo é neutro")
        else -> println("O saldo é negativo")
    }
}