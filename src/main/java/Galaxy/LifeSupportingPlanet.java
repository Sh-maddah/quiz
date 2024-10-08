package src.main.java.Galaxy;

public class LifeSupportingPlanet extends Planet{
    private String lifeExistence;

    public LifeSupportingPlanet(String planetName, String planetType, String moons, String distanceFromSun, String lifeExistence) {
        super(planetName, planetType, moons, distanceFromSun);
        this.lifeExistence = lifeExistence;
    }
}
