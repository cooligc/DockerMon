package com.skc.broaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SlackBrokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlackBrokerApplication.class, args);
	}
	
	@Bean 
    public RestTemplate restTemplate() {
        RestTemplate template = new RestTemplate();
        return template;
    }
}
