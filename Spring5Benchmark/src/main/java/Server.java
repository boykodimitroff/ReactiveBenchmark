import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.ipc.netty.http.server.HttpServer;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.contentType;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * @author Boyko Dimitrov on 9/1/17.
 */
public class Server {

    public static void init() throws Exception {
        RouterFunction<ServerResponse> route = routingFunction();
        HttpHandler httpHandler = toHttpHandler(route);

        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);
        HttpServer server = HttpServer.create("localhost", 8080);
        server.newHandler(adapter).block();

        System.out.println("Press ENTER to stop the server.");
        System.in.read();
    }

    public static RouterFunction<ServerResponse> routingFunction() {
        EventHandler handler = new EventHandler();

        return route(POST("/event").and(contentType(APPLICATION_JSON)), handler::createEvent);
    }
}
