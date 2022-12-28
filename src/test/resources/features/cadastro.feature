#language: pt
 Funcionalidade: Cadastro Usuário
   Como usuário
   Eu Quero criar uma conta
   Para usuar o sistema

  Contexto:
    Dado que estou acessando a aplicação
    Quando cliclo em Novo Usuario
    E clico em cadastrar

#@cenario1
#    Cenario: Nome é obrigatório
#      E informo o email "abacaxiii@abacaxi"
#      E informo a senha "1234"
#      Então recebo a mensagem


#   @esquemaCenario
#    Esquema do Cenario: Mensagens de erros do Cadastro
#      E informo o user "<name>"
#      E informo o email "<email>"
#      E informo a senha "<senha>"
#      Então recebo a mensagem "<mensagem>"
#
#      Exemplos:
#      |     name    |        email         || senha   ||                        mensagem                             |
#      |             |  abacaxiii@abacaxi   ||  1234   ||  Nome é um campo obrigatório                                |
#      |  abacaxiii  |                      ||  1234   ||  Email é um campo obrigatório Senha é um campo obrigatório  |
#      |  abacaxiii  |  abacaxiii@abacaxi   ||         ||  Senha é um campo obrigatório                               |
#      |     ana     |     ana@ana          ||     4   ||  Endereço de email já utilizado                             |
#      |  abacaxiii  |  abacaxiii@abacaxi   ||  12345  ||  Usuário inserido com sucesso                               |
#
