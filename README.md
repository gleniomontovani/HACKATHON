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
1. **Arquitetura:** Arquitetura de Monolítica.
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

Para esta solução usamos a arquitetura monolitica e conteineirização para garantir a escalabilidade e desempenho da aplicação. Também disponibilizamos a aplicação na Cloud AWS da Amazon para garantir a disponibilidade 24/7 da aplicação.

###### 2.2.1. Solução Arquitetural.
Conforme informado anteriormente<sub>[1]</sub>, o padrão arquitetural definido para esse projeto foi a de monolítica. A arquitetura monolítica é um modelo tradicional de desenvolvimento de software que usa uma base de código para executar várias funções comerciais. Todos os componentes de software em um sistema monolítico são interdependentes devido aos mecanismos de troca de dados dentro do sistema.

###### 2.2.2. Requisitos Não Funcionais.
1. Para o requisitos de estalabilidade, usando o conceito de dockerização e orquestração de conteiner com Kubernetes. A implementação foi feita no AWS EKS.<br>
1. Para fazer a autenticação dos usuários usamos AWS Cognitos, no qual teremos uma autenticação usando Token com JWT. 

Para esse módulo, aplicamos esse conceito da seguinte forma:

![Arquitetura de Microserviços!](mvp.png "Arquitetura de Microserviços")


##### 3. Configuração e Execução:

1. Primeiro suba a infraestrutura de serviços da AWS como: [EKS, EC2, Cognito e VPC](https://github.com/gleniomontovani/HACKATHON/blob/main/.github/workflows/create_infra_api.yml).
1. Agora rode a pipeline da [aplicação](https://github.com/gleniomontovani/HACKATHON/blob/main/.github/workflows/deployment.yml)
1. Para deletar os componentes após os testes [rode](https://github.com/gleniomontovani/HACKATHON/blob/main/.github/workflows/destroy_infra_api.yml)

As infraestrutura de serviços AWS estão com as pipeline configuradas para rodarem de forma manual. Já as pipeline da API Rest rodaram com um Pull Request para a branch main.
