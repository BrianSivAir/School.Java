package it.brian.school.cli.oop.garage;

import it.brian.school.cli.EasyInputObtainer;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
    private Integer engineStrokes;

    public Motorcycle(String brand, int year, int engineCapacity, Integer engineStrokes) {
        super(brand, year, engineCapacity);
        this.engineStrokes = engineStrokes;
    }

    public Motorcycle() {
        super();
    }

    public Integer getEngineStrokes() {
        return engineStrokes;
    }

    public void setEngineStrokes(Integer engineStrokes) {
        this.engineStrokes = engineStrokes;
    }

    @Override
    public void init(Scanner scanner, EasyInputObtainer easyInputObtainer) {
        super.init(scanner, easyInputObtainer);
        engineStrokes = easyInputObtainer.getIntegerInput("Engine Strokes      : ");
    }

    @Override
    public String toString() {
        return "id = '%s', brand = '%s', year = %d, engine capacity = %d, engine strokes = %d".formatted(id, getBrand(), getYear(), getEngineCapacity(), engineStrokes);
    }
}
