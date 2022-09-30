package it.brian.school.cli.translated.ricercamultiplo;

import java.util.Scanner;

public class Main {

    private static final int N = 5;

    public static void main(String[] args) {
        int[] a = new int[N];
        int value;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ARRAY");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + i + "] Enter element: ");
            a[i] = scanner.nextInt();
        }

        System.out.print("\nEnter a number or its multiple: ");
        value = scanner.nextInt();

        for(int i = 0; i < N; i++) {
            if ((a[i] % value) ==0) {
                System.out.printf("Found multiple of %d (at index %d) : %d%n", value, i, a[i]);
            }
        }
    }
}
