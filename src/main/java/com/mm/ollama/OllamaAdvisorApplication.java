package com.mm.ollama;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OllamaAdvisorApplication {

    private static Logger logger = LoggerFactory.getLogger(OllamaAdvisorApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OllamaAdvisorApplication.class, args);
    }

}
