package Day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity ("McLean");
        cybertekAddress.setState ("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("Cybertek school address: " + cybertekAddress.toString());
        cybertekAddress.setStreet ("7925 Jones Branch Dr Suite 3200");
        System.out.println ("street info = " + cybertekAddress.getStreet());
        System.out.println("Cybertek school address: " + cybertekAddress.toString());

        Address newAddress = new Address();
        System.out.println("newAddress = " + newAddress);


    }
}
