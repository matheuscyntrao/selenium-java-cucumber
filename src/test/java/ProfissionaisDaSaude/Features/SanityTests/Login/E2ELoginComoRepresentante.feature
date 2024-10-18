@sanity @login @representante @ready
Feature: [Sanity] Login como representante

  Scenario Outline: Realizar login como representante com sucesso

    Given o colaborador acesse a área de login
    When o colaborador realizar o login com usuário: "<usuario>" e senha: "<senha>"
    Then o colaborador deverá ver a home carregada para colaboradores

    Examples:
      | usuario      | senha     |
      | KLSNTHAYNA   | 123123123 |

  Scenario Outline: Realizar login como representante sem permissao

    Given o colaborador acesse a área de login
    When o colaborador realizar o login com usuário: "<usuario>" e senha: "<senha>"
    Then o usuário sem permissão deverá ver a mensagem "Login ou senha de rede inválidos. Tente novamente ou entre em contato com o suporte."

    Examples:
      | usuario       | senha     |
      | SEMPERMISSAO  | 123123123 |

  Scenario Outline: Validações de layout da tela de login

    Given o administrador acesse a área de backoffice
    Then o layout da tela de login deverá estar de acordo com o figma "<titulo>" "<labelInputLogin>" "<labelInputSenha>" "<contatoServiceDesk>" "<telefoneContato>" "<mensagem>"

    Examples:
      | titulo                                                                 | labelInputLogin | labelInputSenha | contatoServiceDesk      | telefoneContato | mensagem                                                                |
      | Para ter acesso ao portal por favor informe seu login e senha de rede: | Login           | Senha           | servicedesk@ache.com.br | (11) 2608-6274  | Caso não consiga acessar entre em contato por algum dos canais abaixo:  |






