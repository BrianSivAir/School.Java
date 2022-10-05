package it.brian.school.cli.oop.rettangolo;

import java.math.BigDecimal;

public class Coords {
    private float x;
    private float y;

    public Coords(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }

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

    @Override
    public String toString() {
        return String.format("(%s, %s)", x, y);
    }
}
