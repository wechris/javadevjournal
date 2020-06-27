package com.javadevjournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SpringSecurityTutorialSeriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTutorialSeriesApplication.class, args);
        //SpringApplication.run(SpringSecurityTutorialSeriesApplication.class, args);
    }

}
