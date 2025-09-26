package br.edu.infnet.dr3atparte1.controller;

import br.edu.infnet.dr3atparte1.dto.HelloResponseDto;
import br.edu.infnet.dr3atparte1.service.HelloService;
import io.javalin.http.Context;

public class HelloController {

    private static final HelloService helloService = new HelloService();

    public static void hello(Context ctx) {
        HelloResponseDto response = helloService.generateHelloResponse();
        ctx.json(response);
    }
}
