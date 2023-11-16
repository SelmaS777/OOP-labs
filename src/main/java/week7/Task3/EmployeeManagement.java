package week7.Task3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeManagementSystem managementSystem = new EmployeeManagementSystem();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Selma Salman", 100000.0));
        employees.add(new Employee(2, "Belma Balman", 50000.0));
        employees.add(new Employee(3, "Neko Nekić", 20000.0));
        employees.add(new Employee(4, "Random Random", 30000.0));

        double minSalary = 55000.0;
        List<Employee> filteredEmployees = managementSystem.filerEmployeeBySalary(employees, minSalary);

        double totalSalary = managementSystem.calculateTotalSalary(employees);

        System.out.println("Employees with salary greater than or equal to " + minSalary + " : ");
        managementSystem.displayEmployeeDetails(filteredEmployees);

        System.out.println("\nTotal salary of all employees: " + totalSalary);
    }
}
