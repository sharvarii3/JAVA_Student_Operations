# Student Management System

## Description
This is a menu-driven Java program that demonstrates the concepts of **classes, objects, instance members, constructors, arrays, and ArrayLists** in Java. The program allows users to manage student records by performing operations like **adding, displaying, searching, updating, and deleting student data**.

## Features
- **Add Students**: Allows users to input multiple student details.
- **Display Students**: Shows a list of all students.
- **Search Students**:
  - By Student ID
  - By Full Name
  - By Rank
- **Update Student Information**: Modify student details using Student ID.
- **Delete a Student**: Remove a student record using Student ID.
- **Menu-Driven Approach**: Users can interactively perform operations using a menu system.

## File Structure
The program is divided into separate Java files to maintain modularity and readability:

1. ** `Student.java` **  
   - Represents the **Student class**, containing attributes like `studentId`, `fullName`, `birthDate`, `score`, and `rank`.
   - Includes **constructors, getters, setters**, and an overridden `toString()` method.

2. ** `StudentOperations.java` **  
   - Contains methods for performing student-related operations:
     - `addStudent()`
     - `displayStudents()`
     - `deleteStudent()`
     - `updateStudent()`
     - `searchByPrn()`
     - `searchByName()`
     - `searchByRank()`

3. **`Main.java`**  
   - Implements the **menu-driven interface**.
   - Calls methods from `StudentOperations` based on user input.




