@sanity @bota-avise-me @medicos @ready
Feature: [Sanity] Acionar o botão avise-me como médico com sucesso como médico

  Scenario Outline: Conseguir acionar o botão avise-me como médico

    Given existam produtos disponíveis no backoffice "<produto>" "<quantidade>"
    And que o usuário acesse o vitrine de amostras
    And o usuário clique no botão de acessar do header
    And o usuário realizar o login com o cpf: "<cpf>"
    And que realize o fluxo de token via email com endereço: "<email>"
    When o usuário acessar o menu de amostras
    And realizar pedido como médico do produto "<produto>"
    Then o médico deverá conseguir clicar no botão avise-me

    Examples:
      | produto                     | quantidade | cpf         |  email                              |
      | TERMO RESPONSABILIDADE      | 0          | 06582749021 |  separacaodelimites@mailinator.com  |
