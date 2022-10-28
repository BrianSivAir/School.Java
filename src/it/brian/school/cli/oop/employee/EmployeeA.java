package it.brian.school.cli.oop.employee;

public class EmployeeA extends Employee {
    private Integer sickDays;

    public EmployeeA(String serial, Float salary, Float overtime) {
        super(serial, salary, overtime);
        this.sickDays = 0;
    }

    public void takeSickDays(Integer amount) {
        this.sickDays += amount;
    }

    public Integer getSickDays() {
        return sickDays;
    }

    @Override
    public Float getActualSalary(Float overtimeHours) {
        return super.getActualSalary(overtimeHours) - (sickDays * 15);
    }
}
