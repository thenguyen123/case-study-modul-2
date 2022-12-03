package model;

public class Customer extends Person{
    public Customer(String id, String name, String sex, String CMND,
                    String email, String type, String address) {
        super(id, name, sex, CMND, email, type, address);
    }

    @Override
    public String toString() {
        return "Customer{}"+super.toString();
    }
}
