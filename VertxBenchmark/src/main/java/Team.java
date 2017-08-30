/**
 * Simple POJO class which represents a Team object.
 * Created by bdimitrov on 8/25/17.
 */
public class Team {

    private String name;
    private String country;
    private Stadium stadium;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }
}
