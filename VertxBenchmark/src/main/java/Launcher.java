import io.vertx.core.Vertx;

/**
 * Application entry point which starts HTTP server.
 * Created by bdimitrov on 8/25/17.
 */
public class Launcher {

    public static void main(String args[]) {
        Vertx.vertx().deployVerticle(new Server());
    }
}
