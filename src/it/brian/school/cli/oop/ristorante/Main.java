package it.brian.school.cli.oop.ristorante;

import it.brian.school.cli.EasyInputObtainer;

import java.util.Scanner;
import java.util.Vector;
//TODO: Translate
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
                    Ordine ordine = inputOrdine();

                    Vector<Ordine> elementi = ordini.getElementi();

                    boolean found = false;

                    for (Ordine o : elementi) {
                        if (o.getTavolo().equals(ordine.getTavolo())) {
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
                case 3 -> {
                    Integer index = EASY_INPUT_OBTAINER.getIntegerInput("Inserire l'indice dell'ordine: ");
                    System.out.println("Inserire il nuovo ordine");
                    Ordine ordine = inputOrdine();
                    if (ordini.edit(index, ordine)) {
                        System.out.println("Ordine modificato");
                    } else {
                        System.out.println("Errore");
                    }
                }
                case 4 -> {
                    Integer index = EASY_INPUT_OBTAINER.getIntegerInput("Inserire l'indice dell'ordine: ");
                    if (ordini.remove(index)) {
                        System.out.println("Ordine rimosso");
                    } else {
                        System.out.println("Errore");
                    }
                }
                case 5 -> {
                    Vector<Ordine> elementi = ordini.getElementi();
                    System.out.println();
                    for (int i = 0; i < elementi.size(); i++) {
                        System.out.printf("Ordine %d%n", i);
                        elementi.get(i).dump();
                    }
                }
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

    private static Ordine inputOrdine() {
        System.out.println("Tavolo: ");
        String tavolo = scanner.nextLine();
        System.out.println("Ordine: ");
        String ordinazione = scanner.nextLine();
        return new Ordine(tavolo, ordinazione);
    }
}
