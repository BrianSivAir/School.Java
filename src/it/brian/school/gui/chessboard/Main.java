package it.brian.school.gui.chessboard;

import com.formdev.flatlaf.FlatLightLaf;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int rows, columns;
        System.out.println("Enter number of rows:");
        rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of columns:");
        columns = Integer.parseInt(scanner.nextLine());

        FlatLightLaf.setup();
        new Form(rows, columns);
    }
}
