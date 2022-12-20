package it.brian.school.cli.palindroma;

import java.util.Vector;

//TODO: Translate
public class Stack<T> {
    private Vector<T> elementi;

    public Stack() {
        elementi = new Vector<>();
    }

    public boolean add(T elemento) {
        return elementi.add(elemento);
    }

    public T pop() {
        T elemento = null;
        if (elementi.size() > 0) {
            elemento = elementi.get(elementi.size() - 1);
            elementi.remove(elementi.size() - 1);
        }
        return elemento;
    }

    public T top() {
        T elemento = null;
        if (elementi.size() > 0) {
            elemento = elementi.get(elementi.size() - 1);
        }
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
