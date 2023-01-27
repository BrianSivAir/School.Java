package it.brian.school.cli.airlinecompany;

public class Aircraft {
    private String manufacturer;
    private int seats;

    public Aircraft(String manufacturer, int seats) {
        this.manufacturer = manufacturer;
        this.seats = seats;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
