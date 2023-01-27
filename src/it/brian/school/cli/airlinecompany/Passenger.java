package it.brian.school.cli.airlinecompany;

import java.util.Locale;

public class Passenger {
    private String name;
    private String surname;
    private Integer age;
    private Locale nationality;

    public Passenger(String name, String surname, Integer age, Locale nationality) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Locale getNationality() {
        return nationality;
    }

    public void setNationality(Locale nationality) {
        this.nationality = nationality;
    }
}
