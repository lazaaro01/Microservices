# 🛠️ Projeto Microservices com Spring Boot e RabbitMQ

Este é um mini projeto de arquitetura de microservices desenvolvido com **Spring Boot**, utilizando **RabbitMQ** para comunicação assíncrona entre os serviços.

## 📦 Visão Geral

- `order-service`: Responsável por receber pedidos e enviá-los via mensageria.
- `payment-service`: Escuta a fila RabbitMQ e processa os pedidos recebidos.
- Mensageria: Comunicação entre os serviços feita via **RabbitMQ**.
- Orquestração com `docker compose`.

---

## 📁 Estrutura do Projeto

ms/ ├── docker-compose.yml ├── order-service/ │ └── src/ ├── payment-service/ │ └── src/

yaml
Copiar
Editar

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring AMQP
- RabbitMQ
- Docker / Docker Compose
- Maven

---

## 🐳 Subindo o ambiente com RabbitMQ

Certifique-se de que o [Docker Desktop](https://www.docker.com/products/docker-desktop/) está instalado e rodando.


docker compose up -d
Acesse o painel de administração do RabbitMQ:

📍 http://localhost:15672
👤 Usuário: guest
🔒 Senha: guest

▶️ Executando os Microservices
1. order-service

cd order-service
mvn spring-boot:run
2. payment-service

cd payment-service
mvn spring-boot:run
🧪 Testando a aplicação
Envie um pedido via curl, Postman ou Insomnia:

http
POST http://localhost:8080/orders
Content-Type: application/json

{
  "orderId": "12345",
  "product": "Notebook",
  "price": 3599.99
}
Você verá a mensagem sendo processada pelo payment-service.

🔄 Comunicação Assíncrona
O order-service envia um pedido para uma fila do RabbitMQ.

O payment-service escuta essa fila e processa o pedido recebido.

Isso simula uma arquitetura desacoplada e escalável.

👨‍💻 Desenvolvido por
Lázaro Vasconcelos

