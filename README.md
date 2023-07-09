# Sistema de Reservas de Viagens

O Sistema de Reservas de Viagens é uma aplicação que permite aos usuários buscar informações sobre voos, hotéis e aluguel de carros com base em suas preferências de quantidade de pessoas, datas e localizações.

## Funcionalidades

- Buscar opções de viagem com base nos critérios de quantidade de pessoas, datas de ida e volta, local de origem e destino.
- Exibir opções de voos, hotéis e aluguel de carros disponíveis.
- Gerenciar reservas de viagens feitas pelos usuários.

## Requisitos

- Java 11 ou superior
- Maven

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- Spring Cloud
- RESTful APIs
- Feign Client
- Lombok
- H2 Database (para ambiente de desenvolvimento)
- Resilience4j (para implementação do circuit breaker)

## Instalação e Configuração

1. Clone o repositório para sua máquina local.
   git clone https://github.com/seu-usuario/reservas-viagens.git


2. Importe o projeto em sua IDE preferida (por exemplo, IntelliJ, Eclipse).

3. Configure as propriedades do banco de dados no arquivo `application.properties` ou `application.yml`.

4. Execute o projeto utilizando o Maven.


5. O sistema estará disponível em `http://localhost:8080`.

## Documentação da API

A documentação detalhada da API pode ser encontrada em `http://localhost:8080/swagger-ui.html`.



   

