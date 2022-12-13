package it.brian.school.cli.oop.ristorante;

import java.util.Vector;

public class Coda<T> {
    private Vector<T> elementi;

    public Coda() {
        elementi = new Vector<>();
    }

    public boolean add(T elemento) {
        return elementi.add(elemento);
    }

    public T soddisfa() {
        T elemento = null;
        if (elementi.size() > 0) {
            elemento = elementi.get(elementi.size() - 1);
        }
        elementi.remove(elementi.size() - 1);

        return elemento;
    }

    public boolean vuota() {
        return elementi.size() == 0;
    }

    public int size() {
        return elementi.size();
    }

    public Vector<T> getElementi() {
        return elementi;
    }
}
