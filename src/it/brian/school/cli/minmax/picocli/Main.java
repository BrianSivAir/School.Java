package it.brian.school.cli.minmax.picocli;

import it.brian.school.cli.minmax.Calculator;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.List;

@Command(name = "MinMax", version = "SNAPSHOT 1.0", mixinStandardHelpOptions = true, description = "Given one or more integer numbers, the command will return the maximum or the minimum number.")
public class Main implements Runnable {
    @Option(names = {"-op", "--operation"}, description = "Operation. Allowed: [MIN,MAX]", required = true)
    Calculator.Operation operation;

    @Parameters(paramLabel = "<number>", index = "0", arity = "1..*",  description = "Integer number")
    List<Integer> numbers;

    @Override
    public void run() {
        Calculator calculator = new Calculator();
        if (operation == Calculator.Operation.MIN) {
            System.out.print("Minimum number is: ");
        } else if (operation == Calculator.Operation.MAX) {
            System.out.print("Maximum number is: ");
        }
        System.out.println(calculator.findNumber(operation, numbers));
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}
