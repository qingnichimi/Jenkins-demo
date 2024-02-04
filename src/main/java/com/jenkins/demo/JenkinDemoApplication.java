package com.jenkins.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class JenkinDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(JenkinDemoApplication.class, args);
	}
}
