package br.edu.infnet.dr3atparte1.config;

import br.edu.infnet.dr3atparte1.controller.HelloController;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class RouteConfig {

    public static void configureRoutes(Javalin app) {
        // Rubrica 1, item 1 -> Rota do endpoint "hello"
        app.get("/hello", HelloController::hello);
    }

}
