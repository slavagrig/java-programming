package Day51_inheritance_overriding;

public class Contractor extends Employee{
    @Override
    public String toString() {
        return "Contractor{}";
    }

    @Override
    public double calculateSalary(double hourlyRate){
        return 50 * 40 * hourlyRate;


    }
}
