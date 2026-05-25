# TaskFlow API

API REST desenvolvida com Java e Spring Boot para gerenciamento de tarefas.

O sistema permite criar, listar, atualizar, deletar e alterar o status de tarefas, seguindo os princípios de arquitetura RESTful e organização em camadas.

---

# Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- Swagger / OpenAPI
- H2 Database
- Lombok

---

# Arquitetura do Projeto

O projeto segue arquitetura em camadas:

```txt
src/main/java/com/gabrielli/taskflow_backend/
├── controller/
├── service/
├── repository/
├── model/
├── DTO/
├── exception/
```

### Estrutura das Camadas

- **Controller** → Responsável pelas rotas HTTP
- **Service** → Regras de negócio
- **Repository** → Comunicação com banco de dados
- **Model** → Entidades da aplicação
- **DTO** → Transferência de dados
- **Exception** → Tratamento de erros personalizados

---

# Funcionalidades

- Criar tarefas
- Listar todas as tarefas
- Atualizar tarefas
- Deletar tarefas
- Alterar status da tarefa
- Listar tarefas concluídas
- Listar tarefas pendentes

---

# Endpoints da API

## Criar tarefa

```http
POST /tarefas
```

### Body

```json
{
  "nome": "Estudar Spring",
  "descricao": "Fazer trabalho da faculdade"
}
```

---

## Listar todas as tarefas

```http
GET /tarefas
```

---

## Atualizar tarefa

```http
PUT /tarefas/{id}
```

### Body

```json
{
  "nome": "Nova tarefa",
  "descricao": "Descrição atualizada"
}
```

---

## Alterar status da tarefa

```http
PATCH /tarefas/{id}
```

### Body

```json
true
```

---

## Deletar tarefa

```http
DELETE /tarefas/{id}
```

---

## Listar tarefas concluídas

```http
GET /tarefas/concluidas
```

---

## Listar tarefas pendentes

```http
GET /tarefas/pendentes
```

---

# 📡 Status HTTP Utilizados

| Status | Descrição |
|---|---|
| 200 OK | Requisição realizada com sucesso |
| 201 CREATED | Recurso criado |
| 204 NO CONTENT | Recurso deletado |
| 404 NOT FOUND | Recurso não encontrado |
| 400 BAD REQUEST | Dados inválidos |

---

# 📘 Documentação Swagger

Após iniciar a aplicação, a documentação da API pode ser acessada em:

```txt
http://localhost:8080/swagger-ui/index.html
```

---

# ▶️ Como Executar o Projeto

## Clonar o repositório

```bash
git clone https://github.com/Gabrielli-B/task-flow
```

---

## Entrar na pasta do projeto

```bash
cd taskflow_backend
```

---

## Executar a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação ficará disponível em:

```txt
http://localhost:8080
```

---

# 🧪 Testes da API

Os endpoints podem ser testados utilizando:

- Swagger UI
- Postman
- Insomnia

---

