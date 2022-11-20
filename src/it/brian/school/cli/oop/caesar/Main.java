package it.brian.school.cli.oop.caesar;

import it.brian.school.cli.ValidInputObtainer;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ValidInputObtainer validInputObtainer = new ValidInputObtainer(scanner);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("""
                CAESAR CIPHER
                [1] Encoder
                [2] Decoder
                [0] Quit""");
            choice = validInputObtainer.getIntegerInput(">> ");
            switch (choice) {
                case 1 -> {
                    int key = validInputObtainer.getIntegerInput("Enter encryption key: ");
                    System.out.print("Enter text to encrypt: ");
                    String text = scanner.nextLine();

                    Encryptor encryptor = new Encryptor();
                    String encryptedText = encryptor.encrypt(text, key);
                    System.out.println("Encrypted text: "+ encryptedText + "\n");
                }
                case 2 -> {
                    int key = validInputObtainer.getIntegerInput("Enter decryption key: ");
                    System.out.print("Enter text to decrypt: ");
                    String text = scanner.nextLine();

                    Encryptor encryptor = new Encryptor();
                    String decryptedText = encryptor.decrypt(text, key);
                    System.out.println("Decrypted text: "+ decryptedText + "\n");
                }
            }
        } while (choice != 0);



    }
}
