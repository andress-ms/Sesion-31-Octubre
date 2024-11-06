package models;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee() {
    }

    public ContractEmployee(String name, String department, double hourlyRate, int hoursWorked) {
        super(name, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public int calculateVacations(){
        return 10;
    }

    @Override
    public void showDetails() {
        System.out.println("Contract Employee: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Vacations: " + calculateVacations());
    }
}
