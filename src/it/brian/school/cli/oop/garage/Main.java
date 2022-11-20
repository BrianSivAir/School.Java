package it.brian.school.cli.oop.garage;

import it.brian.school.cli.ValidInputObtainer;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final int MAXIMUM_VEHICLE_CAPACYTY = 15;
    private static Vehicle[] vehicles = new Vehicle[MAXIMUM_VEHICLE_CAPACYTY];
    private static final Scanner scanner = new Scanner(System.in);
    private static final ValidInputObtainer validInputObtainer = new ValidInputObtainer(scanner);
    private static int lastObjectIndex = -1;
    public static final Map<Integer, Class<? extends Vehicle>> choiceClassMap = new HashMap<>();

    private static void init() {
        choiceClassMap.put(1, Motorcycle.class);
        choiceClassMap.put(2, Car.class);
        choiceClassMap.put(3, Van.class);
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        init();

        int choice;

        do {
            choice = getChoice();
            System.out.println();

            if (0 < choice && choice < 4) {
                lastObjectIndex++;
                vehicles[lastObjectIndex] = choiceClassMap.get(choice).getDeclaredConstructor().newInstance();
                vehicles[lastObjectIndex].init(scanner, validInputObtainer);
            }

            listVehicles();

        } while (choice != 0 && lastObjectIndex < 14);

        System.out.println("\nTotal vehicles: " + lastObjectIndex + 1);
    }

    private static int getChoice() {
        System.out.print("""
                                
                +----+----------------------+
                | ID |       Vehicle        |
                +----+----------------------+
                |  1 | Motorcycle           |
                |  2 | Car                  |
                |  3 | Van                  |
                |  0 | Exit                 |
                +----+----------------------+
                """);
        return validInputObtainer.getIntegerInput("Choice >> ");
    }

    private static void listVehicles() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                System.out.printf("[%d] %s%n", i, vehicles[i]);
            }
        }
    }

}
