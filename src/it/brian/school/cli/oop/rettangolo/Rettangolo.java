package it.brian.school.cli.oop.rettangolo;

public class Rettangolo {
    private float base;
    private float height;
    private Coords coords;

    public Rettangolo() {
        super();
        base = 10;
        height = 5;
        coords = new Coords(3, 4);
    }

    public Rettangolo(float base, float height, Coords coords) {
        super();
        this.base = base;
        this.height = height;
        this.coords = coords;
    }

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

    public float getPerimeter() {
        return (base * 2) + (height * 2);
    }

    public float getArea() {
        return base * height;
    }

    public void translateX(float x) {
        coords.setX(coords.getX() + x);
    }

    public void translateY(float y) {
        coords.setY(coords.getY() + y);
    }
}
