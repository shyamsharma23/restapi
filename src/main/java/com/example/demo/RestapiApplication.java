package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.controller.TodoController;
import com.example.demo.repository.ToDoRepository;

@SpringBootApplication
@ComponentScan(basePackageClasses = TodoController.class)
@EnableMongoRepositories(basePackageClasses = ToDoRepository.class)


public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

}
