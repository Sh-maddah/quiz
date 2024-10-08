package src.main.java;

import src.main.java.Galaxy.Galaxy;
import src.main.java.Galaxy.LifeSupportingPlanet;
import src.main.java.Galaxy.Planet;
import src.main.java.Galaxy.ResourceRichPlanet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    private static String menu = "1.Galaxy Display \n2.Add Planet\n3.Change Moons\n4.Planet Display\n5.Save and Exit";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Galaxy galaxy=defineGalaxy(scanner);
        Planet planet=definePlanet(scanner);
        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.println(menu);
            String input = scanner2.nextLine();
            switch (input) {
                case "1":
                    galaxyDisplay(galaxy);
                    break;
                case "2":
                    definePlanet(scanner);
                    break;
                case "3":
                    updateMoonCount(scanner);
                    break;
                case "4":
                    planetDisplay(planet);
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }


    }


    private static void loadPlanetsFromFile(Galaxy galaxy) {
        File planetsFile = new File("C:\\Users\\sh.maddah\\Desktop\\Planet.txt");
        try {
            try (Scanner scanner = new Scanner(planetsFile)) {
                while (scanner.hasNextLine()) {
                    String planetString = scanner.nextLine();
                    String planetName = planetString.split("#")[0];
                    String galaxyName = planetString.split("#")[1];
                    String planetType = planetString.split("#")[2];
                    String moons = planetString.split("#")[3];
                    String distanceFromSun = planetString.split("#")[4];
                    String lifeExistence = planetString.split("#")[5];
                    String resources = planetString.split("#")[6];

                    LifeSupportingPlanet lifeSupportingPlanet = new LifeSupportingPlanet(planetName, planetType, moons, distanceFromSun, lifeExistence);
                    ResourceRichPlanet resourceRichPlanet = new ResourceRichPlanet(planetName, planetType, moons, distanceFromSun, resources);
                    galaxy.getPlanets().add(lifeSupportingPlanet);
                    galaxy.getPlanets().add(resourceRichPlanet);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Galaxy defineGalaxy(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Enter galaxy name:");
                String galaxyName = scanner.nextLine();
                if (galaxyName.trim().equals("")) {
                    throw new Exception("Invalid name");
                }
                Galaxy galaxy = new Galaxy(galaxyName);
                return galaxy;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static Galaxy galaxyDisplay(Galaxy galaxy) {
        System.out.println("Galaxies:\n");
        return galaxy;

    }
    private static Planet definePlanet(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Enter planet name:");
                String planetName = scanner.nextLine();
                if (planetName.trim().equals("")) {
                    throw new Exception("Invalid name");
                }
                Planet planet=new Planet(planetName);
                return planet;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    private static Planet planetDisplay(Planet planet) {
        System.out.println("Planets:\n");
        return planet;

    }
    private static void updateMoonCount(Scanner scanner3){
        Planet planet=new Planet();
        System.out.println("Enter New Count:\n");
        String moonCount = scanner3.nextLine();
        planet.setMoons(moonCount);

    }


}
