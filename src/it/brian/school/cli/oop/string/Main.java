package it.brian.school.cli.oop.string;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhraseMangager phraseMangager = new PhraseMangager();
        while (true) {
            System.out.print("Enter phrase: ");
            phraseMangager.analyze(scanner.nextLine());
            System.out.println("Vowels Freq: " + phraseMangager.getVowelsFreq());
            System.out.println("Blank Spaces Freq: " + phraseMangager.getBlankSpacesFreq());
            System.out.println();
        }
    }
}
