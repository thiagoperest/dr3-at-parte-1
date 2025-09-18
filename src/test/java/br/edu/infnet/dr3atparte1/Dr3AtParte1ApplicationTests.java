package br.edu.infnet.dr3atparte1;

import br.edu.infnet.dr3atparte1.config.RouteConfig;
import br.edu.infnet.dr3atparte1.dto.MensalistaRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    @Test
    @DisplayName("Teste de integração do endpoint /mensalistas (POST)")
    void testCreateMensalistaEndpoint() {
        // Arrange
        Javalin app = Javalin.create();
        RouteConfig.configureRoutes(app);

        // Act & Assert
        JavalinTest.test(app, (server, client) -> {
            try {
                MensalistaRequestDto request = new MensalistaRequestDto("M004", "Thiago Peres", "Desenvolvedor de Software III", 18000.0);
                ObjectMapper mapper = new ObjectMapper();
                String jsonBody = mapper.writeValueAsString(request);

                var response = client.post("/mensalistas", jsonBody);

                assertEquals(201, response.code());

                assertTrue(response.body().string().contains("Thiago Peres"));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Test
    @DisplayName("Teste de integração do endpoint /mensalistas/{matricula}")
    void testGetMensalistaByMatriculaEndpoint() throws Exception {
        // Arrange
        Javalin app = Javalin.create();
        RouteConfig.configureRoutes(app);
        
        // Act & Assert
        JavalinTest.test(app, (server, client) -> {
            var response = client.get("/mensalistas/M001");

            assertEquals(200, response.code());

            assertTrue(response.body().string().contains("João Silva"));
        });
    }

}
