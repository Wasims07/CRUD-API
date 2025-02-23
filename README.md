# CRUD-API

This project is a simple Student Management API built using Java, Spring Boot, and PostgreSQL. It provides basic CRUD (Create, Read, Update, Delete) operations for managing student records. The API can be tested using Postman.

## Table of Contents

- [Project Structure](#project-structure)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [API Endpoints](#api-endpoints)

## Project Structure

```
├── src/
│ ├── main/
│ │ ├── java/com/example/springs/
│ │ │ ├── controller/
│ │ │ │└── HomeController.java               // Controller for handling HTTP requests
│ │ │ ├── entity/
│ │ │ │ └── Student.java                     // Entity class representing the Student model
│ │ │ ├── repository/
│ │ │ │└── StudentRepository.java            // Repository interface for database operations
│ │ │ └── CrudOperationApplication.java      // Main application class to bootstrap Spring Boot
│ │ └── resources/
│ │ └── application.properties               // Configuration file for database and other settings
│ └── test/
│ └── java/com/example/springs/
│ └── CrudOperationApplicationTests.java     // Unit tests for the application
├── target/                                  // Compiled classes and build artifacts
├── HELP.md                                  // Help file for Maven
├── mvnw                                     // Maven wrapper script for Unix-based systems
├── mvnw.cmd                                 // Maven wrapper script for Windows
└── pom.xml                                  // Maven configuration file for dependencies and build settings
```

## Features

- **Create Student**: Add a new student record with roll number, name, and department.
- **Read Student**: Retrieve student details by roll number or get a list of all students.
- **Update Student**: Modify existing student records.
- **Delete Student**: Remove a student record by roll number.

## Technologies Used

- **Java**: The core programming language used for development.
- **Spring Boot**: Framework for building the RESTful API.
- **PostgreSQL**: Database used to store student records.
- **Postman**: Tool for testing the API endpoints.
- **Maven**: Build automation and dependency management.

#### API Endpoints

|HTTP Method|URL|Description|
|---|---|---|
|`GET`|http://localhost:8080/ | Get for check |
|`POST`|http://localhost:8080/saveStudent | Create new User |
|`PUT`|http://localhost:8080/updateData | Update User with exist ID |
|`DELETE`|http://localhost:8080/deleteStudent/{RollNo} | Delete User by ID |
|`GET`|http://localhost:8080/getAllStudent | Get All Users with Paging |
