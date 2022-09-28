package it.brian.school.cli.minmax;

import java.util.Collections;
import java.util.List;

public class Calculator {
    public enum Operation {
        MIN,
        MAX
    }

    public int findNumber(Operation operation, List<Integer> numbers) {
        if (operation == Operation.MIN) {
            return Collections.min(numbers);
        }
        if (operation == Operation.MAX) {
            return Collections.max(numbers);
        }
        return 0;
    }
}
