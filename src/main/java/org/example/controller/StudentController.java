package org.example.controller;

import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
@PostMapping
    public ResponseEntity<Student> createStudent(Student studentReq){
        Student studentResp = studentService.createStudent(studentReq);
        return  ResponseEntity.ok(studentResp);
}



}
