package it.brian.school.cli.oop.garage;

import it.brian.school.cli.EasyInputObtainer;

import java.util.Scanner;

public class Car extends Vehicle {
    private Integer doors;
    private String fuel;

    public Car(String brand, int year, int engineCapacity, Integer doors, String fuel) {
        super(brand, year, engineCapacity);
        this.doors = doors;
        this.fuel = fuel;
    }

    public Car() {
        super();
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void init(Scanner scanner, EasyInputObtainer easyInputObtainer) {
        super.init(scanner, easyInputObtainer);
        doors = easyInputObtainer.getIntegerInput("Doors               : ");
        System.out.print("Fuel                : ");
        fuel = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "id = '%s', brand = '%s', year = %d, engine capacity = %d, doors = %d, fuel = %s".formatted(id, getBrand(), getYear(), getEngineCapacity(), doors, fuel);
    }

}
