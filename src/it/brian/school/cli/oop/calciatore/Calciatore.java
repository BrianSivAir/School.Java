package it.brian.school.cli.oop.calciatore;

public class Calciatore {
    private String name;
    private String surname;
    private String role;

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

    public void dribbleAbility(int a, int b) {
        System.out.println((a * b) / 0.86);
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", role = '" + role + '\'';
    }
}
