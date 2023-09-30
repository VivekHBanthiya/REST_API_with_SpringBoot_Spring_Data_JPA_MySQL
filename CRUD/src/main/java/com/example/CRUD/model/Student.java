package com.example.CRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {
    @Id
    private String StudentID;
    private String StudentName;
    private String StudentDepartment;

    public Student() {
    }

    public Student(String studentID, String studentName, String studentDepartment) {
        StudentID = studentID;
        StudentName = studentName;
        StudentDepartment = studentDepartment;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentDepartment() {
        return StudentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        StudentDepartment = studentDepartment;
    }
}
