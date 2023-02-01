package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class LoginRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterApplication.class, args);

	}

}
//@ComponentScan(basePackages = {"com.example"})
//public class SpringDependenciesExampleApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(SpringDependenciesExampleApplication.class, args);
//	}
//}