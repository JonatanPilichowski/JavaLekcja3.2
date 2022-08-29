package helpers;

import models.Company;

import static helpers.CreateNewEmployee.getEmployeeFromUser;
import static helpers.UserInputHelper.isValueInt;

public class Menu {
    public static void menu(Company company) {
        displayOptionsText();
        switch ( isValueInt() ) {
            default -> System.out.println("Wrong value. Only values 1-4 acceptable.\n");
            case 1 -> company.getSumOfSalaries();
            case 2 -> company.displayAllEmployeesData();
            case 3 -> company.addEmployee(getEmployeeFromUser());
            case 4 -> System.exit(0);
        }
    }

    private static void displayOptionsText() {
        System.out.println("Select menu value from 1 to 4:");
        System.out.println("1- Sum of salaries for all employees.");
        System.out.println("2- Get all the data about employees.");
        System.out.println("3- Add a new employee.");
        System.out.println("4- Exit.");
    }
}
