package Day48_constructors;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString()); // print with default values that are set in no args constructor
        cs1.setId(1);
        cs1.setName ("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer ("Mike", 2);
        System.out.println(cs2);

        Customer cs3 = new Customer ("John Ward III", 4873);
        System.out.println(cs3);

        //array of customers
        Customer [] todaysCustomer = {cs1, cs2, cs3, new Customer ("Bashir", 449)};

        //ArrayList of Customer Objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir",449));
        customerList.add(new Customer("Suleyman", 9763));

        System.out.println(todaysCustomer[0].toString());

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        for (Customer each : customerList) {
            System.out.println(each);
        }


    }
}
