package com.myTest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyTestApplication {
	
	public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/home/ec2-user/app/config/myTest/real-application.yml";
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(MyTestApplication.class)
        .properties(APPLICATION_LOCATIONS)
        .run(args);
	}

}
