#language: pt

  Funcionalidade: Movimentação de contas
    Como um usuário
    Gostaria de fazer movimentações na minha conta
    Para que eu possa movimentar meu dinheiro

    Contexto: Movimentação de contas
      Dado que estou acessando a aplicação
      Quando informo o usuário
      E a senha
      E seleciono entrar
      Então visualizo a página inicial "Bem vindo, angel!"
      E seleciono Conta Movimentação

    @cenario
    Cenario: Movimentação pendente
      E insiro data da movimentação "12/02/1999"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E informo o valor "500"
      E seleciono a conta nova
      E seleciono a situação pendente
      Quando clico em salvar
      Então recebo a mensagem "Movimentação adicionada com sucesso!"

    @cenario
    Cenario: Movimentação paga
      E insiro data da movimentação "12/02/1999"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E informo o valor "500"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem "Movimentação adicionada com sucesso!"

    @cenario
    Cenario: Movimentação Despesa
      E seleciono despesa
      E insiro data da movimentação "12/02/1999"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E informo o valor "500"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem "Movimentação adicionada com sucesso!"

    @esquemaCenario
    Esquema do Cenario: Erros da Movimentação
      E seleciono despesa
      E insiro data da movimentação "<dataMovi>"
      E insiro a data do pagamento "<dataPagamento>"
      E insiro a descrição "<Descrição>"
      E informo o interessado "<interessado>"
      E informo o valor "<valor>"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a "<mensagem>"
      Exemplos:
      |  dataMovi  | dataPagamento |              Descrição              |   interessado   |  valor  ||                    mensagem                                     |
      |            |  12/02/2012   |  Sou a descrição da movimentação    |    panqueca     |   500   ||    Data da Movimentação é obrigatório                           |
      | 12/02/1999 |               |  Sou a descrição da movimentação    |    panqueca     |   500   ||    Data do pagamento é obrigatório                              |
      | 12/02/1999 |  12/02/2012   |                                     |    panqueca     |   500   ||    Descrição é obrigatório                                      |
      | 12/02/1999 |  12/02/2012   |  Sou a descrição da movimentação    |                 |   500   ||    Interessado é obrigatório                                    |
      | 12/02/1999 |  12/02/2012   |  Sou a descrição da movimentação    |    panqueca     |    N    ||    Valor deve ser um número                                     |
      | 08/02/2023 |  12/02/2012   |  Sou a descrição da movimentação    |    panqueca     |   500   ||    Data da Movimentação deve ser menor ou igual à data atual    |

    @cenario
    Cenario: Formulario em branco
      Quando clico em salvar
      Então recebo a mensagem de erro em branco

    @cenario
    Cenario: Valor é obrigatório
      E seleciono despesa
      E insiro data da movimentação "12/02/2012"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem de erro no valor



