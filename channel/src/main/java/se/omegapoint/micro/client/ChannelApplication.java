package se.omegapoint.micro.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * This is the starting point of the Spring Boot application.
 * Spring Boot will magically set up an web application server and deploy your code there.
 *
 * TODO: Uppgift 2 - Genom en annotering kan man säga åt Spring Boot att den ska registrera sig som en mikrotjänst.
 * TODO: Obs, detta kräver även ändringar i applikationens konfigureringar.
 */
@SpringBootApplication
public class ChannelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChannelApplication.class, args);
	}
}
