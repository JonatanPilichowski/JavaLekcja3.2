package Salary;

public class Employee {
    String firstName;
    String lastName;
    double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    public void getAllData() {
        System.out.println("Salary for " + firstName + " " + lastName + " is " + salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public double getSalary() {
        return salary;
    }

}
