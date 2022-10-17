package it.brian.school.cli.oop.library;

import it.brian.school.cli.ValidInputObtainer;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ValidInputObtainer validInputObtainer = new ValidInputObtainer(scanner);
    private static Book[] books = new Book[100];

    private static int lastObjectIndex = -1;

    public static void main(String[] args) {
        inputBooks(validInputObtainer.getIntegerInput("Enter number of books to start with: "));

        int choice;
        do {
            choice = getChoice();
            System.out.println();
            switch (choice) {
                case 1 -> inputBooks(1);
                case 2 -> dumpAll();
                case 3 -> removeBook();
                case 4 -> registerLoan();
                case 5 -> registerRestitution();
            }

        } while (choice != 6);
    }

    private static int getChoice() {
        System.out.print("""
                
                +----+----------------------+
                | ID |       Feature        |
                +----+----------------------+
                |  1 | Add book             |
                |  2 | Display all          |
                |  3 | Delete book          |
                |  4 | Register loan        |
                |  5 | Register restitution |
                |  6 | Exit                 |
                +----+----------------------+
                """);
        return validInputObtainer.getIntegerInput("Option >> ");
    }

    private static void inputBooks(int quantity) {
        while (quantity > 0) {
            lastObjectIndex++;
            books[lastObjectIndex] = new Book();
            books[lastObjectIndex].init(scanner);
            quantity--;
        }
    }

    private static void dumpAll() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.printf("[INDEX: %d]%n", i);
                books[i].dump();
            }
        }
    }
    private static void removeBook() {
        int index = validInputObtainer.getIntegerInput("Enter index of book to delete: ");
        books[index] = null;
    }

    private static void registerLoan() {
        System.out.print("Enter title: ");
        String title = scanner.next();
        Arrays.stream(books).filter(Objects::nonNull).forEach(book -> book.loan(title));
    }

    private static void registerRestitution() {
        System.out.print("Enter title: ");
        String title = scanner.next();
        Arrays.stream(books).filter(Objects::nonNull).forEach(book -> book.restitution(title));
    }

}
