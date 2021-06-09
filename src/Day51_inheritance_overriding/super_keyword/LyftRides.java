package Day51_inheritance_overriding.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXl lyftXlRide = new LyftXl();
        Lux luxRide = new Lux();

        System.out.println("lyftRide = " + lyftRide.calculateRate(5));
        System.out.println("lyftXlRide = " + lyftXlRide.calculateRate(5));
        System.out.println("luxRide = " + luxRide.calculateRate(5));
        
    }
}
