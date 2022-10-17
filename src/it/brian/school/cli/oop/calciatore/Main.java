package it.brian.school.cli.oop.calciatore;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calciatore[] calciatori = new Calciatore[3];

        for (int i = 0; i < calciatori.length; i++) {
            System.out.printf("CALCIATORE %d:%n", i + 1);
            calciatori[i] = inputCalciatore();
            System.out.println();
        }

        System.out.println("OUTPUT");
        for (int i = 0; i < calciatori.length; i++) {
            System.out.printf("\nCALCIATORE %d:%n", i + 1);
            System.out.println(calciatori[i].toString());
        }
    }

    private static Calciatore inputCalciatore() {
        Calciatore calciatore = new Calciatore();
        System.out.print("Enter name: ");
        calciatore.setName(scanner.next());
        System.out.print("Enter surname: ");
        calciatore.setSurname(scanner.next());
        System.out.print("Enter role: ");
        calciatore.setRole(scanner.next());
        System.out.print("Enter age: ");
        calciatore.setAge(scanner.nextInt());
        System.out.print("Enter role: ");
        calciatore.setSpeed(scanner.nextFloat());
        return calciatore;
    }

}
