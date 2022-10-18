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
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ignored) {}
            System.out.println("Please enter an integer");
        }
    }

    public Float getFloatInput(String userQuery) {
        while (true) {
            System.out.print(userQuery);
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException ignored) {}
            System.out.println("Please enter a float");
        }
    }

}
