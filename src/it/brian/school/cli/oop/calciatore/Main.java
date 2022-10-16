package it.brian.school.cli.oop.calciatore;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calciatore[] calciatori = new Calciatore[3];

        for (int i = 0; i < calciatori.length; i++) {
            System.out.printf("CALCIATORE %d:%n", i + 1);
            calciatori[i] = inputCalciatore();
        }

        Arrays.stream(calciatori).forEach(System.out::println);
    }

    private static Calciatore inputCalciatore() {
        Calciatore calciatore = new Calciatore();
        System.out.print("Enter name: ");
        calciatore.setName(scanner.next());
        System.out.print("Enter surname: ");
        calciatore.setSurname(scanner.next());
        System.out.print("Enter role: ");
        calciatore.setRole(scanner.next());
        return calciatore;
    }

}
