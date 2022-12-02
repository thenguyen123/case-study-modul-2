package model;

public abstract class Facility {

    private String name;
    private int area;
    private  String prices;
    private int people;
    private String rentType;


    public Facility() {
    }

    public Facility(String name, int area, String prices, int people, String rentType) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", prices='" + prices + '\'' +
                ", people=" + people +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
