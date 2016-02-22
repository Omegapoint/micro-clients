package se.omegapoint.micro.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Tv100Application {

	public static void main(String[] args) {
		SpringApplication.run(Tv100Application.class, args);
	}
}
