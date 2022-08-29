package salary;

import models.Company;

import static helpers.CreateNewEmployee.getNumberOfEmployeesFromUser;
import static helpers.Menu.menu;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        getNumberOfEmployeesFromUser(5, company);
        while (true) {
            menu(company);
        }
    }
}

