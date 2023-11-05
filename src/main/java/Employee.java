
public class Employee {
    private String firstName;
    private String lastName;
    private String pesel;
    private String department;
    private double salary;

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

}
