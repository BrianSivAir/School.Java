package it.brian.school.cli.oop.persona;

public class Persona {
    /*
     * Dichiarazione degli attributi principali della classe
     */
    private String name;
    private String surname;
    private String title;
    private String profession;

    /*
    * Costruttore con 4 parametri per l'inizializzazione degli
    * attributi con i valori forniti
    */
    public Persona(String name, String surname, String title, String profession) {
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.profession = profession;
    }

    /*
    * Costruttore con 2 parametri per l'inizializzazione degli
    * attributi con i valori forniti e con valori standard
    */
    public Persona(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.title = "";
        this.profession = "unemployed";
    }

    /*
    * Metodo setter per l'attributo 'title'
    */
    public void setTitle(String title) {
        this.title = title;
    }

    /*
    * Metodo setter per l'attributo 'profession'
    */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /*
    * Metodo che restituisce una stringa che contiene i valori dei
    * parametri dell'oggetto
    */
    public String getInfoPersona() {
        String str = String.format("%s %s, profession %s", name, surname, profession);
        if (!"".equals(title)) {
            str = title + " " + str;
        }
        return str;
    }

    /*
    * Modalità alternativa per la stampa di un oggetto con i suoi
    * attributi.
    */
    @Override
    public String toString() {
        return getInfoPersona();
    }
}
