package Day48_constructors;

public class Customer {
    private String name;
    private int id;

    public Customer () {
        System.out.println("No-args constructor");
    }

    // add a constructor with params
    public Customer (String name, int id) {
        System.out.println("2 args constructor");
        this.name = name; // or setName(name);
        this.id = id; // or setId(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
