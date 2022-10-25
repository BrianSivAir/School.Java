package it.brian.school.cli.oop.scooter;

import java.awt.*;

public class Scooter {
    protected Color color;
    public float speed;
    protected String type;
    protected boolean antiTheft;

    public Scooter(Color color, float speed, String type, boolean antiTheft) {
        this.color = color;
        this.speed = speed;
        this.type = type;
        this.antiTheft = antiTheft;
    }

    public Scooter() {
    }

    public float getSpeed() {
        return speed;
    }

    public void accelerate(float x) {
        if (!antiTheft) {
            speed += x;
        }
    }

    public void mountAntiTheft() {
        antiTheft = true;
    }

    public void dismountAntiTheft() {
        antiTheft = false;
    }
}
