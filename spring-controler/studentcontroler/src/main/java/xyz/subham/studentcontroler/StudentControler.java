package xyz.subham.studentcontroler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentControler {
    private List<Student> student = new ArrayList<>();

    @PostConstruct
    void init() {
        student.addAll(
                List.of(
                        new Student("subham", 123),
                        new Student("jena",124)));

                
    }
    @GetMapping("/Students")
    List<Student> getStudent() {
        return student;
    }
}
