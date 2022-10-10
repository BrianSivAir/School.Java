package it.brian.school.cli.oop.persona;

public class Main {
    public static void main(String[] args) {
        /*
        * Creazione dell'oggetto 'persona1' utilizzando il secondo
        * costruttore
        */
        Persona persona1 = new Persona("Marco", "Bianchi");

        /*
        * Creazione dell'oggetto 'persona2' utilizzando il primo
        * costruttore
        */
        Persona persona2 = new Persona("Renato", "Caputo", "Sig.", "barbiere");

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
        * Inserimento di nuovi valori all'interno degli attributi
        * dell'oggetto persona1 utilizzando i metodi setter
        */
        persona1.setTitle("Ing.");
        persona1.setProfession("analista programmatore");

        /*
        * Stampa della stringa restituita da una nuova invocazione
        * del metodo getInfoPersona dell'oggetto 'persona1'
        */
        System.out.println(persona1.getInfoPersona());
    }
}
