package model;

import java.util.Objects;

public class Villa extends Facility {

    private  String roomStandard;
    private  int areaPool;
    private int floor;
    public Villa(String name, int area,double prices, int people, String rentType) {
        super(name, area, prices, people, rentType);


    }

    public Villa(String name, int area,double prices, int people, String rentType,
                 String roomStandard, int areaPool, int floor) {
        super(name, area, prices, people, rentType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }public String csv(){
        return super.getName()+","+super.getArea()+","+super.getPrices()+","+super.getPeople()+","+super.getRentType()+","+
                this.roomStandard+","+this.areaPool+","+this.floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Villa villa = (Villa) o;
        return areaPool == villa.areaPool && floor == villa.floor && Objects.equals(roomStandard, villa.roomStandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomStandard, areaPool, floor);

    }
}
