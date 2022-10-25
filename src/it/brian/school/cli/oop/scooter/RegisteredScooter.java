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

    @Override
    public void accelerate(float x) {
        float s = x + speed;
        speed = Math.min(s, maximumSpeed);
    }
}
