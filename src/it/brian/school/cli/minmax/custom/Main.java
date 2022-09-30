package it.brian.school.cli.minmax.custom;

import java.util.*;
import java.util.stream.Collectors;

import it.brian.school.cli.minmax.Calculator;
import it.brian.school.cli.minmax.Calculator.Operation;

public class Main {

    public static void main(String[] args) {
        checkArgs(args);

        Calculator calculator = new Calculator();

        List<Integer> numbers = Arrays.stream(args)
                .skip(1)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        Calculator.Operation op = null;
        switch (args[0].toLowerCase()) {
            case "min":
                op = Operation.MIN;
                break;
            case "max":
                op = Operation.MAX;
                break;
        }

        if (op == Calculator.Operation.MIN) {
            System.out.print("Minimum number is: ");
        } else if (op == Calculator.Operation.MAX) {
            System.out.print("Maximum number is: ");
        }

        System.out.println(calculator.findNumber(op, numbers));
    }

    private static void checkArgs(String[] args) {
        if (args.length <= 1) {
            syntaxViolation();
        }
        if (!(args[0].equalsIgnoreCase("min") || args[0].equalsIgnoreCase("max"))) {
            syntaxViolation();
        }
        Arrays.stream(args).skip(1).forEach(s -> {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Invalid token: " + s);
                syntaxViolation();
            }
        });

        System.out.println("SUCCESS!");
    }

    private static void syntaxViolation() {
        System.out.println("Invalid args");
        System.out.println("Syntax: <type:[min/max]> <numbers:int..>");
        System.exit(1);
    }
}
