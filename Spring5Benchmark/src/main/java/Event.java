import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Simple POJO class which represents an Event object.
 * Created by bdimitrov on 8/25/17.
 */
public class Event {

    private String eventName;
    private List<Team> teams;

    public Event(@JsonProperty("eventName") String eventName, @JsonProperty("teams") List<Team> teams) {
        this.eventName = eventName;
        this.teams = teams;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
