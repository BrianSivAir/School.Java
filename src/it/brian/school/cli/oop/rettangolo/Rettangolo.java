package it.brian.school.cli.oop.rettangolo;

public class Rettangolo {
    /*
    * Dichiarazione degli attributi principali della classe
    */
    private float base;
    private float height;
    private Coords coords;

    /*
    * Costruttore con 0 parametri per la creazione di un oggetto con
    * attributi con valori predefiniti
    */
    public Rettangolo() {
        base = 10;
        height = 5;

        /*
        * Creazione di un'istanza della classe Coords utilizzando il
        * costruttore con 2 parametri creato in quest'ultima
        */
        coords = new Coords(3, 4);
    }

    /*
    * Costruttore con 3 parametri per la creazione di un oggetto con
    * attributi passati come parametro
    */
    public Rettangolo(float base, float height, Coords coords) {
        this.base = base;
        this.height = height;
        this.coords = coords;
    }

    /*
    * Getters/Setters
    */
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    /*
     * Metodo che restituisce il perimetro del rettangolo utilizzando
     * gli attributi privati della classe
     */
    public float getPerimeter() {
        return (base * 2) + (height * 2);
    }

    /*
    * Metodo che restituisce l'area del rettangolo utilizzando gli
    * attributi privati della classe
    */
    public float getArea() {
        return base * height;
    }

    /*
     * Metodo che incrementa/decrementa la coordinata x del
     * rettangolo del valore contenuto all'interno del parametro x
     */
    public void translateX(float x) {
        coords.setX(coords.getX() + x);
    }

    /*
     * Metodo che incrementa/decrementa la coordinata y del
     * rettangolo del valore contenuto all'interno del parametro y
     *
     * In questo metodo e quello successivo vengono utilizzati i
     * metodi getters/setters per operare con i valori delle singole
     * coordinate
     */
    public void translateY(float y) {
        coords.setY(coords.getY() + y);
    }
}
