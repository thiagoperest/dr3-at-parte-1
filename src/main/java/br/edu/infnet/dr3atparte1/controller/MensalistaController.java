package br.edu.infnet.dr3atparte1.controller;

import br.edu.infnet.dr3atparte1.dto.MensalistaRequestDto;
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

    public static void getMensalistaByMatricula(Context ctx) {
        String matricula = ctx.pathParam("matricula");
        MensalistaResponseDto mensalista = mensalistaService.getMensalistaByMatricula(matricula);
        
        if (mensalista != null) {
            ctx.json(mensalista);
        } else {
            ctx.status(404).json("Mensalista não encontrado");
        }
    }

    public static void createMensalista(Context ctx) {
        MensalistaRequestDto request = ctx.bodyAsClass(MensalistaRequestDto.class);
        MensalistaResponseDto response = mensalistaService.createMensalista(request);
        ctx.status(201).json(response);
    }
}
