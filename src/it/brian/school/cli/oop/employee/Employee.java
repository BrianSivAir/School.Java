package it.brian.school.cli.oop.employee;

public class Employee {
    private String serial;
    private Float salary;
    private Float overtime;

    public Employee(String serial, Float salary, Float overtime) {
        this.serial = serial;
        this.salary = salary;
        this.overtime = overtime;
    }

    public Float getSalary() {
        return salary;
    }

    public Float getActualSalary(Float overtimeHours) {
        return salary + (overtimeHours * overtime);
    }

    public void dump() {
        System.out.printf("""
                Serial              : %s
                Salary              : %s
                Overtime            : %s
                """, serial, salary, overtime
        );
    }
}
