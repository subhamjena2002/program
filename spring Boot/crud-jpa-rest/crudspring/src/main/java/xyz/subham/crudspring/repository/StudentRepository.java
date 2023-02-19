package xyz.subham.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.subham.crudspring.model.Student;

public interface StudentRepository extends JpaRepository<Student , Integer> {
    
}
