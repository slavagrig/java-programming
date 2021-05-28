package Day47_constructors;

public class Address {
    private String street; // incapsulation - hiding data,
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    //constructor
    public Address () {
        System.out.println("Address constructor");
        street = "123 Park Road Street";
        city = "Alexandria";
        state ="VA";
        zipCode = "22302";

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String toString() {
        return street +  ", " + city + ", " + state + " " + zipCode;
    }
    //updated


}
