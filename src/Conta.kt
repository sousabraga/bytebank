open class Conta(var titular: String,
            val numero: Int) {
    var saldo: Double = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun transfere(valor: Double, contaDestino: Conta) {
        if (valor > 0 && saldo >= valor) {
            this.saca(valor)
            contaDestino.deposita(valor)
        }
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }
}