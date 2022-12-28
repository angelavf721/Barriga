#language: pt
  Funcionalidade: Resumo de Contas
    Como usuário
    Eu quero buscar meus resumos mensais
    Para controlar minhas movimentações

    Contexto: Movimentação de contas
      Dado que estou acessando a aplicação
      Quando informo o usuário "an@an"
      E a senha "123"
      E seleciono entrar
      Então visualizo a página inicial "Bem vindo, angel!"
      E seleciono Resumo Mensal

#  Cenario: Excluir movimentação
#
#  Cenario: Acessar movimentações de Novembro
#    E seleciono o Novembro
#    E o ano
#    E clico em buscar
#    Então vizualizo as movimentações de Novembro
#
