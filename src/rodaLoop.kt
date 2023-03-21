fun rodaLoop() {
    var lista = listOf(1, 2, 2, 3)

    for (i in lista) {
        println("Passando no elemento [$i] da lista")
    }

    for (i in 5 downTo 1 step 2) {
        println("Passando no elemento [$i]")
    }
}