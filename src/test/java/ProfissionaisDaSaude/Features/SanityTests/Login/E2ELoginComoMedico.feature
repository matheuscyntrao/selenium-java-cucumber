@sanity @login @medico @ready
Feature: [Sanity] Login - Médico

  Scenario Outline: Realizar login como médico com sucesso

    Given que o usuário acesse o vitrine de amostras
    And o usuário clique no botão de acessar do header
    And o usuário realizar o login com o cpf: "<cpf>"
    When que realize o fluxo de token via email com endereço: "<email>"
    Then o usuário deverá ver a welcome carregada para o slug "<slug>"

    Examples:
      | email                          | slug            | cpf            |  registro  |
      | 879.340.210-46@mailinator.com  | medicos         | 879.340.210-46 |  40430RS   |
      | 700.948.100-87@mailinator.com  | farmaceuticos   | 700.948.100-87 |  404331RS  |
      | 056.256.140-40@mailinator.com  | dentistas       | 056.256.140-40 |  404332RS  |
      | 843.880.450-04@mailinator.com  | nutricionistas  | 843.880.450-04 |  404333RS  |
      | 505.003.740-90@mailinator.com  | fisioterapeutas | 505.003.740-90 |  404334RS  |
