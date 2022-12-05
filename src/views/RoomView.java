package views;

import model.Room;
import services.exception.*;
import services.exception.Exception;

import java.util.*;

public class RoomView {

    Room room;
    public void addRoom() {

        Scanner scanner = new Scanner(System.in);
        String nameRoom="";
        int areaRoom;
        double pricesRoom;
        int peopleRoom;
        do {
         try {
            System.out.println("enter name of Room");
            nameRoom = scanner.nextLine();
            RegexName regexID = new RegexName();
            regexID.regexId(nameRoom);
            break;
            }catch (Exception e){
             System.out.println(e.getMessage());
        }
        }while (true);

        do {
            try {
                System.out.println("enter area of Room");
                areaRoom= Integer.parseInt(scanner.nextLine());
                ExceptionArea.area(areaRoom);
                break;
            } catch (Exception |NumberFormatException  e) {
                System.out.println(e.getMessage());
            }
        }while (true);
       do {
           try{
               System.out.println("enter prices of Room");
               pricesRoom = Double.parseDouble(scanner.nextLine());
               ExceptionPrices.prices(pricesRoom);
               break;
           }catch (Exception |NumberFormatException  e){
               System.out.println(e.getMessage());
           }
       }while (true);
        do {
            try{
                System.out.println("enter amount of people in Room");
                 peopleRoom = Integer.parseInt(scanner.nextLine());
                ExceptionPeople.people(peopleRoom);
                break;
            }catch (Exception |NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while (true);



        System.out.println("enterType of rent of Room");
        String rentType = scanner.nextLine();
        System.out.println("enter free service of Room");
        String serviceRoom = scanner.nextLine();
        room = new Room(nameRoom, areaRoom, pricesRoom, peopleRoom, rentType, serviceRoom);

    }public Room room(){
        return room;
    }


}
