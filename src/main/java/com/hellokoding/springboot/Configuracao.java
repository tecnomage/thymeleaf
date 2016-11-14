package com.hellokoding.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
public class Configuracao  {	

    public static void main(String[] args) throws Exception {
    	 
    	//TODO deve tools not ok; must restart the app to apply changes
    	System.setProperty("spring.devtools.restart.enabled", "true");
    	 SpringApplication.run(Configuracao.class, args);
    }
    

    
}

