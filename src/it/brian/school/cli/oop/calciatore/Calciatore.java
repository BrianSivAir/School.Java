package it.brian.school.cli.oop.calciatore;

public class Calciatore {
    private String name;
    private String surname;
    private String role;
    private Integer age;
    private Float speed;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public float dribbleAbility() {
        return (float) ((age * speed) / 0.86);
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", role = '" + role + '\'' +
                ", age = " + age +
                ", speed = " + speed +
                ", dribble ability = " + dribbleAbility();
    }
}
