package it.brian.school.cli.minmax.custom;

import java.util.*;
import java.util.regex.Pattern;

import it.brian.school.cli.minmax.Calculator;
import it.brian.school.cli.minmax.Calculator.Operation;

public class Main {

    public static void main(String[] args) {
        checkArgs(args);

        Calculator calculator = new Calculator();

        Calculator.Operation op = null;
        List<Integer> numbers = new ArrayList<>();

        switch (args[0].toLowerCase()) {
            case "min":
                op = Operation.MIN;
                break;
            case "max":
                op = Operation.MAX;
                break;
        }

        for (String arg : args) {
            if (!args[0].equals(arg)) {
                numbers.add(Integer.valueOf(arg));
            }
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
        for (String arg : args) {
            if (args[0].equals(arg)) {
                if (!(args[0].equalsIgnoreCase("min") || args[0].equalsIgnoreCase("max"))) {
                    syntaxViolation();
                }
            } else if (!Pattern.matches("\\d+", arg)) {
                syntaxViolation();
            }
        }

    }

    private static void syntaxViolation() {
        System.out.println("Invalid args");
        System.out.println("Syntax: <type:[min/max]> <numbers:int..>");
        System.exit(-1);
    }
}
