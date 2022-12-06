package it.brian.school.cli.oop.garagevector;

import java.util.Vector;

public class Garage {
    private Vector<String> vehicles;

    public Garage() {
        vehicles = new Vector(1,1);
    }

    public void park(String plate) {
        if (!doesVehicleExist(plate)) {
            vehicles.add(plate);
        } else {
            System.out.println("Vehicle is already parked");
        }
    }

    public void remove(String plate) {
        if (doesVehicleExist(plate)) {
            vehicles.remove(plate);
        } else {
            System.out.println("Vehicle is not present");
        }
    }

    private boolean doesVehicleExist(String plate) {
        if (vehicles.contains(plate)) {
            return true;
        }
        return false;
    }

    public int getNumVehicles() {
        return vehicles.size();
    }

}
