<h1 align="center">Tech Challenge - Turma 4SOAT - Grupo 68</h1>

<span style="font-family:Times New Roman; font-size:13px;">

<div align="justify">
A Health&Med, uma startup inovadora no setor de saúde, está desenvolvendo um novo sistema que irá revolucionar a Telemedicina no país. Atualmente, a startup
oferece a possibilidade de agendamento de consultas e realização de consultas online (Telemedicina) por meio de sistemas terceiros como Google Agenda e
Google Meetings.<br><br>
Recentemente, a empresa recebeu um aporte e decidiu investir no desenvolvimento de um sistema proprietário, visando proporcionar um serviço de
maior qualidade, segurança dos dados dos pacientes e redução de custos. O objetivo é criar um sistema robusto, escalável e seguro que permita o
gerenciamento eficiente desses agendamentos e consultas.<br><br>
Além de conter as funcionalidades de agendamento e realização de consultas online, o sistema terá o diferencial de uma nova funcionalidade: o Prontuário
Eletrônico. O Prontuário Eletrônico permitirá o armazenamento e compartilhamento de documentos, exames, cartão de vacinas, e outros registros
médicos entre as partes envolvidas, garantindo maior assertividade nos diagnósticos.<br><br>
Para viabilizar o desenvolvimento de um sistema que esteja em conformidade com as melhores práticas de qualidade e arquitetura de software, a Health&Med
contratou os alunos do curso (SOAT) para fazer a análise do projeto e a arquitetura do software.

</div>


##### 1. Informações do projeto:

1. **Módulo:** Backend.
1. **Arquitetura:** Rest API com Frontend Typescript.
1. **Padrões de Codificação:** Hexagonal.
1. **Linguagem:** Java versão 17.
1. **Banco de Dados:** MongoDB.
1. **Container:** Docker.
1. **Orquestrador de Container:** Kubernetes.

##### 2. Desenhos Arquiteturais.

###### 2.1. Requisitos de Infraestrutura.

###### 2.1.1. Arquitetura de Infraestrutura.

Segue abaixo o desenho de infraestrutura definido:

![Infraestrutura AWS!](infraestrutura.png "Infraestrutura AWS")

###### 2.2. Requisitos de negócio (problema).

Para esta solução usamos o padrão SAGA Coreografada, pois dada que o projeto é de pequeno porte e não temos muita complexidade negocial, este padrão será o mais adequado dado a sua simplicidade de implantação e compreensão. Também ajustamos todos os mestodos para atender as propriedades de ACID para fazer contramedidas caso as transações venham a falhar.

###### 2.2.1. Arquitetura de Microserviços.
Conforme informado anteriormente<sub>[1]</sub>, o padrão arquitetural definido para esse projeto foi a de microserviços. A arquitetura de microsserviços (geralmente chamada de microsserviços) refere-se a um estilo de arquitetura para o desenvolvimento de aplicativos. Os microsserviços permitem que um aplicativo grande seja separado em partes independentes menores, com cada parte tendo sua própria responsabilidade. Para atender a uma única solicitação do usuário, um aplicativo baseado em microsserviços pode chamar muitos microsserviços internos para compor a resposta.

Para esse módulo, aplicamos esse conceito da seguinte forma:

![Arquitetura de Microserviços!](src/main/resources/images/clean-architecture.png "Arquitetura de Microserviços")


##### 3. Configuração e Execução:

1. Depois suba a infraestrutura de serviços da AWS como: [EKS, EC2, Cognito e VPC](https://github.com/gleniomontovani/tech-challenge-pos-tech-infraestrutura-terraform/actions/workflows/create_infra_api.yml).
1. Agora rode a pipeline da [API Rest](https://github.com/gleniomontovani/tech-challenge-api-gateway/actions/workflows/deploy_aplication.yml)

As infraestrutura de serviços AWS estão com as pipeline configuradas para rodarem de forma manual. Já as pipeline da API Rest rodaram com um Pull Request para a branch main.
