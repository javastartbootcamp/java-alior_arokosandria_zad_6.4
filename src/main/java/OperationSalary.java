import java.util.List;

public class OperationSalary {

    public int numberEmployees(String department, List<Employee> employeeList) {
        int number = 0;
        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals(department)) {
                number++;
            }
        }
        return number;
    }

    public double averageSalary(List<Employee> employeeList) {
        double average = 0;
        for (Employee employee : employeeList) {
            average += employee.getSalary();
        }
        return average / employeeList.size();
    }

    public double maxSalary(List<Employee> employeeList) {
        double max = 0;
        for (Employee employee : employeeList) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public double minSalary(List<Employee> employeeList) {
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
