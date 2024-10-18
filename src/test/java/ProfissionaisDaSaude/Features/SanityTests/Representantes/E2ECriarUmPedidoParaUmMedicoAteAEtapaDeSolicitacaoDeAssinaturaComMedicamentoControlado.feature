@sanity @pedidos @representante @medicamento-nao-controlado @ready
Feature: [Sanity] Criar um pedido medicamento controlado - Representante

  Scenario Outline: Realizar um pedido até a etapa de assinatura

    Given existam produtos disponíveis no backoffice "<produto>" "<quantidade>"
    And o colaborador acesse a área de login
    And o colaborador realizar o login com usuário: "<usuario>" e senha: "<senha>"
    And realizar pedido para o médico "<medico>" do produto "<produto>"
    #And o usuário aceitar os cookies
    And o representante adicionar o produto ao carrinho
    And o usuário finalizar o pedido
    And o médico preencher os dados pessoais
    Then o médico deverá ver a tela de endereço

    Examples:
      | medico | produto                      | quantidade  | usuario    |  senha           |
      | Teste  | parasin 400mg commast blx12  | 10          | KLSNTHAYNA |  12321321321313  |
