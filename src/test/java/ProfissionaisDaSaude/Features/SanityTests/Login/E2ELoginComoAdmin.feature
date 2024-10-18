@sanity @login @administrador @ready
Feature: [Sanity] Login como administrador

  Scenario Outline: Realizar login como administrador com sucesso

  Given o administrador acesse a área de backoffice
  When o administrador realizar o login com usuário: "<usuario>" e senha: "<senha>"
  Then o administrador deverá ver a home carregada para administradores

    Examples:
      | usuario     | senha     |
      | 3scmatheus  | 123123123 |


  Scenario Outline: Realizar login como administrador sem permissão

    Given o administrador acesse a área de backoffice
    When o administrador realizar o login com usuário: "<usuario>" e senha: "<senha>"
    Then o usuário sem permissão deverá ver a mensagem "Login ou senha de rede inválidos. Tente novamente ou entre em contato com o suporte."

    Examples:
      | usuario       | senha     |
      | sempermissao  | 123123123 |


  Scenario Outline: Validações de layout da tela de login

    Given o administrador acesse a área de backoffice
    Then o layout da tela de login deverá estar de acordo com o figma "<titulo>" "<labelInputLogin>" "<labelInputSenha>" "<contatoServiceDesk>" "<telefoneContato>" "<mensagem>"

    Examples:
      | titulo                                                                 | labelInputLogin | labelInputSenha | contatoServiceDesk      | telefoneContato | mensagem                                                                |
      | Para ter acesso ao portal por favor informe seu login e senha de rede: | Login           | Senha           | servicedesk@ache.com.br | (11) 2608-6274  | Caso não consiga acessar entre em contato por algum dos canais abaixo:  |





