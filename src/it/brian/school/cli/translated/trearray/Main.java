package it.brian.school.cli.translated.trearray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int N = 5;

    public static void main(String[] args) {
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];

        Scanner scanner = new Scanner(System.in);

        System.out.println("FIRST ARRAY");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + i + "] Enter element: ");
            a[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("SECOND ARRAY");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + i + "] Enter element: ");
            b[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            c[i] = Math.max(a[i], b[i]);
        }
        System.out.println("Maximum values: " + Arrays.toString(c));

    }
}
