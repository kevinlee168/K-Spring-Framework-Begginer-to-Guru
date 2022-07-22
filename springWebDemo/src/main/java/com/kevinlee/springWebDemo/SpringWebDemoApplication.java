package com.kevinlee.springWebDemo;

import com.kevinlee.springWebDemo.domain.Author;
import com.kevinlee.springWebDemo.repositories.AuthorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWebDemoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringWebDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringWebDemoApplication.class, args);
	}

}
