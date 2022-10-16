package it.brian.school.cli.oop.persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        * Blocco di codice per l'inserimento di dati da tastiera
        * mantenendo la creazione degli oggetti con i costruttori
        */
        System.out.print("Enter persona1 name: ");
        String persona1Nome = scanner.next();
        System.out.print("Enter persona1 surname: ");
        String persona1Surname = scanner.next();
        System.out.print("\nEnter persona2 name: ");
        String persona2Name = scanner.next();
        System.out.print("Enter persona2 surname: ");
        String persona2Surname = scanner.next();
        System.out.print("Enter persona2 title: ");
        String persona2Title = scanner.next();
        System.out.print("Enter persona2 profession: ");
        String persona2Profession = scanner.next();
        System.out.println();

        /*
        * Creazione dell'oggetto 'persona1' utilizzando il secondo
        * costruttore
        */
        Persona persona1 = new Persona(persona1Nome, persona1Surname);

        /*
        * Creazione dell'oggetto 'persona2' utilizzando il primo
        * costruttore
        */
        Persona persona2 = new Persona(persona2Name, persona2Surname, persona2Title, persona2Profession);

        /*
        * Stampa della stringa restituita dal metodo getInfoPersona
        * dell'oggetto 'persona1'
        *
        * Expected: "Marco Bianchi, profession unemployed"
        *
        * NB: Un modo alternativo per stampare un oggetto con i suoi
        * attributi è quello di utilizzare il metodo toString:
        *
        * System.out.println(persona1);
        */
        System.out.println(persona1.getInfoPersona());

        /*
        * Stampa della stringa restituita dal metodo getInfoPersona
        * dell'oggetto 'persona2'
        *
        * Expected: "Sig. Renato Caputo, profession barbiere"
        */
        System.out.println(persona2.getInfoPersona());

        /*
        * Blocco per inserimento valori
        */
        System.out.print("\nEnter persona1 title: ");
        String persona1Title = scanner.next();
        System.out.print("Enter persona2 profession: ");
        String persona1Profession = scanner.next();
        System.out.println();

        /*
        * Inserimento di nuovi valori all'interno degli attributi
        * dell'oggetto persona1 utilizzando i metodi setter
        */
        persona1.setTitle(persona1Title);
        persona1.setProfession(persona1Profession);

        /*
        * Stampa della stringa restituita da una nuova invocazione
        * del metodo getInfoPersona dell'oggetto 'persona1'
        */
        System.out.println(persona1.getInfoPersona());
    }
}
