package it.brian.school.cli.oop.rettangolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float base, height;

        System.out.print("Enter base: ");
        base = scanner.nextFloat();
        System.out.print("Enter height: ");
        height = scanner.nextFloat();

        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setBase(base);
        rettangolo.setHeight(height);

        System.out.println("Coords: " + rettangolo.getCoords());
        System.out.println("Area: " + rettangolo.getArea());
        System.out.println("Perimeter: " + rettangolo.getPerimeter());
    }
}
