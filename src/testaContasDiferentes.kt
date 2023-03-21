fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("Alex", 1000)
    val contaPoupanca = ContaPoupanca("Fran", 1001)

    println("Saldo inicial da conta corrente: ${contaCorrente.saldo}")
    println("Saldo inicial da conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo da conta corrente, após deposito: ${contaCorrente.saldo}")
    println("Saldo da conta poupança, após deposito: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo da conta corrente, após saque: ${contaCorrente.saldo}")
    println("Saldo da conta poupança, após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(200.0, contaPoupanca)

    println("Saldo da conta corrente, após transferência: ${contaCorrente.saldo}")
    println("Saldo da conta poupança, após transferência: ${contaPoupanca.saldo}")
}