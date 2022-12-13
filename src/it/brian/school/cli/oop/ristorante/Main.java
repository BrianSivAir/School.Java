package it.brian.school.cli.oop.ristorante;

import it.brian.school.cli.EasyInputObtainer;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EasyInputObtainer EASY_INPUT_OBTAINER = new EasyInputObtainer(scanner);

    private static Coda<Ordine> ordini = new Coda<>();

    //no modifica e elimina
    public static void main(String[] args) {
        Integer choice = null;
        do {
            choice = getChoice();
            switch (choice) {
                case 1 -> {
                    System.out.println("Tavolo: ");
                    String tavolo = scanner.nextLine();
                    System.out.println("Ordine: ");
                    String ordinazione = scanner.nextLine();
                    Ordine ordine = new Ordine(tavolo, ordinazione);

                    Vector<Ordine> elementi = ordini.getElementi();

                    boolean found = false;

                    for (int i = 0; i < elementi.size(); i++) {
                        if (elementi.get(i).getTavolo().equals(tavolo)) {
                            found = true;
                            System.out.println("Tavolo occupato");
                            break;
                        }
                    }

                    if (!found) {
                        ordini.add(ordine);
                    }

                }
                case 2 -> {
                    if (ordini.soddisfa() == null) {
                        System.out.println("Non ci sono ordini");
                    }
                }
                case 5 -> ordini.getElementi().forEach(Ordine::dump);
            }
        } while (choice != 6);
    }

    private static int getChoice() {
        System.out.print("""
                
                +----+----------------------+
                | ID |       Feature        |
                +----+----------------------+
                |  1 | Aggiungi             |
                |  2 | Soddisfa             |
                |  3 | Modifica             |
                |  4 | Elimina              |
                |  5 | Stampa ordini        |
                |  6 | Esci                 |
                +----+----------------------+
                """);
        return EASY_INPUT_OBTAINER.getIntegerInput("Option >> ");
    }
}
