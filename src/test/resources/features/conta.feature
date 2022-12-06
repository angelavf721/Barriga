#language: pt
  Funcionalidade: Cadastro de contas
    Como um usuário
    Gostaria de cadastrar contas
    Para que eu possa distribuir meu dinheiro de uma forma mais organizada

    Contexto: Mensagens Contas
      Dado que estou acessando a aplicação
      Quando informo o usuário "an@an"
      E a senha "123"
      E seleciono entrar
      Então visualizo a página inicial "Bem vindo, angel!"
      Quando seleciono Contas
      E seleciono Adicionar

    Esquema do Cenario: Adicionar conta
      E informo o nome "<conta>"
      E clico em salvar
      Então recebo a mensagem "<mensagem>"
      Exemplos:
        |        conta           |               mensagem                 |
        |      Conta nova        |    Conta adicionada com sucesso!       |
        |      Conta nova        |   Já existe uma conta com esse nome!   |
        |                        |        Informe o nome da conta         |

    Cenário: Editar conta
        E seleciono listar
        E clico no icne de editar
        E informo o nome "Conta Editada"
        E clico em salvar
        Então recebo a mensagem "Conta alterada com sucesso!"

    Cenário: Excluir conta
        E seleciono listar
        E clico no icne de excluir
        Então recebo a mensagem "Conta removida com sucesso!"
