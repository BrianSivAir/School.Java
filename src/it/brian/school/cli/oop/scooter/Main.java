package it.brian.school.cli.oop.scooter;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Color, String> colorNameMap;

    public static void main(String[] args) {
        init();
        Scooter scooter = new Scooter(Color.GRAY, 40.5f, "Piaggio Liberty", false);
        dumpScooter(scooter);
        System.out.println();

        RegisteredScooter registeredScooter = new RegisteredScooter(Color.RED, 30f, "Aprilia Scarabeo", false, 60f, "CU1234");
        dumpRegisteredScooter(registeredScooter);

    }

    private static void init() {
        colorNameMap = new HashMap<>();
        colorNameMap.put(Color.WHITE, "White");
        colorNameMap.put(Color.LIGHT_GRAY, "Light gray");
        colorNameMap.put(Color.GRAY, "Gray");
        colorNameMap.put(Color.DARK_GRAY, "Dark gray");
        colorNameMap.put(Color.BLACK, "Black");
        colorNameMap.put(Color.RED, "Red");
        colorNameMap.put(Color.PINK, "Pink");
        colorNameMap.put(Color.ORANGE, "Orange");
        colorNameMap.put(Color.YELLOW, "Yellow");
        colorNameMap.put(Color.GREEN, "Green");
        colorNameMap.put(Color.MAGENTA, "Magenta");
        colorNameMap.put(Color.CYAN, "Cyan");
        colorNameMap.put(Color.BLUE, "Blue");
    }

    private static void dumpScooter(Scooter scooter) {
        System.out.println("""
                ------------------------------------
                              SCOOTER
                ------------------------------------"""
        );
        System.out.println("Color          : " + getColorName(scooter.color));
        System.out.println("Type           : " + scooter.type);
        System.out.print("Speed          : ");
        scooter.printSpeed();
        float acceleration = 50;
        System.out.println("Acceleration   : " + acceleration);
        scooter.accelerate(acceleration);
        System.out.print("Speed          : ");
        scooter.printSpeed();
        System.out.println("Anti theft     : " + scooter.antiTheft);
        System.out.println("Mounting anti theft...");
        scooter.mountAntiTheft();
        System.out.println("Anti theft     : " + scooter.antiTheft);
        System.out.print("Speed          : ");
        scooter.printSpeed();
        acceleration = 25;
        System.out.println("Acceleration   : " + acceleration);
        scooter.accelerate(acceleration);
        System.out.print("Speed          : ");
        scooter.printSpeed();
    }

    private static void dumpRegisteredScooter(RegisteredScooter registeredScooter) {
        System.out.println("""
                ------------------------------------
                         REGISTERED SCOOTER
                ------------------------------------""");
        System.out.println("Color          : " + getColorName(registeredScooter.color));
        System.out.println("Type           : " + registeredScooter.type);
        System.out.print("Speed          : ");
        registeredScooter.printSpeed();
        System.out.println("Maximum speed  : " + registeredScooter.maximumSpeed);
        System.out.println("License plate  : " + registeredScooter.licensePlate);
        float acceleration = 10;
        System.out.println("Acceleration   : " + acceleration);
        registeredScooter.accelerate(acceleration);
        System.out.print("Speed          : ");
        registeredScooter.printSpeed();
        acceleration = 100;
        System.out.println("Acceleration   : " + acceleration);
        registeredScooter.accelerate(acceleration);
        System.out.print("Speed          : ");
        registeredScooter.printSpeed();
        System.out.println("Anti theft     : " + registeredScooter.antiTheft);
        System.out.println("Mounting anti theft...");
        registeredScooter.mountAntiTheft();
        System.out.println("Anti theft     : " + registeredScooter.antiTheft);
        System.out.print("Speed          : ");
        registeredScooter.printSpeed();
        System.out.println("Acceleration   : " + acceleration);
        registeredScooter.accelerate(acceleration);
        System.out.print("Speed          : ");
        registeredScooter.printSpeed();
    }

    private static String getColorName(Color color) {
        return colorNameMap.getOrDefault(color, String.format("Red:%s Green:%s Blue:%s", color.getRed(), color.getGreen(), color.getBlue()));
    }
}
