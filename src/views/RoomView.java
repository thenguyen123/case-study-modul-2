package views;

import model.Facility;
import model.Room;

import java.util.*;

public class RoomView {

    Room room;
    public void addRoom() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name of Room");
        String nameRoom = scanner.nextLine();

        System.out.println("enter area of Room");
        int areaRoom = Integer.parseInt(scanner.nextLine());
        System.out.println("enter prices of Room");
        double pricesRoom = Double.parseDouble(scanner.nextLine());
        System.out.println("enter amount of people in Room");
        int peopleRoom = Integer.parseInt(scanner.nextLine());
        System.out.println("enterType of rent of Room");
        String rentType = scanner.nextLine();
        System.out.println("enter free service of Room");
        String serviceRoom = scanner.nextLine();
        room = new Room(nameRoom, areaRoom, pricesRoom, peopleRoom, rentType, serviceRoom);

    }public Room room(){
        return room;
    }


}
