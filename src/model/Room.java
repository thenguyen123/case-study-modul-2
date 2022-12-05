package model;

import java.util.Objects;

public class Room extends Facility {
    private String serviceFree;

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String name, int area, double prices, int people, String rentType, String serviceFree) {
        super(name, area, prices, people, rentType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return Objects.equals(serviceFree, room.serviceFree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), serviceFree);
    }
}
