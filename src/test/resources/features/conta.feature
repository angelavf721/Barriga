#language: pt
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


    @esquemaCenario
    Esquema do Cenario: Adicionar conta
      E seleciono Adicionar
      E informo o nome "<conta>"
      E clico em salvar
      Então recebo a mensagem "<mensagem>"
      Exemplos:
        |        conta           |               mensagem                 |
        |      Conta nova        |    Conta adicionada com sucesso!       |
        |      Conta nova        |   Já existe uma conta com esse nome!   |
        |                        |        Informe o nome da conta         |

    @cenario1
    Cenário: Editar conta
        E seleciono listar
        E clico no icone de editar
        E informo o nome "Conta Editada"
        E clico em salvar
        Então recebo a mensagem "Conta alterada com sucesso!"

    @cenario
    Cenário: Excluir conta
        E seleciono listar
        E clico no icone de excluir
        Então recebo a mensagem "Conta removida com sucesso!"
