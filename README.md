# REST_API_with_SpringBoot_Spring_Data_JPA_MySQL

This is SpringBoot project to perform CRUD operation with configuring MySQL database. Following tools we are going to use for this project:
1) Intellij IDE
2) Postman
3) MySQl workbench

Follow the steps to perform this project:

1) Open downloaded folder in Intellij IDE.
2) Make sure you have refresh maven dependency to avoid error.
3) Before clicking on Run make sure you have Schema "Student" created in your workbench.
4) Now run CRUDApplication. If everything is perfectly connected you will get "Started CrudApplication" message.

 Postman use:
 In postman we are going to perform 5 types of operation:
 1) GET - to get specific student data from data using StudentID
 2) GETALL - to get all student data
 3) POST - to create new student details
 4) PUT - to update existing student details
 5) DELETE - to Delete student data using StudentID

-> Now Select POST and Enter url "http://localhost:8080/StudentDetails" to create new student 
for eg: {
    "studentID": "CS1",
    "studentName": "Stud_NAME",
    "studentDepartment": "CSE"
}

-> Now Select GET and Enter url "http://localhost:8080/StudentDetails/CS1" to get the details we created using POST

-> Now Select GET and Enter url "http://localhost:8080/StudentDetails/" to get details of all the students created in Database

-> Now Select PUT and enter url "http://localhost:8080/StudentDetails/CS1" to update any details.

-> Now Select DELETE and url "http://localhost:8080/StudentDetails/CS1" to Delete student with id CS1 from the database.
