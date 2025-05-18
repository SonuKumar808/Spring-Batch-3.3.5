# Spring Batch Example with Spring Boot

This project is a hands-on learning implementation of **Spring Batch** using **Spring Boot**. It is intended to help understand the core concepts of Spring Batch such as Jobs, Steps, Readers, Processors, and Writers.

> ⚠️ **Note:** The project uses **Spring Boot 3.3.5** (downgraded from 3.4.5) and **Java 17** (downgraded from Java 21) for compatibility and stability with Spring Batch features and dependencies.

---

## 🛠️ Technologies Used

- **Java 17**
- **Spring Boot 3.3.5**
- **Spring Batch**
- **Maven** (or Gradle – mention the one you're using)
- **H2 Database** (for demonstration purposes)

---

## 📦 Project Structure

```bash
spring-batch-example/
├── src/
│   ├── main/
│   │   ├── java/com/example/batch/
│   │   │   ├── config/           # Spring Batch configurations
│   │   │   ├── processor/        # ItemProcessor implementations
│   │   │   ├── reader/           # ItemReader implementations
│   │   │   ├── writer/           # ItemWriter implementations
│   │   │   └── SpringBatchApp.java
│   │   └── resources/
│   │       ├── application.yml
│   │       └── schema.sql
└── pom.xml
