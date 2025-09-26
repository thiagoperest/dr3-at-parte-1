package br.edu.infnet.dr3atparte1.controller;

import br.edu.infnet.dr3atparte1.dto.EchoRequestDto;
import br.edu.infnet.dr3atparte1.dto.EchoResponseDto;
import br.edu.infnet.dr3atparte1.service.EchoService;
import io.javalin.http.Context;

public class EchoController {

    private static final EchoService echoService = new EchoService();

    public static void echo(Context ctx) {
        EchoRequestDto request = ctx.bodyAsClass(EchoRequestDto.class);
        EchoResponseDto response = echoService.generateEchoResponse(request);
        ctx.json(response);
    }
}
