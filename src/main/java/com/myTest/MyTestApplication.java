package com.myTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyTestApplication {
	
	public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
//            + "classpath:real-application.yml";
			+ "/app/config/myTest/real-application.yml";
	
	public static void main(String[] args) {
		SpringApplication.run(MyTestApplication.class, args);
	}

}
