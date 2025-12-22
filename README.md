# Spring Boot User Management System

A RESTful User Management backend application built using Spring Boot, Spring Data JPA, Hibernate, and MySQL.  
This project demonstrates clean architecture, CRUD REST APIs, and backend best practices.

---

## 📌 Project Overview

This is a simple User Management REST API developed using Spring Boot.  
The application allows basic user operations such as:

- Create a user
- Retrieve all users
- Retrieve user by ID
- Update user details
- Delete a user

The project follows a layered architecture (**Controller → Service → Repository**) and is designed as a backend service.

---

## 🏗 Architecture & Design

- Layered Architecture (Controller, Service, Repository)
- RESTful API design
- Spring Data JPA for database interaction
- Centralized exception handling using `@ControllerAdvice`
- Clean and maintainable code structure

---

## 🛠 Tech Stack

- Java 8+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- RESTful APIs
- Maven
- STS (Spring Tool Suite)
- JSON

---

## 📂 Project Structure
src/main/java/com/example/usermanagement
├── controller
│   └── UserController.java
├── service
│   ├── UserService.java
│   └── UserServiceImpl.java
├── repository
│   └── UserRepository.java
├── model
│   └── User.java
├── exception
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
└── UserManagementApplication.java

API Endpoints:
| HTTP Method | Endpoint    | Description       |
| ----------- | ----------- | ----------------- |
| POST        | /users      | Create a new user |
| GET         | /users      | Get all users     |
| GET         | /users/{id} | Get user by ID    |
| PUT         | /users/{id} | Update user       |
| DELETE      | /users/{id} | Delete user       |

📥 Sample Request (Create User):
{
  "name": "John Doe",
  "email": "john@example.com"
}

⚠ Exception Handling:
Custom ResourceNotFoundException for invalid user IDs.
Global exception handling using @ControllerAdvice.
Proper HTTP status codes (400, 404, 500).

🗄 Database Configuration:
MySQL database.
Hibernate auto DDL update enabled.
Database tables created automatically on application startup.

▶ How to Run the Project
Prerequisites
Java 8+
MySQL
Maven
STS / IntelliJ IDEA
Postman

Steps:
1: Clone the repository:
git clone https://github.com/your-username/spring-boot-user-management.git

2: Create MySQL database:
CREATE DATABASE userdb;

3:Update application.properties with your DB credentials

4: Run the application:
mvn spring-boot:run

5: Application Runs on:
http://localhost:8080

🧪 Testing
APIs tested using Postman
JSON request/response format

🚀 Future Enhancements
JWT Authentication & Authorization
Role-based access control
Pagination and sorting
Docker support
Swagger API documentation

👤 Author
Bhupendra Upadhyay
Java Backend Developer
📧 Email: bhupendraupadhyay97@gmail.com
🔗 LinkedIn: https://www.linkedin.com/in/bhupendra--upadhyay
🐙 GitHub: https://github.com/Bhupendra-Upadhyay

