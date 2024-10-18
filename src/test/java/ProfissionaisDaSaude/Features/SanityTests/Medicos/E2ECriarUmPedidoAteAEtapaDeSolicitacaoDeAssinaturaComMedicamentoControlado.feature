@sanity @pedidos @medicamento-controlado @medicos @ready
Feature: [Sanity] Criar um pedido medicamento controlado como médico

  Scenario Outline:  Realizar um pedido até a etapa de assinatura

    Given existam produtos disponíveis no backoffice "<produto>" "<quantidade>"
    And que o usuário acesse o vitrine de amostras
    And o usuário aceitar os cookies
    And o usuário clique no botão de acessar do header
    And o usuário realizar o login com o cpf: "<cpf>"
    And que realize o fluxo de token via email com endereço: "<email>"
    And o usuário acessar o menu de amostras
    When realizar pedido como médico do produto "<produto>"
    And o médico adicionar o produto ao carrinho
    And o usuário finalizar o pedido
    And o médico preencher os dados pessoais
    Then o médico deverá ver a tela de endereço
    And o usuário clicar no endereço salvo
    And o usuário deverá ver a tela de assinatura

    Examples:
      | produto                       | quantidade   | cpf         |  email                              |
      | Prelone gts frx5ml ag         | 100          | 06582749021 |  separacaodelimites@mailinator.com  |