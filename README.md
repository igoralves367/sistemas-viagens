# Sistema de Viagens ✈️

O Sistema de Reservas de Viagens é uma aplicação que permite aos usuários buscar informações sobre voos, hotéis e aluguel de carros com base em suas preferências de quantidade de pessoas, datas e localizações.

# C4 Model
![C4 Model](https://github.com/igoralves367/sistemas-viagens/blob/4d1596db440b118a110e3c6ddfd7aa77317fc89a/src/main/resources/doc/Igor-Viagens-C4Model.png?raw=true)

## 🚀 Funcionalidades

- Buscar opções de viagem com base nos critérios de quantidade de pessoas, datas de ida e volta, local de origem e destino.
- Exibir opções de voos, hotéis e aluguel de carros disponíveis.
- Gerenciar reservas de viagens feitas pelos usuários.

## ⚙️ Requisitos

- Java 11 ou superior
- Maven

## 🛠️ Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- Spring Cloud
- RESTful APIs
- Feign Client
- Lombok
- H2 Database (para ambiente de desenvolvimento)
- Resilience4j (para implementação do circuit breaker)
- Feing

## 💻 Instalação e Configuração

1. Clone o repositório para sua máquina local:
   git clone https://github.com/igoralves367/sistemas-viagens.git


2. Importe o projeto em sua IDE preferida (por exemplo, IntelliJ, Eclipse).

3. Execute o projeto utilizando o Maven.

4. O sistema estará disponível em `http://localhost:8080`.

5. As collections para testes estão disponíveis no arquivo [curl-viagem-cotacao.postman_collection](https://github.com/igoralves367/sistemas-viagens/blob/feature/reservas-viagens/src/main/resources/doc/curl-viagem-cotacao.postman_collection).

## 📝 Descrição do Projeto

O projeto do Sistema de Viagens é baseado em uma arquitetura de microservices, onde cada serviço é responsável por uma funcionalidade específica, como busca de voos, gerenciamento de hospedagem e aluguel de veículos. O uso de APIs RESTful permite a comunicação entre os serviços de forma eficiente e escalável.

Um dos principais desafios do projeto é a integração com a API da Amadeus para obter informações atualizadas sobre voos. Para isso, utilizamos o Feign Client, que facilita a comunicação com serviços externos. Além disso, implementamos o Resilience4j para o gerenciamento de falhas e a implementação do circuit breaker, garantindo a resiliência do sistema em casos de falhas na API da Amadeus.

A segurança é uma preocupação fundamental no projeto, por isso utilizamos o JJWT (Java JSON Web Token) para autenticação e autorização dos usuários. O acesso aos serviços é protegido por tokens, garantindo que apenas usuários autenticados e autorizados possam realizar operações.



   

