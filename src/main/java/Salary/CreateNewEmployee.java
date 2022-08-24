package Salary;

import java.util.Scanner;

public class CreateNewEmployee {

    public static Employee newEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Provide last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Provide salary: ");
        int salary = scanner.nextInt();
        return new Employee(firstName, lastName, salary);
    }
}
