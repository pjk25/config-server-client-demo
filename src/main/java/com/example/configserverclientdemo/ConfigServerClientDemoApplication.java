package com.example.configserverclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigServerClientDemoApplication {

    @Autowired
    Message message;

    @RequestMapping("/")
    public String home() {
        return "Hello " + message.get();
    }

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerClientDemoApplication.class, args);
	}
}
