package week7.Task3;
import java.util.ArrayList;
import java.util.List;

public record Employee(int id, String name, double salary) {
}

class EmployeeManagementSystem{
    public List<Employee> filerEmployeeBySalary(List<Employee> employees, double minSalary){
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees){
            if (employee.salary() >= minSalary){
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    public double calculateTotalSalary(List<Employee> employees){
        return employees.stream()
                .mapToDouble(Employee::salary)
                .sum();
    }

    public void displayEmployeeDetails(List<Employee> employees){
        for (Employee employee : employees){
            System.out.println("ID: " + employee.id() + ", Name: " + employee.name() + ", Salary: " + employee.salary());
        }
    }
}

