package com.neobank.OrderManagement.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class ApplicationConfiguration{

    // passing the key which you set in application.properties
    @Value("${server.port}")
    private int serverPort;

    // getting the value from that key which you set in application.properties
    @Bean
    public int getServerPort() {
        return serverPort;
    }
}