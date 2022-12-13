package it.brian.school.cli.oop.library;

import it.brian.school.cli.EasyInputObtainer;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EasyInputObtainer EASY_INPUT_OBTAINER = new EasyInputObtainer(scanner);
    private static Book[] books = new Book[5];

    private static int lastObjectIndex = -1;

    public static void main(String[] args) {
        inputBooks(EASY_INPUT_OBTAINER.getIntegerInput("Enter number of books to start with: "));

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
        return EASY_INPUT_OBTAINER.getIntegerInput("Option >> ");
    }

    private static void inputBooks(int quantity) {
        quantity = Math.max(quantity, 0);
        quantity = Math.min(quantity, books.length);
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
        int index;
        while (true) {
            index = EASY_INPUT_OBTAINER.getIntegerInput("Enter index of book to delete: ");
            if (0 <= index && index < books.length) {
                break;
            }
            System.out.printf("Index out of bounds! Must be in range: %d -> %d%n", 0, books.length - 1);
        }
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
