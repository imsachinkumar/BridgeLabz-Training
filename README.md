

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
