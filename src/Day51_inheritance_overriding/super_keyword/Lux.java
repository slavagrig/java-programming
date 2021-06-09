package Day51_inheritance_overriding.super_keyword;

public class Lux extends Lyft {
    @Override
    public double calculateRate(double miles) {
        //calculate rate of Lyft + plus 20 percent
        return super.calculateRate(miles) * 1.2;
    }
}
