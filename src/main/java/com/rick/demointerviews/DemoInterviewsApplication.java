package com.rick.demointerviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class DemoInterviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoInterviewsApplication.class, args);
	}

}
