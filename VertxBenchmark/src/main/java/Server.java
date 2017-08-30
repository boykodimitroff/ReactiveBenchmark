import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;

/**
 * Created by bdimitrov on 8/25/17.
 */
public class Server extends AbstractVerticle {

    @Override
    public void start() {
        HttpServer server = vertx.createHttpServer();
        Router router = Router.router(vertx);

        router.route(HttpMethod.POST, "/event").handler(routingContext -> {
            HttpServerRequest req = routingContext.request();
            req.bodyHandler(buffer -> {
                Event event = Json.decodeValue(buffer.toString(), Event.class);
                routingContext.response().end(Json.encode(event));
            });

        });

        server.requestHandler(router::accept).listen(8080);
    }
}
