package com.pichon.CarCalBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CarCalBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarCalBasicApplication.class, args);
	}
	
	@RequestMapping(value="/marcas", method=RequestMethod.GET)
    public String hello() {
            return "Hello Spring Boot!";
    }

	
}