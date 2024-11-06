package models;

public class PermanentEmployee extends Employee {
    private double baseSalary;
    private int yearsOfService;

    public PermanentEmployee() {
    }

    public PermanentEmployee(String name, String department, double baseSalary, int yearsOfService) {
        super(name, department);
        this.baseSalary = baseSalary;
        this.yearsOfService = yearsOfService;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (yearsOfService * 100);
    }

    @Override
    public int calculateVacations(){
        return 20 + (yearsOfService * 2);
    }

    @Override
    public void showDetails() {
        System.out.println("Permanent employee: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Vacation days: " + calculateVacations());
    }
}
