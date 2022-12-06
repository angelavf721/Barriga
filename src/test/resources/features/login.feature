#language: pt
Funcionalidade: Login de usuário
  Como um usuário
  Gostaria de acessar minha conta
  Para que eu possa usufruir das funcionalidades do sistema


#    Cenario: Login Realizado com sucesso
#      Dado que estou acessando a aplicação
#      Quando informo o usuário "an@an"
#      E a senha "123"
#      E seleciono entrar
#      Então visualizo a página inicial "Bem vindo, angel!"

    Cenario: Login sem email e senha
      Dado que estou acessando a aplicação
      E informo o usuário ""
      E a senha ""
      E seleciono entrar
      Então recebo a mensagem de erro email e senha obrigatórios


#    Esquema do Cenario: Erros do login
#      Dado que estou acessando a aplicação
#      Quando informo o usuário "<email>"
#      E a senha "<senha>"
#      E seleciono entrar
#      Então recebo a "<messagem>"
#
#    Exemplos:
#      |          email       ||  senha    | |           messagem                                             |
#      |          an@an       ||           | |  Senha é um campo obrigatório                                  |
#      |                      ||   123     | |  Email é um campo obrigatório                                  |
#      |                      ||           | |  Email é um campo obrigatório  Senha é um campo obrigatório    |
#      | fgdjgdjhg@fjhgfdjgh  ||  fdsadds  | |  Problemas com o login do usuário                              |



