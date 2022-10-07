package it.brian.school.cli.oop.rettangolo;

import java.util.Scanner;

public class Main {
    /*
    * Metodo main
    */
    public static void main(String[] args) {
        /*
        * Utilizzo della classe scanner per la lettura di input da
        * tastiera
        *
        * Creazione di un oggetto della classe scanner utilizzando il
        * costruttore che prevede 1 parametro di tipo InputStream
        */
        Scanner scanner = new Scanner(System.in);

        /*
        * Dichiarazione di due variabili locali per memorizzare
        * l'input dell'utente
        */
        float base, height;

        /*
        * Stampa di una richiesta di input
        */
        System.out.print("Enter base: ");

        /*
        * Memorizzazione nella variabile 'base' del valore inserito
        * dall'utente utilizzando il metodo nextFloat della classe
        * Scanner
        */
        base = scanner.nextFloat();

        /*
         * Stampa di una richiesta di input
         */
        System.out.print("Enter height: ");

        /*
         * Memorizzazione nella variabile 'altezza' del valore
         * inserito dall'utente utilizzando il metodo nextFloat della
         * classe Scanner
         */
        height = scanner.nextFloat();

        /*
        * Creazione di un'istanza della classe Rettangolo utilizzando
        * il construttore con 0 parametri (inizializzazione con
        * valori standard)
        */
        Rettangolo rettangolo = new Rettangolo();

        /*
        * Inserimento dei dati ottenuti dall'utente all'interno degli
        * attributi dell'oggetto 'rettangolo' utilizzando i metodi
        * setter
        */
        rettangolo.setBase(base);
        rettangolo.setHeight(height);

        /*
         * Stampa di coordinate, area e perimetro dell'oggetto
         * 'rettangolo'
         *
         * NB: Il metodo 'getCoords' restituisce un oggetto di tipo
         * Coords. Per evitare di stampare una stringa contenente
         * informazioni indecifrabili dall'utente, all'interno della
         * classe Coords è stato sovrascritto il comportamento che
         * deve seguire la classe quando si prova a convertire un suo
         * oggetto in una stringa. All'interno della classe Coords
         * infatti troviamo un'override del metodo toString.
         *
         * Un'alternativa valida al metodo toString è quella di
         * utilizzare i metodi getter della classe Coords per ottenere
         * le due coordinate separatamente.
         *
         * Il codice sarebbe potuto essere quindi:
         *
         * float x = rettangolo.getCoords().getX();
         * float y = rettangolo.getCoords().getY();
         * System.out.printf("Coords: (%s;%s)%n", x, y);
         */
        System.out.println("Coords: " + rettangolo.getCoords());
        System.out.println("Area: " + rettangolo.getArea());
        System.out.println("Perimeter: " + rettangolo.getPerimeter());
    }
}
