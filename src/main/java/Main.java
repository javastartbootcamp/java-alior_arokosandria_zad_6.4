import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        File file = new File("employees.csv");
        employee.readEmployeesFile(file);

        if (file.exists()) {
            File stats = new File("stats.txt");
            stats.createNewFile();

            FileWriter fileWriter = new FileWriter(stats);
            fileWriter.write("Średnia wypłata: " + employee.averageSalary() + "\n");
            fileWriter.write("Minimalna wypłata: " + employee.minSalary() + "\n");
            fileWriter.write("Maksymalna wypłata: " + employee.maxSalary() + "\n");
            fileWriter.write("Liczba pracowników IT: " + employee.numberEmployees("IT") + "\n");
            fileWriter.write("Liczba pracowników Support: " + employee.numberEmployees("Support") + "\n");
            fileWriter.write("Liczba pracowników Management: " + employee.numberEmployees("Management") + "\n");
            fileWriter.close();
        }

    }
}
