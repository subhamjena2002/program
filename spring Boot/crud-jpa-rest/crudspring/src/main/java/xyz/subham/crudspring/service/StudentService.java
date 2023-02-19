package xyz.subham.crudspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import xyz.subham.crudspring.model.Student;
import xyz.subham.crudspring.repository.StudentRepository;


@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentrepository;
    
    public Student add(Student student) {
        studentrepository.save(student);
        return student;
    }
    public Student findById(int roll) {
        return studentrepository.findById(roll).orElseThrow();

    }

    public void delete(Student student) {
        studentrepository.delete(student);
    }

    public List<Student> getAllStudent() {
        return studentrepository.findAll();
        
    }
}
