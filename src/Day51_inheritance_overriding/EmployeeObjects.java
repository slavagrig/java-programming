package Day51_inheritance_overriding;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobtitle = "Java Developer";
        System.out.println("developer " + developer.calculateSalary(55.00));
        double annualDevSalary = developer.calculateSalary(60.0);
        System.out.println("Math.round(annualDevSalary) = " + Math.round(annualDevSalary));

        Contractor sdetContractor = new Contractor();
        sdetContractor.jobtitle = "SDET";
        double sdetSalary = sdetContractor.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor);

    }
}
