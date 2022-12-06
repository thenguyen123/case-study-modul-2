package model;

public class Employee extends Person {
    private long salary;

    public Employee(String id, String name, String dayOfBirth, String sex, String CMND, String email,
                    String type, String address, long salary) {
        super(id, name, dayOfBirth, sex, CMND, email, type, address);
        this.salary = salary;
    }



    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "salary=" + salary +
                '}';
    }public String csv(){
        return super.getId()+","+super.getName()+","+super.getDayOfBirth()+","+super.getSex()+","+super.getCMND()+","+
                super.getEmail()+","+super.getType()+","+super.getAddress()+","+this.salary;
    }
}
