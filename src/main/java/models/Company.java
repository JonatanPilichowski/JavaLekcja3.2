package models;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployeesData() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println("");
    }

    public void getSumOfSalaries() {
        int sum = 0;
        for (Employee employee : getEmployees()) {
            sum += employee.getSalary();
        }
        System.out.println("Sum of all salaries: " + sum + ".\n");
    }
}
