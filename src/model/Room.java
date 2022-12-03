package model;

public class Room extends Facility {
    private String serviceFree;

    public Room(String name, int area, String prices, int people, String rentType, String serviceFree) {
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
}
