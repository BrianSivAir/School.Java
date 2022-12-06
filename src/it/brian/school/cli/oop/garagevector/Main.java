package it.brian.school.cli.oop.garagevector;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.park("IT092U2S");
        System.out.println("Num vehicles:" + garage.getNumVehicles());
        garage.park("IT33K0Z2");
        System.out.println("Num vehicles:" + garage.getNumVehicles());
        garage.park("IT239FG2");
        System.out.println("Num vehicles:" + garage.getNumVehicles());
        garage.park("IT092U2S");
        System.out.println("Num vehicles:" + garage.getNumVehicles());

        garage.remove("IT092U2S");
        System.out.println("Num vehicles:" + garage.getNumVehicles());
        garage.remove("IT239FG2");
        System.out.println("Num vehicles:" + garage.getNumVehicles());
        garage.remove("IT239FG2");
        System.out.println("Num vehicles:" + garage.getNumVehicles());
    }
}
