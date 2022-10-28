package it.brian.school.cli.oop.scooter;

import java.awt.*;

public class RegisteredScooter extends Scooter {

    protected float maximumSpeed;
    protected String licensePlate;

    public RegisteredScooter(Color color, float speed, String type, boolean antiTheft, float maximumSpeed, String licensePlate) {
        super(color, speed, type, antiTheft);
        this.maximumSpeed = maximumSpeed;
        this.licensePlate = licensePlate;
    }

    public void printMax() {
        System.out.println(maximumSpeed);
    }

    @Override
    public void accelerate(float x) {
        super.accelerate(x < maximumSpeed ? x : maximumSpeed - speed);
    }
}
