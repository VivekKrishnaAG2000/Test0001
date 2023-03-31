package com.example.Test0001;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Test0001Application {

	public static void main(String[] args) {
		SpringApplication.run(Test0001Application.class, args);
		Test0001 test0001 = new Test0001();
		test0001.run();
	}
	
}
