

#  Day 1 – DBMS & SQL Fundamentals
# Overview
We covered the foundational concepts of Database Management Systems, relational databases, SQL basics, SQL commands, database design principles, normalization, joins, and industry best practices.

### Database Fundamentals
- Introduction to Data and Database
- Database Management System (DBMS)
- Relational Database Management System (RDBMS)
- Features and Advantages of DBMS
- SQL Overview

- ##  Topics Covered
- What is Data?
- Database
- DBMS
- File System vs DBMS
- Advantages of DBMS
- Types of DBMS
- RDBMS
- Features of RDBMS
- Relational vs Non-Relational Database
- SQL vs NoSQL
- When to use SQL
- When to use NoSQL

### SQL Commands
- DDL (CREATE, ALTER, DROP, RENAME)
- DML (INSERT, UPDATE, DELETE)
- DQL (SELECT)
- DCL (GRANT, REVOKE)
- TCL (COMMIT, ROLLBACK, SAVEPOINT)

### Database Design
- Primary Key
- Foreign Key
- Candidate Key
- Composite Key
- Unique Key
- Constraints
  - NOT NULL
  - UNIQUE
  - DEFAULT
  - CHECK
  - PRIMARY KEY
  - FOREIGN KEY

### Table Operations
- Create Database
- Create Table
- Alter Table
- Rename Table
- Drop Column
- Modify Column
- Add Column

### Data Operations
- Insert Records
- Update Records
- Delete Records
- Retrieve Records

### SQL Joins
- INNER JOIN
- LEFT JOIN
- RIGHT JOIN
- CROSS JOIN
- SELF JOIN

### Subqueries
- WHERE Subquery
- FROM Subquery
- SELECT Subquery
- Correlated Subquery
- EXISTS

##  Practice 

### Health Clinic Database

Created and managed a Health Clinic database including:

- Patients Table
- Doctors Table
- Appointments Table
- Billing Table
- Accounts Table
- Employee Table

Performed:
- Table Creation
- Data Insertion
- Table Alteration
- CRUD Operations
- SQL Joins
- Subqueries
- Transactions
- Indexing

---

##  Repository Structure

```
Refresher-Training
│
├── README.md
│
├── Day-1
│   └── Day1_SQL.sql
│
├── Day-2
├── Day-3
└── ...
```

---

##  Learning Outcome

- Strong understanding of DBMS concepts
- Hands-on SQL query writing
- Database schema design
- Data manipulation using SQL
- Query optimization basics
- Transaction management
- Best practices for relational databases

---


#  Day 2 - Database Programming

##  Topics Covered

### 1. Entity Relationship (ER) Diagram
Learned the fundamentals of designing a database using ER diagrams.

#### Concepts Covered
- Entities
- Attributes
- Relationships
- Cardinality
- Primary Key
- Foreign Key
- Weak Entity
- ER Diagram Design Principles

#### Learning Outcome
- Designed ER diagrams for real-world applications.
- Understood how entities are related within a database.
- Learned different relationship types (One-to-One, One-to-Many, Many-to-Many).

---

### 2. Database Indexing

Studied how indexing improves database performance.

#### Concepts Covered
- What is an Index?
- Purpose of Indexing
- Clustered Index
- Non-Clustered Index
- Advantages of Indexing
- Disadvantages of Over-Indexing

#### Learning Outcome
- Understood how indexes speed up data retrieval.
- Learned when indexing should and should not be used.
- Explored the impact of indexes on INSERT, UPDATE, and DELETE operations.

---

### 3. Database Normalization

Learned techniques to organize data efficiently and reduce redundancy.

#### Normal Forms Covered

### First Normal Form (1NF)
- Eliminate repeating groups
- Ensure atomic values

### Second Normal Form (2NF)
- Must satisfy 1NF
- Remove partial dependency

### Third Normal Form (3NF)
- Must satisfy 2NF
- Remove transitive dependency

### Boyce-Codd Normal Form (BCNF)
- Every determinant must be a candidate key

#### Learning Outcome
- Reduced data redundancy.
- Improved database consistency.
- Designed well-structured relational databases.

---

##  Skills Gained

- ER Diagram Design
- Database Modeling
- Understanding Cardinality
- Database Indexing
- Query Performance Optimization
- Database Normalization (1NF, 2NF, 3NF, BCNF)

---

# Day 3 - SQL Advanced Concepts

##  Topics Covered

### 1. Joins

Learned how to retrieve data from multiple tables using different types of SQL joins.

#### Types of Joins

* INNER JOIN
* LEFT JOIN
* RIGHT JOIN
* FULL OUTER JOIN (concept)
* CROSS JOIN
* SELF JOIN

#### Practiced

* Joining multiple tables
* Retrieving related records
* Understanding matching and non-matching rows
* Using aliases for better query readability

---

### 2. Stored Procedures

Learned how to create reusable SQL programs that can execute a set of SQL statements.

#### Topics Covered

* Creating Stored Procedures
* Calling Stored Procedures
* Input Parameters
* Using Variables
* Conditional Logic inside Procedures
* Advantages of Stored Procedures

#### Benefits

* Code Reusability
* Better Performance
* Improved Security
* Reduced Network Traffic
* Easier Maintenance

---

### 3. Triggers

Learned how triggers automatically execute in response to database events.

#### Types of Triggers

* BEFORE INSERT
* AFTER INSERT
* BEFORE UPDATE
* AFTER UPDATE
* BEFORE DELETE
* AFTER DELETE

#### Practiced

* Creating Triggers
* Automatic Data Validation
* Audit Logging
* Maintaining Data Consistency
* Trigger Execution Flow

---

## Key Learning Outcomes

* Understood different SQL Join operations and their use cases.
* Implemented Stored Procedures for reusable database operations.
* Learned how Triggers automate tasks based on INSERT, UPDATE, and DELETE events.
* Improved understanding of advanced SQL concepts used in real-world database applications.

---

## Technologies Used

* MySQL
* SQL
* MySQL Workbench

---

## Day 4 — Implement  CRUD Operation in Health Clinic App

- Ran the project and tested the Patient module: Add, List, View, and Update patients.
- Added Doctors and linked each one to a Specialization.
- Added Specializations (e.g. Cardiology, Dermatology) and used their IDs while creating doctors.
- Booked an Appointment by entering a valid Patient ID and Doctor ID along with date and time.
- Completed an appointment, which automatically created a Billing record and a Visit History record.
- Checked the Billing menu — viewed all bills, checked a bill for a specific appointment, and 
  marked a bill as "Paid".

### What I learned
- How the app is structured in layers: UI → Service → DAO → Database.
- Why DAO uses an interface + implementation (makes it easy to swap the database later).
- What a connection pool is and why it's faster than opening a new database connection every time.
- What a transaction is — completing an appointment does 3 things together (update status, 
  create bill, create visit record), and if any one step fails, everything is undone.
- Why foreign keys are useful — they stop invalid data, like booking an appointment with a 
  patient ID that doesn't exist.

### Next steps
- Push the project to GitHub.
- Test Delete operations and Visit History.

# Day 5 - Java Servlet Fundamentals

##  Overview
This module covers the fundamentals of Java Servlets, Apache Tomcat configuration, Maven Web Applications, HTTP request handling, and HTML form integration. A Greeting Application was built to understand the complete request-response lifecycle.

---

##  Topics Covered

### Java Servlet Basics
- Introduction to Java Servlets
- Role of Servlets in Java Web Applications
- Servlet Architecture
- Servlet Life Cycle

### Apache Tomcat
- Installing and Configuring Apache Tomcat 10
- Setting up JAVA_HOME
- Deploying WAR Files
- Understanding the `webapps` Directory
- Running Applications on Tomcat

### Maven Web Application
- Creating a Maven Web Project
- Project Structure
- Configuring `pom.xml`
- WAR Packaging
- Maven Build Process

### Servlet Development
- Creating a Servlet using `HttpServlet`
- Using `@WebServlet`
- `HttpServletRequest`
- `HttpServletResponse`
- Using `PrintWriter`

### HTTP Methods
- `doGet()`
- `doPost()`
- GET vs POST
- Using `request.getParameter()`

### HTML Form Integration
- Creating HTML Forms
- GET & POST Form Submission
- Connecting HTML Forms with Servlets
- Processing User Input

---

##  Project

### Greeting Application
- HTML Form
- Servlet Mapping
- GET Request Handling
- POST Request Handling
- Dynamic Response Generation

---

##  Troubleshooting & Debugging
- Fixed `JAVA_HOME` Configuration Issues
- Resolved Tomcat Deployment Problems
- Fixed HTTP 404 Errors
- Fixed HTTP 405 Errors
- Understanding WAR Deployment
- Rebuilding & Redeploying Maven Projects

---

##  Technologies Used
- Java 21
- Jakarta Servlet API 6
- Apache Tomcat 10
- Maven
- HTML
- IntelliJ IDEA

---

##  Key Concepts Learned
- Java Servlet Fundamentals
- Request-Response Cycle
- Servlet Mapping
- GET vs POST
- Form Handling
- Tomcat Configuration
- Maven WAR Packaging
- Web Application Deployment
- Basic Web Application Debugging


# Day 6 - Java Servlet

## Overview
Learned the fundamentals of Java Servlets and developed a simple web application using Apache Tomcat.

## Topics Covered
- Introduction to Java Servlets
- Creating a Servlet Project using Maven
- Configuring Apache Tomcat Server
- Adding Servlet API dependency in Maven (pom.xml)
- Creating and Running the First Servlet
- Understanding Servlet URL Mapping
- Web Container Architecture
- Web Application Directory Structure
- Working with HTML, JSP, and Servlets
- Handling HTTP Requests and Responses

## Use Cases Implemented

### UC1 - First Servlet
- Created a Maven-based Servlet project
- Configured Tomcat server
- Developed and executed the first Servlet

### UC2 - Login Servlet
- Created a Login page using HTML
- Developed a Login Servlet
- Validated predefined username and password
- Redirected to Login Success JSP after successful authentication

### UC3 - Name Validation
Implemented name validation where:
- Name starts with a Capital Letter
- Minimum length is 3 characters

### UC4 - Password Validation
Implemented password validation with the following rules:
- Minimum 8 characters
- At least one uppercase letter
- At least one numeric digit
- Exactly one special character

## Technologies Used
- Java
- Servlet API
- Maven
- Apache Tomcat
- HTML
- JSP
- IntelliJ IDEA

## Key Concepts Learned
- Servlet Lifecycle
- HttpServlet
- doGet() and doPost()
- HttpServletRequest
- HttpServletResponse
- @WebServlet Annotation
- URL Mapping
- Web Container
- Maven Dependency Management

# Day 7 - Spring REST API & Request Handling

## Start Developing ContactApp

- Spring REST API
- RESTful API endpoints
- HTTP Methods
- Request Handling in Spring Boot
- `@RestController`
- `@RequestMapping`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`
- `@RequestParam`
- Response Handling
- H2 In-Memory Database Basics
- Distributed Architecture Overview

---

## 1. Spring REST API

A REST API allows different applications to communicate with each other over HTTP.
Spring Boot provides annotations that make it easy to create RESTful APIs.
Basic flow:
Client → REST API → Controller → Service → Repository → Database

---

## 2. REST API HTTP Methods

| HTTP Method | Purpose |
|-------------|---------|
| GET | Retrieve data |
| POST | Create new data |
| PUT | Update existing data |
| PATCH | Partially update data |
| DELETE | Delete data |

---

## 3. Request Handling

Spring Boot provides different annotations for handling HTTP requests.


# Day 8 - Contact App

## Overview

On Day 8, I enhanced the Contact App by implementing complete **CRUD Operations** and **Global Exception Handling** using Spring Boot.

## Features Implemented

### CRUD Operations

Implemented all basic operations for managing contacts:

* **Create** - Add a new contact
* **Read** - Get all contacts and get contact by ID
* **Update** - Update an existing contact
* **Delete** - Delete a contact by ID

### Exception Handling

Implemented centralized exception handling to handle errors properly across the application.

* Created custom exceptions
* Implemented `@RestControllerAdvice`
* Used `@ExceptionHandler`
* Handled `Contact Not Found` exception
* Returned proper HTTP status codes
* Created structured error responses

## API Endpoints

| HTTP Method | Endpoint         | Description          |
| ----------- | ---------------- | -------------------- |
| POST        | `/contacts`      | Create a new contact |
| GET         | `/contacts`      | Get all contacts     |
| GET         | `/contacts/{id}` | Get contact by ID    |
| PUT         | `/contacts/{id}` | Update contact       |
| DELETE      | `/contacts/{id}` | Delete contact       |

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* REST API
* Maven

## Project Structure

```text
ContactApp
├── controller
├── service
├── repository
├── entity
├── dto
└── exception
```

## Key Learnings

* Implemented complete CRUD operations using Spring Boot.
* Learned how to handle exceptions globally.
* Understood the use of `@RestControllerAdvice`.
* Learned how `@ExceptionHandler` works.
* Learned to return appropriate HTTP status codes.
* Improved API error handling and response structure.

## Day 8 Outcome

Successfully completed **CRUD Operations and Global Exception Handling** in the Contact App, making the application more robust, maintainable, and user-friendly.

# Day 9 – Spring Boot, Controllers & REST APIs

## Topics Covered

### Spring Boot Auto-Configuration

* Understood how Spring Boot automatically configures beans and components based on the dependencies present in the project.
* Reduced the need for manual XML/configuration.
* Understood the role of `@SpringBootApplication`, which combines:

  * `@Configuration`
  * `@EnableAutoConfiguration`
  * `@ComponentScan`

### Spring Boot Starters

* Studied how Spring Boot starters simplify dependency management.
* Worked with `spring-boot-starter-web` for web and REST API development.
* Understood that starters provide the commonly required dependencies together.

### Embedded Server

* Studied the concept of an embedded server in Spring Boot.
* Understood how **Tomcat** is embedded and starts automatically with the application.
* No separate server installation or WAR deployment is required for running the application.

### Spring Controller

* Worked with `@Controller` and `@RestController`.
* Understood how controllers receive HTTP requests and return responses.
* Used `@RequestMapping` to define common URL mappings.

### REST API Basics

* Implemented basic REST endpoints using:

  * `@GetMapping`
  * `@PostMapping`
  * `@PutMapping`
  * `@PatchMapping`
  * `@DeleteMapping`
* Understood how HTTP methods are mapped to CRUD operations.

### Request Handling

* Practiced handling request data using:

  * `@RequestBody`
  * `@PathVariable`
  * `@RequestParam`
* Understood how JSON data is received and mapped to Java objects using `@RequestBody`.

### Practical Work

* Created Spring Boot REST controllers.
* Created API endpoints for handling HTTP requests.
* Tested REST APIs using Postman.
* Verified request and response flow between client and Spring Boot application.

## Key Takeaways

* Auto-configuration reduces manual configuration.
* Starters simplify dependency management.
* Embedded Tomcat allows Spring Boot applications to run independently.
* Controllers handle incoming HTTP requests.
* REST APIs use HTTP methods for performing CRUD operations.
* `@RequestBody`, `@PathVariable`, and `@RequestParam` are used for receiving different types of request data.


# Day 10 – Backend with Spring Boot

##  Topics Covered

### 1. Dependency Injection in Spring Boot

* Understood the concept of **Dependency Injection (DI)** and **Inversion of Control (IoC)**.
* Learned how Spring creates and manages objects as **Spring Beans**.
* Understood how `@Autowired` performs dependency injection.
* Learned how Spring identifies the required bean using **type matching**.
* Studied `@Primary` and `@Qualifier` for resolving multiple beans of the same type.
* Explored different **Spring Bean scopes**, including Singleton and Prototype.

### 2. Spring JDBC

* Learned the basics of **JDBC (Java Database Connectivity)**.
* Understood how JDBC enables Java applications to communicate with databases.
* Learned the role of a **JDBC Driver** in database communication.
* Studied **Spring JDBC** and the use of `JdbcTemplate`.
* Understood how `JdbcTemplate` reduces JDBC boilerplate code and manages database resources.

### 3. HikariCP Connection Pool

* Learned about **HikariCP**, the connection pooling mechanism commonly used by Spring Boot.
* Understood how connections are reused instead of creating a new connection for every request.
* Learned how `DataSource`, HikariCP, JDBC Driver, and MySQL work together.

### 4. H2 Database Integration

* Configured and integrated the **H2 in-memory database** with the Spring Boot application.
* Learned how to configure the H2 database using `application.properties`.
* Used the H2 Console to view and execute SQL queries.
* Tested CRUD operations using the H2 database.

### 5. JPA Entity Lifecycle

* Learned about JPA lifecycle callback annotations:

  * `@PrePersist` – executes before a new entity is inserted.
  * `@PreUpdate` – executes before an existing entity is updated.
* Used lifecycle callbacks for handling automatic entity-related operations such as timestamps.

### 6. Entity Relationships & Mapping

* Worked with `@OneToMany` and `@ManyToOne` relationships.
* Understood the use of `mappedBy`.
* Learned about `cascade` and `orphanRemoval`.
* Created separate **Mapper classes** for converting:

  * `RequestDTO → Entity`
  * `Entity → ResponseDTO`

##  Practical Implementation

Implemented and enhanced the **Contact Application** backend using Spring Boot.

The application included:

* Dependency Injection using Spring Beans
* DTO-to-Entity and Entity-to-DTO mapping
* CRUD operations
* H2 database integration
* JPA/Hibernate entity relationships
* Spring JDBC concepts
* Database connection pooling with HikariCP
* JPA lifecycle callbacks

##  Key Learnings

By the end of Day 10, I understood how Spring Boot manages dependencies, connects applications with databases, manages database connections efficiently, and handles entity lifecycle events and object mapping.

# Day 11  (Started Building Employee Payroll App)

##  Overview

The **Employee Payroll App** is a backend application developed using **Spring Boot** and **Spring Data JPA** to manage employee information and payroll-related operations.

The application allows an organization to maintain employee records, calculate salaries, manage deductions, and perform basic payroll operations through REST APIs.

---

##  Features

* Add a new employee
* Get all employees
* Get employee by ID
* Update employee details
* Delete an employee
* Search employees by name
* Search employees by department
* Calculate gross salary
* Calculate net salary
* Manage salary deductions
* Maintain payroll information
* Generate employee salary/payroll details

---

## 🛠️ Technologies Used

| Technology      | Purpose                     |
| --------------- | --------------------------- |
| Java            | Programming Language        |
| Spring Boot     | Backend Framework           |
| Spring Data JPA | Database Operations         |
| Hibernate       | ORM                         |
| MySQL / H2      | Database                    |
| Maven           | Dependency Management       |
| REST API        | Client-Server Communication |
| IntelliJ IDEA   | Development Environment     |

---

##  Project Architecture

The application follows a layered architecture:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

### Controller Layer

Handles HTTP requests and exposes REST APIs.

### Service Layer

Contains business logic such as salary calculation and employee operations.

### Repository Layer

Uses Spring Data JPA to communicate with the database.

### Entity Layer

Represents database tables using JPA entities.

---

##  Employee Information

An employee can contain fields such as:

```text
employeeId
firstName
lastName
email
phone
department
designation
joiningDate
basicSalary
hra
allowance
deduction
```

---

##  Database

The application uses a relational database to store employee and payroll information.

Example employee table:

```text
employee
------------------------------------------------
employee_id
first_name
last_name
email
phone
department
designation
joining_date
basic_salary
hra
allowance
deduction
```

Spring Data JPA and Hibernate are used for mapping Java objects to database tables.

---

##  Project Structure

```text
src
└── main
    └── java
        └── com.example.payroll
            │
            ├── controller
            │   └── EmployeeController.java
            │
            ├── service
            │   ├── EmployeeService.java
            │   └── EmployeeServiceImpl.java
            │
            ├── repository
            │   └── EmployeeRepository.java
            │
            ├── entity
            │   └── Employee.java
            │
            ├── dto
            │   ├── EmployeeRequestDTO.java
            │   └── EmployeeResponseDTO.java
            │
            └── exception
                ├── EmployeeNotFoundException.java
                └── GlobalExceptionHandler.java
```

---


For development and testing, H2 Database can also be used.

---

##  API Testing

The APIs can be tested using tools such as:

* Postman
* Swagger
* IntelliJ HTTP Client

##  Learning Objectives

This project demonstrates practical implementation of:

* Spring Boot
* REST APIs
* Spring Data JPA
* Hibernate
* Entity Mapping
* Repository Pattern
* Service Layer
* DTOs
* Exception Handling
* Database Integration
* CRUD Operations
* Business Logic
* Maven

---

## Day 12 –  Custom Exception Handling in Payroll App

### What I Learned

* Implemented complete **CRUD operations** for the Employee Payroll application.
* Created REST APIs to **Create, Read, Update, and Delete** employee records.
* Used **DTOs (Request DTO and Response DTO)** to handle API request and response data.
* Implemented **Custom Exception Handling** for better error management.
* Created custom exceptions such as `EmployeeNotFoundException`.
* Used `@RestControllerAdvice` and `@ExceptionHandler` for centralized exception handling.
* Tested CRUD APIs and exception scenarios using **Postman**.

### CRUD Operations Implemented

* **POST** – Create a new employee
* **GET** – Retrieve employee details
* **PUT** – Update employee information
* **DELETE** – Delete an employee

### Key Concepts

* RESTful APIs
* Spring Boot
* Spring Data JPA
* DTO Pattern
* Custom Exceptions
* Global Exception Handler
* HTTP Status Codes
* Postman API Testing

### Outcome

Successfully implemented employee CRUD functionality with centralized custom exception handling, making the Payroll application more robust and easier to maintain.


