@sanity @botao-avise-me @representante @ready
Feature: [Sanity] Botão Avise-me - Representante

  Scenario Outline: Conseguir acionar o botão avise-me como representante

    Given existam produtos disponíveis no backoffice "<produto>" "<quantidade>"
    And o colaborador acesse a área de login
    And o colaborador realizar o login com usuário: "<usuario>" e senha: "<senha>"
    And realizar pedido para o médico "<medico>" do produto "<produto>"
    Then o representante deverá conseguir clicar no botão avise-me

    And que
    Examples:
      | medico | produto                    | quantidade | usuario    |  senha           |
      | Teste  |TERMO RESPONSABILIDADE      | 0          | KLSNTHAYNA |  12321321321313  |