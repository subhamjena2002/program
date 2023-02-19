package xyz.subham.hibernate1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hibernate1Application  implements CommandLineRunner{
	@Autowired
	private StudentRepository StudentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Hibernate1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student  student = new Student(106, "sai", 7890.63);
		
	}

}
