import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Files {
    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> readEmployeesFile(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] elements = scanner.nextLine().split(";");
                employeeList.add(new Employee(elements[0], elements[1], elements[2], elements[3], parseDouble(elements[4])));

            }
        }
        return employeeList;
    }

}
