package it.brian.school.cli.oop.employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                ------------------------------------
                              EMPLOYEE
                ------------------------------------"""
        );

        Employee employee = new Employee("00309", 1000f, 7.5f);
        employee.dump();
        System.out.println("Actual salary       : " + employee.getActualSalary(10f));


        System.out.println("""
                ------------------------------------
                             EMPLOYEE-A
                ------------------------------------"""
        );
        EmployeeA employeeA = new EmployeeA("00201", 1500f, 8.5f);
        employeeA.dump();
        System.out.println("Sick days           : " + employeeA.getSickDays());
        employeeA.takeSickDays(5);
        System.out.println("Sick days           : " + employeeA.getSickDays());
        System.out.println("Actual salary       : " + employee.getActualSalary(3f));
    }
}
