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
        this.color = null;
        this.speed = 0;
        this.type = "undefinded";
        this.antiTheft = false;
    }

    public void printSpeed() {
        System.out.println(speed);
    }

    public void accelerate(float x) {
        if (antiTheft) {
            System.out.println("Unable to accelerate: anti theft is mounted");
        } else {
            speed = x+=;
        }
    }

    public void mountAntiTheft() {
        antiTheft = true;
    }

    public void dismountAntiTheft() {
        antiTheft = false;
    }
}
