package it.brian.school.cli;

import java.util.Scanner;

public class ValidInputObtainer {

    private final Scanner scanner;

    public ValidInputObtainer(Scanner scanner) {
        this.scanner = scanner;
    }

    public Integer getIntegerInput(String userQuery) {
        while (true) {
            System.out.print(userQuery);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Please enter an integer");
            scanner.next();
        }
    }

    public Integer getFloatInput(String userQuery) {
        while (true) {
            System.out.print(userQuery);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Please enter a float");
            scanner.next();
        }
    }

    public Integer getBooleanInput(String userQuery) {
        while (true) {
            System.out.print(userQuery);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Please enter a boolean");
            scanner.next();
        }
    }
}
