package com.eab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String, HeavenlyBody> heavenlyBody = new HashMap<>();
        Set<HeavenlyBody> planets = new HashSet<>();

        // Mercury
        HeavenlyBody planet = new HeavenlyBody("Mercury", 88);
        heavenlyBody.put(planet.getName(),planet);
        planets.add(planet);

        // Venus
        planet = new HeavenlyBody("Venus", 225);
        heavenlyBody.put(planet.getName(),planet);
        planets.add(planet);


        // Earth
        planet = new HeavenlyBody("Earth", 365);
        heavenlyBody.put(planet.getName(),planet);
        planets.add(planet);
        // moon in Earth
        HeavenlyBody satellite = new HeavenlyBody("Moon", 27);
        planet.addSattelite(satellite);
        heavenlyBody.put(satellite.getName(),satellite);

        //Mars
        planet = new HeavenlyBody("Mars", 687);
        heavenlyBody.put(planet.getName(),planet);
        planets.add(planet);
        //Moons of Mars
        satellite = new HeavenlyBody("Deimos", 1.3);
        planet.addSattelite(satellite);
        heavenlyBody.put(satellite.getName(),satellite);

        satellite = new HeavenlyBody("Phobos", 0.3);
        planet.addSattelite(satellite);
        heavenlyBody.put(satellite.getName(),satellite);

        // get all moons of Mars
        System.out.println("All moons of Mars");
        HeavenlyBody body = heavenlyBody.get("Mars");
        for (HeavenlyBody moon: body.getSatellites()){
            System.out.println("\t"+moon.getName());
        }

        System.out.println("\n"+ "All Planets");

        // All planets
        for (HeavenlyBody aPlanet: planets){
            System.out.println("\t"+aPlanet.getName());
        }


    }
}
