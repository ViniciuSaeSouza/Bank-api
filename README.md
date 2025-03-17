# Bank API 🏦

API bancária desenvolvida com Spring Boot para gerenciamento de contas e transações financeiras.

## ✨ Funcionalidades

- Autenticação de usuários com Spring Security e JWT
- Criação e gerenciamento de contas bancárias
- Operações financeiras:
  - Depósito
  - Saque
  - Transferência entre contas
- Consulta de saldo e extrato
- Tratamento personalizado de exceções
- Testes de integração com Testcontainers

## 🛠 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Security
- JSON Web Token (JWT)
- PostgreSQL
- Maven
- Docker e Testcontainers
- MapStruct
- Lombok

## 📋 Pré-requisitos

- Java 17
- Maven 3.8+
- PostgreSQL 15+
- Docker (para os testes com Testcontainers)

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/ViniciuSaeSouza/Bank-api.git
```

Configure o banco de dados:
# Crie um banco PostgreSQL
```bash
createdb bank_api
```

# Configure as credenciais no application.properties:
```java
spring.datasource.url=jdbc:postgresql://localhost:5432/bank_api
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```


# Configure o JWT_SECRET (adicione no application.properties ou variáveis de ambiente):
```java
jwt.secret=seu_segredo_super_seguro
```
Execute a aplicação:
```java
mvn spring-boot:run
```
Acesse a API em: http://localhost:8080

🔧 Testando a Aplicação
Execute os testes com:
```java
mvn test
```
Os testes usam Testcontainers para criar instâncias temporárias do PostgreSQL

📚 Endpoints da API
Autenticação
POST /api/auth/login
```json
{
  "email": "usuario@example.com",
  "password": "senha123"
}
```
Operações Bancárias (requer autenticação)
Criar conta: POST /api/accounts

```json
{
  "name": "Fulano da Silva",
  "email": "fulano@email.com",
  "password": "senhaSegura123",
  "balance": 1000.00
}
```
Consultar saldo: GET /api/accounts/{id}
Realizar depósito: POST /api/transactions/deposit
```json

{
  "accountId": 1,
  "amount": 500.00
}
```
Realizar transferência: POST /api/transactions/transfer

```json
{
  "sourceAccountId": 1,
  "targetAccountId": 2,
  "amount": 150.00
}
```
📄 Documentação
Acesse a documentação interativa:
```
http://localhost:8080/swagger-ui.html
```
📝 Licença
Este projeto está sob licença MIT - veja o arquivo LICENSE para detalhes.

Desenvolvido por Vinícius Saes 💻
