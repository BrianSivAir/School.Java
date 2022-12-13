package it.brian.school.cli.oop.garage;

import it.brian.school.cli.EasyInputObtainer;

import java.util.Scanner;
import java.util.UUID;

public class Vehicle {
    protected String id;
    private String brand;
    private int year;
    private int engineCapacity;

    public Vehicle(String brand, int year, int engineCapacity) {
        this.id = UUID.randomUUID().toString();
        this.brand = brand;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public Vehicle() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void init(Scanner scanner, EasyInputObtainer easyInputObtainer) {
        System.out.print("Brand               : ");
        brand = scanner.nextLine();
        year = easyInputObtainer.getIntegerInput("Year                : ");
        engineCapacity = easyInputObtainer.getIntegerInput("Engine capacity     : ");
    }

    @Override
    public String toString() {
        return "id = '%s', brand = '%s', year = %d, engine capacity = %d".formatted(id, brand, year, engineCapacity);
    }
}
