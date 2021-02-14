package com.zutjmx.springboot.reactive.app.hola;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class SaludoWebClient {
	
	private WebClient cliente = WebClient.create("http://localhost:8080");

	@SuppressWarnings("deprecation")
	private Mono<ClientResponse> result = cliente.get()
	      .uri("/hola")
	      .accept(MediaType.TEXT_PLAIN)
	      .exchange();

	  public String getResult() {
	    return ">> Resultado = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
	  }

}
