# Student Management System (Java)

## 📌 Overview
This is a **menu-driven Java program** designed to efficiently manage student records. It provides functionalities to **add, search, update, and delete students** using **Object-Oriented Programming (OOP) principles** in Java. The system is built with **multiple Java classes** to maintain a clean structure.

## 🚀 Features & Functions
The system includes the following core functionalities:

1. **Add Student (`addStudent`)** – Allows users to input student details such as PRN, Name, and Marks, storing them in an array of objects.
2. **Display Students (`displayStudents`)** – Lists all students with their respective details in a structured format.
3. **Search Students**
   - **By PRN (`searchStudentByPRN`)** – Finds a student based on their PRN (unique ID).
   - **By Name (`searchStudentByName`)** – Searches for students by name.
   - **By Position (`searchStudentByPosition`)** – Retrieves a student based on their position in the stored list.
4. **Update Student (`updateStudent`)** – Modifies the details of an existing student.
5. **Delete Student (`deleteStudent`)** – Removes a student from the record.

Each function is implemented in `StudentOperations.java`, while `Main.java` handles user interactions through a menu-driven interface.

## 📂 Project Structure
📦 StudentManagementSystem ┣ 📜 Student.java # Defines the Student class and attributes ┣ 📜 StudentOperations.java # Contains core functionalities (CRUD operations) ┣ 📜 Main.java # Handles user input and menu navigation ┣ 📜 README.md # Project documentation
