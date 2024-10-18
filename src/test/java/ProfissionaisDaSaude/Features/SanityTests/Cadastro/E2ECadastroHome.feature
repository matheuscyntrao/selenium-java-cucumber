@sanity @cadastro @ready
Feature: [Sanity] Cadastro - Vitrine de Amostras

  Scenario: Realizar cadastro via vitrine de amostras com sucesso

    Given que o usuário acesse o vitrine de amostras
    And o usuário clique no botão de acessar do header
    And o usuário aceitar os cookies
    And o usuário realizar o cadastro com gerador de cpf
    And o usuário aguardar o envio do token via gerador de email
    And preencha as informações do tipo de registro via gerador
    Then o usuário deverá ver a home carregada para médicos cat 0
