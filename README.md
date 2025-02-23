# CRUD-API
This project demonstrates the implementation of basic CRUD (Create, Read, Update, Delete) operations using Spring Boot as the backend framework and PostgreSQL as the database.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [API Endpoints](#api-endpoints)
- [Testing with Postman](#testing-with-postman)
- [Contributing](#contributing)
- [License](#license)

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
