package Salary;


import java.util.Scanner;

import static Salary.CreateNewEmployee.newEmployee;

public class Main {


    public static void main(String[] args) {
        Company company = new Company();

        for (int i=0;i<5; i++){
            company.employees.add(newEmployee());
        }

        while(true) {
            System.out.println("Select menu value: \n 1- Sum of existing \n 2- get all the data \n 3- add new employee \n 4- exit");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            switch (menu) {
                default:
                    System.out.println("Wrong value \n");
                    break;
                case 1:
                    double sum = 0;
                    for (Employee emp : company.employees) {
                        sum += emp.getSalary();
                    }
                    System.out.println("Sum of all salaries: " + sum + ".\n");
                    break;
                case 2:
                    for (Employee emp : company.employees) {
                        emp.getAllData();
                    }
                    break;
                case 3:
                    company.employees.add(newEmployee());
                    break;
                case 4:
                    System.exit(0);
            }
        }

        }



    }

