package src.main.java.Galaxy;

public class ResourceRichPlanet extends Planet{
    public String resources;

    public ResourceRichPlanet(String planetName, String planetType, String moons, String distanceFromSun, String resources) {
        super(planetName, planetType, moons, distanceFromSun);
        this.resources = resources;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }
}
