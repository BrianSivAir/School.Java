package it.brian.school.cli.oop.ristorante;

import java.util.Vector;

//TODO: Translate
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
            elemento = elementi.get(0);
            elementi.remove(0);
        }
        return elemento;
    }

    public boolean remove(int index) {
        try {
            elementi.remove(index);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean edit(int index, T element) {
        try {
            elementi.setElementAt(element, index);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
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
