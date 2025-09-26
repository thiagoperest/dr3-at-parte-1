# Sistema de Folha de Pagamento - Backend API - INFNET - DR3 AT

![Java](https://img.shields.io/badge/Java-17+-blue.svg)
![Maven](https://img.shields.io/badge/Maven-3.8+-green.svg)
![Javalin](https://img.shields.io/badge/Javalin-6.7.0-orange.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)
![Status](https://img.shields.io/badge/Status-Ativo-success.svg)

Sistema backend desenvolvido como projeto prático para gerenciamento de mensalistas com operações CRUD, implementando conceitos de RESTful APIs, validação de dados e arquitetura em camadas usando Javalin.

## Sobre o Projeto

Este projeto foi desenvolvido como parte da **DR3 AT - Desenvolvimento de Serviços Web e Testes com Java** do Instituto Infnet, implementando um sistema de folha de pagamento com endpoints RESTful completos para gestão de mensalistas.

**Instituto Infnet**  
**Disciplina:** Desenvolvimento de Serviços Web e Testes com Java  
**Aluno:** Thiago Teodoro Peres

## Arquitetura

O sistema implementa uma arquitetura em camadas seguindo os padrões REST e Clean Architecture:

```
Controller Layer (HTTP Endpoints)
        ↓
Service Layer (Business Logic)
        ↓
Validator Layer (Data Validation)
        ↓
Model Layer (Domain Objects)
        ↓
DTO Layer (Data Transfer Objects)
```

O sistema foi modelado seguindo princípios de orientação a objetos, com separação de responsabilidades entre as camadas de apresentação, controle, validação e domínio.

## Funcionalidades Implementadas

### Rubrica 1 - Endpoints Básicos
- **GET /hello** - Endpoint de teste retornando "Hello, Javalin!"
- **GET /status** - Status do sistema com timestamp
- **POST /echo** - Echo de mensagens JSON
- **GET /saudacao/{nome}** - Saudação personalizada com path parameter

### Rubrica 4 - Sistema de Folha de Pagamento
- **GET /mensalistas** - Listagem de todos os mensalistas
- **GET /mensalistas/{matricula}** - Busca mensalista por matrícula
- **POST /mensalistas** - Criação de novo mensalista com validações

### Validações Implementadas
- **Campos obrigatórios** - Matrícula, nome, cargo e salário
- **Formato da matrícula** - Padrão M000 (ex: M001, M002)
- **Salário positivo** - Maior que zero
- **Tamanho de campos** - Validação de tamanho mínimo/máximo

## Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.8 ou superior

### Execução

1. **Clone o repositório:**
   ```bash
   git clone <seu-repositório>
   cd dr3-at-parte-1
   ```

2. **Execute a aplicação:**
   ```bash
   mvn exec:java
   ```

3. **A aplicação iniciará na porta 8080:**
   ```
   Servidor Javalin iniciado na porta: 8080
   Endpoints Rubrica 1:
   Item 1: http://localhost:8080/hello
   Item 2: http://localhost:8080/status
   Item 3: http://localhost:8080/echo
   Item 4: http://localhost:8080/saudacao/{nome}

   Endpoints Rubrica 4 - Sistema de Folha de Pagamento:
   Item 1: http://localhost:8080/mensalistas
   Item 2: http://localhost:8080/mensalistas/{matricula}
   Item 3: http://localhost:8080/mensalistas (POST)
   ```

## Estrutura do Projeto

```
src/main/java/br/edu/infnet/dr3atparte1/
├── Dr3AtParte1Application.java        # Classe principal da aplicação
├── config/
│   └── RouteConfig.java               # Configuração centralizada de rotas
├── controller/
│   ├── EchoController.java            # Controller para echo
│   ├── HelloController.java           # Controller para hello
│   ├── MensalistaController.java      # Controller para mensalistas
│   ├── SaudacaoController.java        # Controller para saudação
│   └── StatusController.java          # Controller para status
├── service/
│   ├── EchoService.java               # Lógica de negócio para echo
│   ├── HelloService.java              # Lógica de negócio para hello
│   ├── MensalistaService.java         # Lógica de negócio para mensalistas
│   ├── SaudacaoService.java           # Lógica de negócio para saudação
│   └── StatusService.java             # Lógica de negócio para status
├── dto/
│   ├── EchoRequestDto.java            # DTO para requisições de echo
│   ├── EchoResponseDto.java           # DTO para respostas de echo
│   ├── HelloResponseDto.java          # DTO para respostas de hello
│   ├── MensalistaRequestDto.java      # DTO para requisições de mensalista
│   ├── MensalistaResponseDto.java     # DTO para respostas de mensalista
│   ├── SaudacaoResponseDto.java       # DTO para respostas de saudação
│   └── StatusResponseDto.java         # DTO para respostas de status
├── model/
│   └── Mensalista.java                # Modelo de domínio para mensalista
├── validator/
│   └── MensalistaValidator.java       # Validações de mensalista
└── exception/
    └── MensalistaValidationException.java # Exceção customizada para validação

src/test/java/br/edu/infnet/dr3atparte1/
└── Dr3AtParte1ApplicationTests.java   # Testes unitários e de integração
```

## Exemplos de Uso

### Criar Mensalista
```bash
POST http://localhost:8080/mensalistas
Content-Type: application/json

{
  "matricula": "M004",
  "nome": "Ana Costa",
  "cargo": "Designer",
  "salario": 4800.0
}
```

### Buscar Mensalista por Matrícula
```bash
GET http://localhost:8080/mensalistas/M001
```

### Listar Todos os Mensalistas
```bash
GET http://localhost:8080/mensalistas
```

## Dados Mockados

O sistema possui dados mockados para demonstração:

- **M001** - João Silva (Desenvolvedor) - R$ 5.000,00
- **M002** - Maria Santos (Analista) - R$ 4.500,00  
- **M003** - Pedro Oliveira (Gerente) - R$ 7.000,00

## Testes Implementados

### Rubrica 2 - Testes com JUnit
- **Teste unitário** do HelloService
- **Teste de integração** do endpoint POST /mensalistas
- **Teste de integração** do endpoint GET /mensalistas/{matricula}
- **Teste de integração** do endpoint GET /mensalistas

Todos os testes usam **JUnit** e **JavalinTest** para requisições HTTP reais.

## Tecnologias Utilizadas

- **Java 17** - Linguagem de programação principal
- **Javalin 6.7.0** - Framework web leve e moderno
- **Jackson** - Serialização/deserialização JSON
- **JUnit 5** - Framework de testes
- **SLF4J** - Logging

## Contato

**Thiago Teodoro Peres**  
Email: thiago.peres@al.infnet.edu.br  
Instituto Infnet - Desenvolvimento de Serviços Web e Testes com Java

---

**Projeto desenvolvido para o Instituto Infnet - DR3 AT**