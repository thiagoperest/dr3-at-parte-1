package br.edu.infnet.dr3atparte1;

import br.edu.infnet.dr3atparte1.config.RouteConfig;
import io.javalin.Javalin;
import io.javalin.testtools.JavalinTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Dr3AtParte1ApplicationTests {

    @Test
    @DisplayName("Teste de integração do endpoint /hello")
    void testHelloEndpoint() {
        // Arrange
        Javalin app = Javalin.create();
        RouteConfig.configureRoutes(app);
        
        // Act & Assert
        JavalinTest.test(app, (server, client) -> {
            var response = client.get("/hello");

            assertEquals(200, response.code());

            assertTrue(response.body().string().contains("Hello, Javalin!"));
        });
    }

}
