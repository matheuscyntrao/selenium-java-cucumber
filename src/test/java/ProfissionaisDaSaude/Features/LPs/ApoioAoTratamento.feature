@regression @psp
Feature: [Regression] PSP - Apoio ao Tratamento

  Scenario: Realizar o click no CTA do whatsapp

    Given que o usuário acesse a lp de apoio ao tratamento
    When o usuário clicar no botão de CTA do whatsapp
    Then o usuário deverá ser redirecionado para a url "https://api.whatsapp.com/send?autoload=1&app_absent=0&phone=551126082801&text"

  Scenario: Realizar a validação de textos e design da LP

    Given que o usuário acesse a lp de apoio ao tratamento
    When a página for carregada
    Then o menu deverá conter "Para Você" "Para seu negócio" e "Para Profissionais da Saúde" e "Para seu Negócio"
    And deverá existir uma tagline escrito "Profissionais da Saúde"
    And a seção principal deverá conter o título "APOIO AO TRATAMENTO" e conter o subtítulo "Transforme o acompanhamento do tratamento dos seus pacientes." e deverá conter o texto "Descubra como nossa nova ferramenta pode otimizar o tratamento dos seus pacientes, oferecendo dados exclusivos e insights para melhores desfechos clínicos."
    And a seção o que é deverá conter o título "O QUE É?" e conter o subtítulo "Nossa ferramenta foi criada para integrar o novo Programa de Suporte ao Paciente do Aché Laboratórios, proporcionando acompanhamento contínuo durante todo o tratamento." e deverá conter o texto "Tenha acesso a informações valiosas sobre a adesão ao tratamento e a saúde dos seus pacientes, contribuindo para melhorar os resultados clínicos e o retorno às consultas. A ferramenta não querer a instalação de aplicativos e o acesso é totalmente gratuito, tanto para você quanto para seus pacientes."
    And a seção de benefícios deverá conter o título "BENEFÍCIOS PARA VOCÊ" e conter 4 cards de benefícios
    And a seção de como funciona deverá conter o título "COMO FUNCIONA" e conter o subtítulo "Acompanhe toda sua carteira de pacientes" e conter o texto "Aqui você gerencia toda sua carteira de pacientes e acompanha o andamento de cada tratamento com muito mais facilidade."
    And a seção de como funciona também deverá conter o subtítulo "Confira em detalhes o tratamento de um paciente" e o texto "Aqui você faz uma análise personalizada do tratamento dos pacientes, oferecendo atendimento diferenciado, eficiente e gerando bons resultados clínicos."
    And deverá haver uma linha sobre taxa de aprovação com o texto "Este programa já conta com uma taxa de aprovação de 80% entre os pacientes."
    And a seção faça parte deverá conter o título "Faça parte" e o subtítulo "Agora, convidamos você a conhecer a maneira mais prática e eficiente de fazer parte do dia a dia dos seus pacientes." e deverá conter o texto "Garanta seu acesso exclusivo: seja um dos primeiros a explorar essa nova funcionalidade!"
    And a seção nossas marcas deverá conter o título "CONHEÇA NOSSAS MARCAS" e conter o subtítulo "Descubra as marcas que fazem parte do grupo, com produtos inovadores e com a mesma qualidade do Aché Laboratórios." e deverá conter os 3 cards de produtos
    And a seção descubra mais deverá conter o título "DESCUBRA MAIS" e conter o subtítulo "Conheça nossos outros serviços dedicados a profissionais de saúde." e deverá conter os 2 cards de mais informações

  Scenario Outline: Realizar o clique em todos os botões fazer parte

    Given que o usuário acesse a lp de apoio ao tratamento
    When o usuário clicar no botão de fazer parte com o id "<xpath>"
    When o usuário deverá ser redirecionado para a url "<url>"

    Examples:
    | xpath                                                     | url                                                                                     |
    | //*[@id="__next"]/div/div/main/div/div[1]/div[2]/div[1]/a | https://profissionais.qa.cuidadospelavida.com.br/autenticacao?from=apoio-ao-tratamento  |
    | //*[@id="__next"]/div/div/main/div/div[2]/div/div[2]/a    | https://profissionais.qa.cuidadospelavida.com.br/autenticacao?from=apoio-ao-tratamento  |
    | //*[@id="__next"]/div/div/main/div/div[3]/div/a           | https://profissionais.qa.cuidadospelavida.com.br/autenticacao?from=apoio-ao-tratamento  |
    | //*[@id="__next"]/div/div/main/div/div[4]/div[1]/div/a    | https://profissionais.qa.cuidadospelavida.com.br/autenticacao?from=apoio-ao-tratamento  |
    | //*[@id="__next"]/div/div/main/div/div[4]/div[2]/div/a    | https://profissionais.qa.cuidadospelavida.com.br/autenticacao?from=apoio-ao-tratamento  |
    | //*[@id="__next"]/div/div/main/div/div[6]/div/div/a       | https://profissionais.qa.cuidadospelavida.com.br/autenticacao?from=apoio-ao-tratamento  |

  Scenario Outline: Validar informações dos cards de benefícios

    Given que o usuário acesse a lp de apoio ao tratamento
    When a página for carregada
    Then a seção de benefícios deverá conter o card <titulo> <texto>

    Examples:
    | titulo                        | texto                                                                              |
    | Mais dados sobre os pacientes | Acompanhe o progresso dos seu pacientes, de forma detalhada e em tempo real.       |
    | Adesão e tratamento           | Intervenha rapidamente para garantir que os pacientes sigam o plano de tratamento. |
    | Melhores desfechos clínicos   | Aumente a eficácia dos tratamentos com informações precisas e oportunas.           |
    | Retorno às consultas          | Monitore a saúde dos pacientes, de forma contínua, promovendo o retorno programado.|

  Scenario Outline: Validar texto, clique no botão e link de redirecionamento

    Given que o usuário acesse a lp de apoio ao tratamento
    When a página for carregada
    Then o card do produto <produto> deverá conter o texto "<texto>"
    And o link do saiba mais deverá redirecionar o usuário para "<link>"

    Examples:
    | produto      | texto                                                                                                                                                                                                     | link                         |
    | Ache         | O Aché atua há 57 anos no desenvolvimento de soluções inovadoras, que resultam em produtos e serviços diferenciados disponibilizados ao mercado farmacêutico.                                             | https://www.ache.com.br/     |
    | Biosintética | A Biosintética é uma empresa farmacêutica líder no Brasil, reconhecida por sua pesquisa, desenvolvimento e comercialização de medicamentos e produtos de saúde inovadores em diversas áreas terapêuticas. | https://biosintetica.com.br/ |
    | Profuse      | Profuse é uma linha de produtos dermatológicos do laboratório Aché, oferecendo uma variedade de cuidados para a pele, como hidratantes, protetores solares e tratamentos anti-idade e muitos outros.      | https://www.profuse.com.br/  |

  Scenario Outline: Validar informações dos cards do descubra mais

    Given que o usuário acesse a lp de apoio ao tratamento
    When a página for carregada
    Then o card de informações médicas deverá conter o "<titulo>" e conter o texto "<texto>"
    And o link do card deverá redirecionar o usuário para o "<link>"

    Examples:
    | titulo              | texto                                                                       | link                                                                           |
    | Informações Médicas |  Esclareça as suas dúvidas sobre o portfólio de produtos Aché Laboratórios. | https://api.whatsapp.com/send?autoload=1&app_absent=0&phone=551126082801&text  |
    | Farmacovigilância   | Reporte e monitore eventos adversos relacionados ao uso de medicamentos.    | https://api.whatsapp.com/send?autoload=1&app_absent=0&phone=551126082801&text  |

  Scenario: Validar slug da LP

    Given que o usuário acesse a lp de apoio ao tratamento
    When a página for carregada
    Then a url da página deverá conter o slug "apoio-ao-tratamento"

  Scenario: Validar o menu da landing page de PSP

    Given que o usuário acesse a lp de apoio ao tratamento
    When a página for carregada
    Then o menu da LP deverá conter a opção "Para Você" e o link deverá redirecionar para "https://cuidadospelavida.com.br/"
    And o menu da LP deverá conter a opção "Para Profissionais da Saúde" e o link deverá redirecionar para "https://profissionais.qa.cuidadospelavida.com.br/apoio-ao-tratamento"
    And o menu da LP deverá conter a opção "Para seu Negócio" e o link deverá redirecionar para "https://farmacias.cuidadospelavida.com.br/"

  Scenario: Validar o footer da LP

    Given que o usuário acesse a lp de apoio ao tratamento
    When a página for carregada
    Then o footer deverá conter o logotipo do cuidados pela vida
    And deverá conter o texto "© 2024 - Copyright Cuidados pela Vida. Todos os direitos reservados."
    And deverá conter os links das redes sociais
    And o facebook deverá redirecionar para "https://www.facebook.com/cuidadospelavida"
    And o linkedin deverá redirecionar para "https://www.linkedin.com/company/cuidados-pela-vida/"
    And o instagram deverá redirecionar para "https://www.youtube.com/@cuidadospelavida_"
    And a Política de Privacidade deverá redirecionar para "https://cuidadospelavida.com.br/politica-de-privacidade"

  Scenario: Validar cadastro via LP

    Given que o usuário acesse a lp de apoio ao tratamento
    And o usuário clique no botão de acessar do header
    And o usuário aceitar os cookies
    And o usuário realizar o cadastro com gerador de cpf
    And o usuário aguardar o envio do token via gerador de email
    And preencha as informações do tipo de registro via gerador
    Then o usuário deverá ver a home carregada para médicos cat 0

  Scenario Outline: Validar login via LP

    Given que o usuário acesse a lp de apoio ao tratamento
    And o usuário clique no botão de acessar do header
    And o usuário realizar o login com o cpf: "<cpf>"
    When que realize o fluxo de token via email com endereço: "<email>"
    Then o usuário deverá ver a welcome carregada para o slug "<slug>"

    Examples:
      | email                          | slug            | cpf            |  registro  |
      | 879.340.210-46@mailinator.com  | medicos         | 879.340.210-46 |  40430RS   |