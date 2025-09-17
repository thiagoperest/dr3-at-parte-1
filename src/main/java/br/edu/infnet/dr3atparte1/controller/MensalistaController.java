package br.edu.infnet.dr3atparte1.controller;

import br.edu.infnet.dr3atparte1.dto.MensalistaResponseDto;
import br.edu.infnet.dr3atparte1.service.MensalistaService;
import io.javalin.http.Context;

import java.util.List;

public class MensalistaController {

    private static final MensalistaService mensalistaService = new MensalistaService();

    public static void getAllMensalistas(Context ctx) {
        List<MensalistaResponseDto> mensalistas = mensalistaService.getAllMensalistas();
        ctx.json(mensalistas);
    }
}
