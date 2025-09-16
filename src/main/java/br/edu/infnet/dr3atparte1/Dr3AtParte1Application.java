package br.edu.infnet.dr3atparte1;

import br.edu.infnet.dr3atparte1.config.RouteConfig;
import io.javalin.Javalin;

public class Dr3AtParte1Application {

    private static final int PORT = 8080;

    public static void main(String[] args) {
        // Configuração do Javalin
        Javalin app = Javalin.create(config -> {
            config.showJavalinBanner = false;
            config.bundledPlugins.enableDevLogging();
        });

        // Configuração das rotas
        RouteConfig.configureRoutes(app);

        // Inicialização do servidor
        app.start(PORT);

        System.out.println("Servidor Javalin iniciado na porta: " + PORT);
        System.out.println("Endpoints Rubrica 1:");
        System.out.println("Item 1: http://localhost:" + PORT + "/hello");
        System.out.println("Item 2: http://localhost:" + PORT + "/status");
        System.out.println("Item 3: http://localhost:" + PORT + "/echo");
    }

}
