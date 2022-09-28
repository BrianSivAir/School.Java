package it.brian.school.cli.minmax.simple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.stream(args)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println("Minimum number: " + Collections.min(numbers));
        System.out.println("Maximum number: " + Collections.max(numbers));
    }
}
