package model;

public abstract class Person {

    private String id;
    private  String name;
    private  String Sex;
    private  String CMND;
    private String email;
    private String type;
    private String address;

    public Person(String id, String name, String sex, String CMND, String email, String type, String address) {
        this.id = id;
        this.name = name;
        Sex = sex;
        this.CMND = CMND;
        this.email = email;
        this.type = type;
        this.address = address;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", CMND='" + CMND + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

