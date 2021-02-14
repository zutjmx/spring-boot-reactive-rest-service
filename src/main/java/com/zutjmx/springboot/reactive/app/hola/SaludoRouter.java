package com.zutjmx.springboot.reactive.app.hola;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class SaludoRouter {
	
	@Bean
	  public RouterFunction<ServerResponse> route(SaludoHandler saludogHandler) {

	    return RouterFunctions
	      .route(RequestPredicates.GET("/hola")
	    		  .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), saludogHandler::hola);
	  }

}
