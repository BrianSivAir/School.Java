package it.brian.school.cli.oop.rettangolo;

public class Coords {
    /*
     * Dichiarazione degli attributi principali della classe
     */
    private float x;
    private float y;

    /*
    * Costruttore con 2 parametri per la creazione di un oggetto con
    * attributi passati come parametro
    */
    public Coords(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }

    /*
     * Getters/Setters
     */
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    /*
    * Override di un metodo della classe Object per convertire un
    * oggetto in una stringa di testo in un modo specifico
    */
    @Override
    public String toString() {
        return String.format("(%s, %s)", x, y);
    }
}
