package it.brian.school.cli.oop.scooter;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Scooter scooter = new Scooter(Color.GRAY, 40.5f, "Piaggio Liberty", false);

        String scooterDump = """
                ------------------------------------
                              SCOOTER
                ------------------------------------
                Color          : $color
                Type           : $type
                Speed          : $speed1
                Accelerating...
                Speed          : $speed2
                Anti theft     : $antitheft1
                Mounting anti theft...
                Anti theft     : $antitheft2
                """;
        scooterDump = scooterDump.replace("$color", scooter.color.toString());
        scooterDump = scooterDump.replace("$type", scooter.type);
        scooterDump = scooterDump.replace("$speed1", Float.toString(scooter.getSpeed()));
        scooter.accelerate(10);
        scooterDump = scooterDump.replace("$speed2", Float.toString(scooter.getSpeed()));
        scooterDump = scooterDump.replace("$antitheft1", Boolean.toString(scooter.antiTheft));
        scooter.mountAntiTheft();
        scooterDump = scooterDump.replace("$antitheft2", Boolean.toString(scooter.antiTheft));

        System.out.print(scooterDump);



        String registeredScooterDump = """
                ------------------------------------
                              SCOOTER
                ------------------------------------
                Color          : $color
                Type           : $type
                Speed          : $speed1
                Accelerating...
                Speed          : $speed2
                Anti theft     : $antitheft1
                Mounting anti theft...
                Anti theft     : $antitheft2
                """;
        registeredScooterDump = registeredScooterDump.replace("$color", scooter.color.toString());
        registeredScooterDump = registeredScooterDump.replace("$type", scooter.type);
        registeredScooterDump = registeredScooterDump.replace("$speed1", Float.toString(scooter.getSpeed()));
        scooter.accelerate(10);
        registeredScooterDump = registeredScooterDump.replace("$speed2", Float.toString(scooter.getSpeed()));
        registeredScooterDump = registeredScooterDump.replace("$antitheft1", Boolean.toString(scooter.antiTheft));
        scooter.mountAntiTheft();
        registeredScooterDump = registeredScooterDump.replace("$antitheft2", Boolean.toString(scooter.antiTheft));

        System.out.print(registeredScooterDump);
    }
}
