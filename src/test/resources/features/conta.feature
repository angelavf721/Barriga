#language: pt
@cenario
  Funcionalidade: Cadastro de contas
    Como um usuário
    Gostaria de cadastrar contas
    Para que eu possa distribuir meu dinheiro de uma forma mais organizada

    Contexto: Mensagens Contas
      Dado que estou acessando a aplicação
      Quando informo o usuário
      E a senha
      E seleciono entrar
      Então visualizo a página inicial "Bem vindo, angel!"
      Quando seleciono Contas


    Cenário: Criar conta nova
      E seleciono Adicionar
      E informo o nome "Conta nova"
      E clico em salvar
      Então recebo a mensagem "Conta adicionada com sucesso!"


    Cenário: Criar conta mesmo nome
      E seleciono Adicionar
      E informo o conta "Conta mesmo nome"
      E clico em salvar
      Então recebo a mensagem "Já existe uma conta com esse nome!"


    Cenário: Criar conta sem nome
      E seleciono Adicionar
      E clico em salvar
      Então recebo a mensagem "Informe o nome da conta"


    Cenário: Editar conta
        E seleciono listar
        E clico no icone de editar
        E informo o nome "Conta Editada"
        E clico em salvar
        Então recebo a mensagem "Conta alterada com sucesso!"


    Cenário: Excluir conta
        E seleciono listar
        E clico no icone de excluir
        Então recebo a mensagem "Conta removida com sucesso!"

