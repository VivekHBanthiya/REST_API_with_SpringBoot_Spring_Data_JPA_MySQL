# Spring Boot CRUD Application with MySQL Database

This Spring Boot project demonstrates how to perform CRUD (Create, Read, Update, Delete) operations using a MySQL database. Follow these steps to set up and run the project:

## Tools Required
- **IntelliJ IDE:** We recommend using IntelliJ IDEA as the development environment.
- **Postman:** A popular tool for testing RESTful APIs.
- **MySQL Workbench:** For managing the MySQL database.

## Project Setup

1. Clone or download this project and open it in IntelliJ IDEA.
2. Ensure that you refresh Maven dependencies to avoid any potential errors.

## Database Configuration

Before running the application, make sure you have created a MySQL database schema named "Student" using MySQL Workbench.

## Running the Application

1. Run the `CRUDApplication` class. If everything is set up correctly, you will see a message in the console saying "Started CrudApplication."

## Using Postman

In Postman, you can test the following five types of operations:

### 1. GET - Get Specific Student Data

To retrieve specific student data using a Student ID, use the following URL:

```
GET http://localhost:8080/StudentDetails/{studentID}
```

Replace `{studentID}` with the actual Student ID you want to retrieve.

### 2. GETALL - Get All Student Data

To retrieve details of all students, use the following URL:

```
GET http://localhost:8080/StudentDetails/
```

### 3. POST - Create New Student

To create a new student, send a POST request to the following URL with JSON data in the request body:

```
POST http://localhost:8080/StudentDetails
```

Example JSON request body:

```json
{
  "studentID": "CS1",
  "studentName": "Stud_NAME",
  "studentDepartment": "CSE"
}
```

### 4. PUT - Update Existing Student Details

To update existing student details, send a PUT request to the following URL, replacing `{studentID}` with the Student ID you want to update:

```
PUT http://localhost:8080/StudentDetails/{studentID}
```

Include the updated student data in the request body.

### 5. DELETE - Delete Student Data

To delete a student by Student ID, send a DELETE request to the following URL:

```
DELETE http://localhost:8080/StudentDetails/{studentID}
```

Replace `{studentID}` with the Student ID you want to delete from the database.

## Enjoy Using the CRUD Application!

Feel free to use this CRUD application to manage student data in your MySQL database. If you encounter any issues or have questions, please refer to the project's documentation or seek assistance from the development team.
