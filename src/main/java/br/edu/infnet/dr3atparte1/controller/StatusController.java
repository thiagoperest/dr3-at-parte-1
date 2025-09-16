package br.edu.infnet.dr3atparte1.controller;

import br.edu.infnet.dr3atparte1.dto.StatusResponseDto;
import br.edu.infnet.dr3atparte1.service.StatusService;
import io.javalin.http.Context;

public class StatusController {

    private static final StatusService statusService = new StatusService();

    public static void status(Context ctx) {
        StatusResponseDto response = statusService.generateStatusResponse();
        ctx.json(response);
    }
}
