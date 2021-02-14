package com.zutjmx.springboot.reactive.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zutjmx.springboot.reactive.app.hola.SaludoWebClient;

@SpringBootApplication
public class SpringBootReactiveRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactiveRestServiceApplication.class, args);
		
		SaludoWebClient gwc = new SaludoWebClient();
	    System.out.println(gwc.getResult());
		
	}

}
