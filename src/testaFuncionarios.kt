fun testaFuncionarios() {
    var conta = Conta("Alex", 1000)
    println("Conta do: ${conta.titular}")

    var gerente = Gerente(nome = "Rafael", cpf = "011.111.111-11", salario = 5000.0, senha = 12345)

    var diretor = Diretor(nome = "Matheus", cpf = "012.111.111-22", salario = 10000.0, senha = 12345, plr = 10000.0)

    println("Funcionário: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificacao()}")

    println("Funcionário: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salário: ${diretor.salario}")
    println("PLR: ${diretor.plr}")
    println("Bonificação: ${diretor.bonificacao()}")


    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registraFuncionario(gerente)
    calculadoraBonificacao.registraFuncionario(diretor)

    println("Total de bonificação: ${calculadoraBonificacao.total}")
}