package org.example.repository;

import org.example.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    private Map<Long, Student> studentDB;

    public StudentRepository(){
        studentDB = new HashMap<>();
    }

    public Student save(Student studentreq){
        studentDB.put( studentreq.getId(),studentreq);
        return studentreq;

    }

    public Student findById(Long id){
        return studentDB.get(id);
    }
    public List<Student> findAll(){
        return new ArrayList<>(studentDB.values());
    }
}
