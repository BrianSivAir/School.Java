package it.brian.school.cli.oop.garage;

import it.brian.school.cli.ValidInputObtainer;

import java.util.Scanner;

public class Van extends Vehicle {
    private Integer capacity;

    public Van(String brand, int year, int engineCapacity, Integer capacity) {
        super(brand, year, engineCapacity);
        this.capacity = capacity;
    }

    public Van() {
        super();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public void init(Scanner scanner, ValidInputObtainer validInputObtainer) {
        super.init(scanner, validInputObtainer);
        capacity = validInputObtainer.getIntegerInput("Capacity            : ");
    }

    @Override
    public String toString() {
        return "id = '%s', brand = '%s', year = %d, engine capacity = %d, capacity = %d".formatted(id, getBrand(), getYear(), getEngineCapacity(), capacity);
    }
}
