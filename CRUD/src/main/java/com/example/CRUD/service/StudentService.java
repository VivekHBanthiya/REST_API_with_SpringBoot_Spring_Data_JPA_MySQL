package com.example.CRUD.service;

import com.example.CRUD.model.Student;

import java.util.List;

public interface StudentService {
    public String createStudent(Student student);
    public String updateStudent(Student student);
    public String deleteStudent(String StudentID);
    public Student getStudent(String StudentID);
    public List<Student> getAllStudent();
}
