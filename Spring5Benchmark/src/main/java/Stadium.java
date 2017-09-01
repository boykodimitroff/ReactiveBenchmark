import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Simple POJO class which represents a Stadium object.
 * Created by bdimitrov on 8/25/17.
 */
public class Stadium {

    private String name;

    public Stadium(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}