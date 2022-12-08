package model;

import java.util.Objects;

public abstract class Facility {

    private String name;
    private int area;
    private  int prices;
    private int people;
    private String rentType;


     Facility() {
    }

   Facility(String name, int area, int  prices, int people, String rentType) {
this.name=name;
this.area=area;
this.prices=prices;
this.people=people;
this.rentType=rentType;
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

    public int  getPrices() {
        return prices;
    }

    public void setPrices(int  prices) {
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
        return "name='" + name + '\'' +
                ", area=" + area +
                ", prices='" + prices + '\'' +
                ", people=" + people +
                ", rentType='" + rentType
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return area == facility.area && prices==facility.area&& people == facility.people
                && Objects.equals(name, facility.name) && Objects.equals(rentType, facility.rentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area, prices, people, rentType);
    }
}


