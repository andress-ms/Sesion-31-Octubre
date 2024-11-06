package models;

import java.util.ArrayList;

public class Company2 {
    private ArrayList<Employee> employees;

    public Company2() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployeeDetails(){
        for (Employee employee : employees) {
            employee.showDetails();
            System.out.println("-------");
        }
    }
}
