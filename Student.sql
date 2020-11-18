CREATE DATABASE IF NOT EXISTS Student;
USE Student;
Create table student(
    studentID varchar(6) primary key,
    studentName varchar(20),
    address varchar(20),
    phone int unique
);
