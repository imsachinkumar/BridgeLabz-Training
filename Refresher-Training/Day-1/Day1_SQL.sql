CREATE DATABASE Health_Clinic_App;
USE Health_Clinic_App;

CREATE TABLE Patients (
    PatientID INT AUTO_INCREMENT PRIMARY KEY,
    FullName VARCHAR(60) NOT NULL,
    DOB DATE,
    Gender ENUM('Male','Female','Other'),
    MobileNo VARCHAR(15) UNIQUE,
    Email VARCHAR(80),
    RegistrationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE Patients MODIFY COLUMN Email VARCHAR(60);
ALTER TABLE Patients ADD COLUMN City VARCHAR(50);
ALTER TABLE Patients CHANGE COLUMN City PatientCity VARCHAR(50);
ALTER TABLE Patients DROP COLUMN PatientCity;
RENAME TABLE Patients TO ClinicPatients;
RENAME TABLE ClinicPatients TO Patients;

INSERT INTO Patients (FullName, DOB, Gender, MobileNo, Email)
VALUES
('Rahul Sharma','1998-05-14','Male','9876543210','rahul@gmail.com'),
('Priya Verma','2000-11-02','Female','9876501234','priya@gmail.com'),
('Karan Singh','1997-07-20','Male','9811122233','karan@gmail.com');

UPDATE Patients
SET MobileNo='9999999999'
WHERE PatientID=1;
DELETE FROM Patients
WHERE PatientID=3;
CREATE TABLE Doctors (
    DoctorID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Specialization VARCHAR(100),
    MobileNo VARCHAR(15) UNIQUE,
    Email VARCHAR(80)
);
INSERT INTO Doctors (FirstName,LastName,Specialization,MobileNo,Email)
VALUES
('Meera','Kapoor','Dermatology','9123456780','meera@clinic.com'),
('Rohit','Mehta','Orthopedics','9123456781','rohit@clinic.com');

SELECT*FROM Patients;
SELECT*FROM Doctors;

CREATE DATABASE CollegeDB;
USE CollegeDB;

CREATE TABLE Students(
    StudentID INT PRIMARY KEY,
    StudentName VARCHAR(100)
);

CREATE TABLE Enrollments(
    EnrollmentID INT PRIMARY KEY,
    StudentID INT,
    FOREIGN KEY(StudentID) REFERENCES Students(StudentID)
);

CREATE TABLE Orders(
OrderID INT,ProductID INT,
PRIMARY KEY(OrderID, ProductID)
);
INSERT INTO Students VALUES
(101,'Ankit'),
(102,'Neha');
INSERT INTO Enrollments VALUES
(1,101),
(2,102);
SELECT *
FROM Students
INNER JOIN Enrollments
ON Students.StudentID = Enrollments.StudentID;

SELECT *
FROM Students
LEFT JOIN Enrollments
ON Students.StudentID = Enrollments.StudentID;

SELECT *
FROM Students
LEFT JOIN Enrollments
ON Students.StudentID = Enrollments.StudentID

UNION
SELECT *
FROM Students
RIGHT JOIN Enrollments
ON Students.StudentID = Enrollments.StudentID;