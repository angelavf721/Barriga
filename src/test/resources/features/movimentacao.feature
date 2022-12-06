#language: pt
  Funcionalidade: Movimentação de contas
    Como um usuário
    Gostaria de fazer movimentações na minha conta
    Para que eu possa movimentar meu dinheiro

    Contexto: Movimentação de contas
      Dado que estou acessando a aplicação
      Quando informo o usuário "an@an"
      E a senha "123"
      E seleciono entrar
      Então visualizo a página inicial "Bem vindo, angel!"
      E seleciono Conta Movimentação

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

    Cenario: Formulario em branco
      Quando clico em salvar
      Então recebo a mensagem de erro em branco

    Cenario: Data da Movimentação é obrigatório
      E seleciono despesa
      E insiro data da movimentação ""
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E informo o valor "500"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem "Data da Movimentação é obrigatório"

    Cenario: Data do pagamento é obrigatório
      E seleciono despesa
      E insiro data da movimentação "12/02/1999"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E informo o valor "500"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem "Data do pagamento é obrigatório"

    Cenario:Descrição é obrigatório
      E seleciono despesa
      E insiro data da movimentação "12/02/1999"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição ""
      E informo o interessado "panqueca"
      E informo o valor "500"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem "Descrição é obrigatório"

    Cenario: Interessado é obrigatório
      E seleciono despesa
      E insiro data da movimentação "12/02/2012"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado ""
      E informo o valor "500"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem "Interessado é obrigatório"

    Cenario: Valor é obrigatório
      E seleciono despesa
      E insiro data da movimentação "12/02/2012"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E informo o valor ""
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem de erro no valor


    Cenario: Valor deve ser um número
      E seleciono despesa
      E insiro data da movimentação "12/02/2012"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E informo o valor "N"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem "Valor deve ser um número"


    Cenario: Data da Movimentação deve ser menor
      E seleciono despesa
      E insiro data da movimentação "08/02/2023"
      E insiro a data do pagamento "12/02/2012"
      E insiro a descrição "Sou a descrição da movimentação"
      E informo o interessado "panqueca"
      E informo o valor "500"
      E seleciono a conta nova
      E seleciono a situação pago
      Quando clico em salvar
      Então recebo a mensagem "Data da Movimentação deve ser menor ou igual à data atual"

