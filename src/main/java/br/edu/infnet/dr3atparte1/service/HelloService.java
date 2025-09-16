package br.edu.infnet.dr3atparte1.service;

import br.edu.infnet.dr3atparte1.dto.HelloResponseDto;

public class HelloService {
    public HelloResponseDto generateHelloResponse() {
        return new HelloResponseDto("Hello, Javalin!");
    }
}
