package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public StudentService(StudentService studentService){
        this.studentRepository = new StudentRepository();
    }
    public Student createStudent(Student studentreq){
        return studentRepository.save(studentreq);
    }
    public Student getStudent(Long id){
        return studentRepository.findById(id);
    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
