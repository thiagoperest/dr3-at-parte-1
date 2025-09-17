package br.edu.infnet.dr3atparte1.config;

import br.edu.infnet.dr3atparte1.controller.EchoController;
import br.edu.infnet.dr3atparte1.controller.HelloController;
import br.edu.infnet.dr3atparte1.controller.SaudacaoController;
import br.edu.infnet.dr3atparte1.controller.StatusController;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class RouteConfig {

    public static void configureRoutes(Javalin app) {
        // Rubrica 1, item 1 -> Rota do endpoint "hello"
        app.get("/hello", HelloController::hello);
        
        // Rubrica 1, item 2 -> Rota do endpoint "status"
        app.get("/status", StatusController::status);
        
        // Rubrica 1, item 3 -> Rota do endpoint "echo"
        app.post("/echo", EchoController::echo);
        
        // Rubrica 1, item 4 -> Rota do endpoint "saudacao"
        app.get("/saudacao/{nome}", SaudacaoController::saudacao);
    }

}
