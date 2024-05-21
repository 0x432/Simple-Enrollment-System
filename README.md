# Simple-Enrollment-System

## Description

The Simple Enrollment System project simulates managing student enrollments in modules using Java. This program was created to complete an aspect of the Algorithms and Data Structures module.

## Usage

### 1. StudentSupportOffice.java
**Functionality:**
- This program serves as the entry point for managing student enrollments.
- It initializes modules, enrolls students, displays module enrollments, and handles student enrollment updates.

### 2. Module.java
**Functionality:**
- This program defines the `Module` class.
- It manages a list of enrolled students, including adding, removing, and displaying students.

### 3. Student.java
**Functionality:**
- This program defines the `Student` class.
- It includes attributes for student ID and implements methods to retrieve and compare student IDs.

## How It Works

- **Module Initialization:** The `StudentSupportOffice` initializes several `Module` objects with unique IDs.
- **Student Enrollment:** Students are enrolled in modules using the `student_Enrolment` method in the `Module` class.
- **Displaying Enrollments:** The `toString` method in `Module` displays the list of enrolled students.
- **Updating Enrollments:** Students can be enrolled or unenrolled using the `student_Enrolment` and `unenrollStudent` methods in the `Module` class.

## Example

```java
Module module1 = new Module("CIS2206");
Student student1 = new Student("U0000001");
module1.student_Enrolment(student1);
System.out.println(module1);
```
## Requirements

- Java Development Kit (JDK)

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac Student.java
javac Module.java
javac StudentSupportOffice.java
java StudentSupportOffice
``` 
Ensure that all the `.java` files are in the same directory when compiling and running the program.

