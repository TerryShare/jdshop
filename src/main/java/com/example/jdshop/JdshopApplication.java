package com.example.jdshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //http://localhost:8081/swagger-ui.html#/user45controller
public class JdshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdshopApplication.class, args);
	}

}
