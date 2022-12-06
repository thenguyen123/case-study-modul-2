package model;

public class Customer extends Person{
    public Customer(String id, String name, String dayOfBirth, String sex, String CMND,
                    String email, String type, String address) {
        super(id, name, dayOfBirth, sex, CMND, email, type, address);
    }

    @Override
    public String toString() {
        return "Customer{}"+super.toString();
    }
public String csv(){
    return super.getId()+","+super.getName()+","+super.getDayOfBirth()+","+super.getSex()+","+super.getCMND()+","+
            super.getEmail()+","+super.getType()+","+super.getAddress();
}
}