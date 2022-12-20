package it.brian.school.cli.palindroma;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final  Stack<String> stringStack = new Stack<>();

    public static void main(String[] args) {

        String parola = "";
        String charObj;

        System.out.println("Inserire una parola (1 carattere per ogni riga)\n");

        while (true) {
            System.out.println("Inserire un carattere: ");
            String s = scanner.nextLine();
            if ("end".equalsIgnoreCase(s)) {
                break;
            }
            stringStack.add(s);
        }

        System.out.println("\nElementi nella pila: " + stringStack.size());

        if (checkPalindroma()) {
            System.out.println("La parola è palindroma");
        } else {
            System.out.println("La parola non è palindroma");
        }

        for (String s : stringStack.getElementi()) {
            parola = parola.concat(s);
        }

        System.out.println("Parola: " + parola);
    }


    private static boolean checkPalindroma() {
        boolean palindroma = true;
        Vector<String> elementi = stringStack.getElementi();
        int size = elementi.size() - 1;
        for (int i = size; i > 0; i--) {
            if (i == size - i) {
                break;
            }
            if (!elementi.get(i).equals(elementi.get(size - i))) {
                palindroma = false;
                break;
            }
        }
        return palindroma;
    }
}
