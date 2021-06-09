package Day51_inheritance_overriding;

public class Employee {

    String jobtitle;

    public double calculateSalary (double hourlyRate) {
        return 52 * 40 * hourlyRate * 1.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobtitle='" + jobtitle + '\'' +
                '}';
    }
}
