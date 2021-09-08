package com.Trainee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//@EnableEurekaClient
@SpringBootApplication
public class DemoTcsApplication {

	public static void main(String[] args) {
		SpringApplication.run((DemoTcsApplication.class), args);
	}

}
