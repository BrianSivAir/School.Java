package it.brian.school.cli.oop.library;

import it.brian.school.cli.ValidInputObtainer;

import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private Integer numberOfCopies;

    public void init(Scanner scanner) {
        ValidInputObtainer validInputObtainer = new ValidInputObtainer(scanner);

        System.out.print("Enter author: ");
        author = scanner.nextLine();
        System.out.print("Enter title: ");
        title = scanner.nextLine();

        numberOfCopies = validInputObtainer.getIntegerInput("Enter number of copies: ");
    }

    public void loan(String title) {
        if(this.title.equalsIgnoreCase(title)) {
            numberOfCopies--;
            System.out.printf("Updated number of copies of the book %s, %s: %d%n", author, title, numberOfCopies);
        }
    }

    public void restitution(String title) {
        if(this.title.equalsIgnoreCase(title)) {
            numberOfCopies++;
            System.out.println("Number of copies: " + numberOfCopies);
        }
    }

    public void dump() {
        System.out.println("----------------------------------");
        System.out.println("Author:             " + author);
        System.out.println("Title:              " + title);
        System.out.println("Number of copies:   " + numberOfCopies);
        System.out.println("----------------------------------");
    }
}
