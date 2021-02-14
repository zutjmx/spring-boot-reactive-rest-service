package com.zutjmx.springboot.reactive.app.hola;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class SaludoHandler {

	public Mono<ServerResponse> hola(ServerRequest request) {

		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
				.body(BodyInserters.fromValue("Hola, con tecnología Spring Reactive!"));

	}

}
