#language: pt

Funcionalidade: Login de usuário
  Como um usuário
  Gostaria de acessar minha conta
  Para que eu possa usufruir das funcionalidades do sistema

  @cenario
    Cenario: Login Realizado com sucesso
      Dado que estou acessando a aplicação
      Quando informo o usuário
      E a senha
      E seleciono entrar
      Então visualizo a página inicial "Bem vindo, angel!"

  @cenario
    Cenario: Login sem email e senha
      Dado que estou acessando a aplicação
      E seleciono entrar
      Então recebo a mensagem de erro email e senha obrigatórios

  @cenario
    Cenario: Email obrigatório
      Dado que estou acessando a aplicação
      E a senha
      E seleciono entrar
      Então recebo a mensagem "Email é um campo obrigatório"

  @cenario
    Cenario: Senha obrigatória
      Dado que estou acessando a aplicação
      E informo o usuário
      E seleciono entrar
      Então recebo a mensagem "Senha é um campo obrigatório"

  @cenario
  Cenario: Usuário não cadastrado
      Dado que estou acessando a aplicação
      E informo o
      E a senha falsa
      E seleciono entrar
      Então recebo a mensagem "Problemas com o login do usuário"





