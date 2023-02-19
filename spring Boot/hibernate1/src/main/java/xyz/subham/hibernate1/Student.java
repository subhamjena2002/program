package xyz.subham.hibernate1;

import jakarta.persistence.Entity;

@Entity
public record Student(int roll,String name ,double fee) {
    
}
