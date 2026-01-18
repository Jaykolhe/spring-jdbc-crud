# spring-jdbc-crud
Spring Boot application demonstrating CRUD operations using Spring JDBC with PostgreSQL.

# Spring JDBC CRUD Application with PostgreSQL

This project is a **Spring Boot REST API** demonstrating **CRUD (Create, Read, Update, Delete)** operations using **Spring JDBC (JdbcTemplate)** with a **PostgreSQL** database.  
It is designed to teach Spring JDBC fundamentals, proper DAO design, and RESTful API development without JPA/Hibernate.

---

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring JDBC (`JdbcTemplate`)
- PostgreSQL
- Maven
- RESTful APIs

---

## 🏗 Project Architecture
- **Controller** – Handles HTTP requests and responses
- **DAO (Repository)** – Handles database operations using `JdbcTemplate`
- **Model (POJO)** – Represents database entities
- **PostgreSQL** – Relational database

---

## 📂 Database Schema

```sql
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    salary NUMERIC(10,2)
);
```

📌 Sample JSON Request
Create Employee
{
  "name": "John Doe",
  "salary": 50000
}

Update Employee
{
  "name": "John Smith",
  "salary": 60000
}

📌 Sample JSON Response
{
  "id": 1,
  "name": "John Doe",
  "salary": 50000
}

🧠 Key Concepts Covered

Spring JDBC (JdbcTemplate) for database access

RowMapper usage for mapping ResultSet to POJOs

PostgreSQL RETURNING clause for generated IDs

RESTful API design with proper HTTP status codes

DAO pattern for separation of concerns

Basic exception handling

🎯 Learning Purpose

This project is intended for:

Beginners learning Spring JDBC

Developers transitioning from plain JDBC to Spring

Practicing REST API development

Preparing for Spring & JDBC interview questions

▶ How to Run the Project

Clone the repository:

git clone https://github.com/Jaykolhe/spring-jdbc-crud.git


Create the PostgreSQL database and table

Update database credentials in application.properties

Run the application:

mvn spring-boot:run


Test APIs using Postman, cURL, or any API client

📌 Future Enhancements

Add input validation using @Valid

Add global exception handling with @ControllerAdvice

Add pagination for GET /employees

Add transaction management

Add unit and integration tests

Integrate Swagger / OpenAPI for API documentation

👤 Author

Jay Kolhe

⭐ If you find this project helpful, give it a star!


---

If you want, I can also make a **version with badges** (build, Java version, GitHub stars) that looks **professional on GitHub**.  

Do you want me to do that?