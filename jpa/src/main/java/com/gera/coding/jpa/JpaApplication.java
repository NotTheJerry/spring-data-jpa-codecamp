package com.gera.coding.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

import com.gera.coding.jpa.models.Author;
import com.gera.coding.jpa.repositories.AuthorRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// @Bean
	public CommandLineRunner commandLineRunner ( AuthorRepository repository ) {
		return args -> {
			var author = Author.builder()
			.firstName("Gera")
			.lastName("Gonzalez")
			.age(19)
			.email("geraglez@gmail.com")
			.build();

			repository.save(author);
		};
	}

}