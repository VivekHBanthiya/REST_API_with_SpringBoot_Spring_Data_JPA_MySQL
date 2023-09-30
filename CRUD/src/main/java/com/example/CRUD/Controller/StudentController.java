package com.example.CRUD.Controller;

import com.example.CRUD.model.Student;
import com.example.CRUD.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/StudentDetails")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("{StudentID}")
    public Student getStudentDetails(@PathVariable("StudentID") String StudentID)
    {
        return studentService.getStudent(StudentID);
    }
    @GetMapping()
    public List<Student> getAllStudentDetails()
    {
        return studentService.getAllStudent();
    }

    @PostMapping
    public String CreateStudentDetails(@RequestBody Student student)
    {
        studentService.createStudent(student);
        return "Successfully CREATED StudentDetails";
    }

    @PutMapping
    public String UpdateStudentDetails(@RequestBody Student student)
    {
        studentService.updateStudent(student);
        return "Successfully UPDATED StudentDetails";
    }

    @DeleteMapping("{StudentID}")
    public String deleteStudentDetails(@PathVariable("StudentID") String StudentID)
    {
        studentService.deleteStudent(StudentID);
        return "Successfully DELETED StudentDetails";
    }
}
