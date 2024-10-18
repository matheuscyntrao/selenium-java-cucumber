@sanity @cadastro-visitacao @ready
Feature: [Sanity] Cadastro - Visitação Digital

  Scenario Outline: Realizar cadastro via visitação digital com sucesso

    Given que o usuário acesse a visitação digital
    And o usuário aceitar os cookies
    And o usuário clique no botão de fazer parte da visitação digital
    And o usuário realizar o cadastro com gerador de cpf
    And o usuário aguardar o envio do token via gerador de email
    And preencha as informações do tipo de registro via gerador
    And preencha as informações de endereço "<CEP>" e numero "<numero>"
    And o usuário clicar em Entendi na tela de sucesso
    Then o usuário deverá ver a home carregada para médicos cat 0

    Examples:
    | CEP      | numero |
    | 92728330 | 260    |
