# Gerenciador de Pedidos com Spring Boot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/pedrosntx/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Este sistema foi desenvolvido como parte da prática aplicada durante um curso de desenvolvimento back-end, com o objetivo de consolidar conhecimentos e adquirir experiência real com as tecnologias utilizadas.

A aplicação consiste em um sistema simples de gerenciamento de pedidos, com foco em operações básicas de cadastro, relacionamento entre entidades e persistência de dados.

## Funcionalidades
- Registro de usuários
- Cadastro de produtos
- Criação de pedidos
- Associação de produtos à categorias
- Inserção de itens em pedidos, com cálculo automático do subtotal (quantidade x valor unitário)
- Relacionamento de pedidos com seus respectivos usuários
- Simulação de pagamento, que apenas registra o instante da efetuação do pagamento

## Modelo conceitual
![Modelo Conceitual](https://github.com/pedrosntx/assets/blob/main/springboot-workshop/modelo-conceitual.png)

# Tecnologias utilizadas
## Back-end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Ferramentas
- Postman
- H2 Database

## Objetivos de aprendizado
- Desenvolver APIs RESTful com Spring Boot
- Aplicar conceitos de JPA e relacionamento entre entidades
- Testar endpoints e modelar dados de forma clara e funcional

# Como executar o projeto

## Back end
Pré-requisitos: Java 17+

```bash
# clonar repositório
git clone git@github.com:pedrosntx/workshop-springboot3-jpa.git

# importe em sua IDE de preferência como um projeto Maven

# execute a aplicação no caminho:
\src\main\java\com\pedrosantos\course\CourseApplication.java

# acesse o H2 Console no link:
http://localhost:8080/h2-console

# use o Postman para testar os endpoints
```

# Autor

Pedro Henrique Gomes dos Santos

https://www.linkedin.com/in/pedrosantos091/

