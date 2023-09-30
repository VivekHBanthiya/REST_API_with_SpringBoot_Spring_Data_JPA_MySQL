package com.example.CRUD.service.impl;

import com.example.CRUD.model.Student;
import com.example.CRUD.repository.StudentRepository;
import com.example.CRUD.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public String createStudent(Student student) {
        studentRepository.save(student);
        return "Success";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Success";
    }

    @Override
    public String deleteStudent(String StudentID) {
        studentRepository.deleteById(StudentID);
        return "Success";
    }

    @Override
    public Student getStudent(String StudentID) {
        return studentRepository.findById(StudentID).get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
