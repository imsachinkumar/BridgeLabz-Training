

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

## 🛠 Skills Gained

- ER Diagram Design
- Database Modeling
- Understanding Cardinality
- Database Indexing
- Query Performance Optimization
- Database Normalization (1NF, 2NF, 3NF, BCNF)

---

