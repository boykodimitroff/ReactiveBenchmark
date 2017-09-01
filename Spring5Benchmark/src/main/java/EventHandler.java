import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author Boyko Dimitrov on 8/28/17.
 */
public class EventHandler {

    public Mono<ServerResponse> createEvent(ServerRequest request) {
        Mono<Event> event = request.bodyToMono(Event.class);

        return ServerResponse.ok().body(event, Event.class);
    }
}
