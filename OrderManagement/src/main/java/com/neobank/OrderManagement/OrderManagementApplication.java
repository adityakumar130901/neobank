package com.neobank.OrderManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderManagementApplication {
	
	public static void main(String[] args) {
	
		System.getProperties().put( "server.port", 8080);
		SpringApplication.run(OrderManagementApplication.class, args);
	}

}
