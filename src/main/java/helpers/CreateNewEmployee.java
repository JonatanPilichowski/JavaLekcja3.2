package helpers;

import models.Company;
import models.Employee;

import java.util.Scanner;

import static helpers.UserInputHelper.isValueInt;

public class CreateNewEmployee {

    public static Employee getEmployeeFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Provide last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Provide salary: ");
        int salary = isValueInt();
        return new Employee(firstName, lastName, salary);
    }

    public static void getNumberOfEmployeesFromUser(int numberOfEmployees, Company company) {
        for (int iterationNumber = 1; iterationNumber <= numberOfEmployees; iterationNumber++) {
            System.out.println("Provide data for " + iterationNumber + " employee out of " + numberOfEmployees + " employees.");
            company.addEmployee(getEmployeeFromUser());
        }
    }


}
