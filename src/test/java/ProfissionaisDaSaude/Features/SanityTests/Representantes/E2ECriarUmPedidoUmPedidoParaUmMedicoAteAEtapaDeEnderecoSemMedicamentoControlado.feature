@sanity-ajustar-1
Feature: [Sanity] Criar um pedido medicamento não controlado - Representante

  Scenario Outline: Realizar um pedido até a etapa de endereço

    Given existam produtos disponíveis no backoffice "<produto>" "<quantidade>"
    And o colaborador acesse a área de login
    And o colaborador realizar o login com usuário: "<usuario>" e senha: "<senha>"
    And realizar pedido para o médico "<medico>" do produto "<produto>"
    #And o usuário aceitar os cookies
    And o representante adicionar o produto ao carrinho
    And o usuário finalizar o pedido
    And o médico preencher os dados pessoais
    Then o médico deverá ver a tela de endereço
    And o usuário clicar no endereço salvo
    And o usuário deverá ver a tela de assinatura
    And o representante deverá clicar em solicitar assinatura

    Examples:
      | medico | produto                     | quantidade  | usuario    |  senha           |
      | Teste  | Prelone gts frx5ml ag       | 1000        | KLSNTHAYNA |  12321321321313  |
