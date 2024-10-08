package src.main.java.Galaxy;

public class Planet {
    private String planetName;
    private PlanetType planetType;
    private String moons;
    private String distanceFromSun;

    public Planet(String planetName, String planetType, String moons, String distanceFromSun) {
    }

    public Planet(String planetName) {
        this.planetName = planetName;
    }

    public Planet() {
    }

    public Planet(String planetName, PlanetType planetType, String moons, String distanceFromSun) {
        this.planetName = planetName;
        this.planetType = planetType;
        this.moons = moons;
        this.distanceFromSun = distanceFromSun;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }

    public String getMoons() {
        return moons;
    }

    public void setMoons(String moons) {
        this.moons = moons;
    }

    public String getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(String distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }
}
