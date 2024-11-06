package models;

import interfaces.Benefits;

abstract class Employee implements Benefits {
    protected String name;
    protected String department;

    public Employee() {
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public abstract double calculateSalary();

    public abstract void showDetails();

    @Override
    public int calculateVacations() {
        return 0;
    }
}
