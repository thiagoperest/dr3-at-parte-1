package br.edu.infnet.dr3atparte1.controller;

import br.edu.infnet.dr3atparte1.dto.SaudacaoResponseDto;
import br.edu.infnet.dr3atparte1.service.SaudacaoService;
import io.javalin.http.Context;

public class SaudacaoController {

    private static final SaudacaoService saudacaoService = new SaudacaoService();

    public static void saudacao(Context ctx) {
        String nome = ctx.pathParam("nome");
        SaudacaoResponseDto response = saudacaoService.generateSaudacaoResponse(nome);
        ctx.json(response);
    }
}