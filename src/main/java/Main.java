import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("employees.csv");
        Files files = new Files();
        List<Employee> employeeList = files.readEmployeesFile(file);

        if (file.exists()) {
            File stats = new File("stats.txt");
            stats.createNewFile();
            OperationSalary operationSalary = new OperationSalary();
            FileWriter fileWriter = new FileWriter(stats);
            fileWriter.write("Średnia wypłata: " + operationSalary.averageSalary(employeeList) + "\n");
            fileWriter.write("Minimalna wypłata: " + operationSalary.minSalary(employeeList) + "\n");
            fileWriter.write("Maksymalna wypłata: " + operationSalary.maxSalary(employeeList) + "\n");
            fileWriter.write("Liczba pracowników IT: " + operationSalary.numberEmployees("IT", employeeList) + "\n");
            fileWriter.write("Liczba pracowników Support: " + operationSalary.numberEmployees("Support", employeeList) + "\n");
            fileWriter.write("Liczba pracowników Management: " + operationSalary.numberEmployees("Management", employeeList) + "\n");
            fileWriter.close();
        }

    }
}
