import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Employee {
    private String firstName;
    private String lastName;
    private String pesel;
    private String department;
    private double salary;

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee() {
    }

    public Employee(String firstName, String lastName, String pesel, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int numberEmployees(String department) {
        int number = 0;
        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals(department)) {
                number++;
            }
        }
        return number;
    }

    public void readEmployeesFile(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] elements = scanner.nextLine().split(";");
                employeeList.add(new Employee(elements[0], elements[1], elements[2], elements[3], parseDouble(elements[4])));

            }
        }
    }

    public double averageSalary() {
        double average = 0;
        for (Employee employee : employeeList) {
            average += employee.getSalary();
        }
        return average / employeeList.size();
    }

    public double maxSalary() {
        double max = 0;
        for (Employee employee : employeeList) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public double minSalary() {
        double min = 0;
        for (Employee employee : employeeList) {
            min = employee.getSalary();
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        return min;
    }
}
