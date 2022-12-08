package views;

import model.Room;
import services.exception.*;
import services.exception.Exception;
import utils.Write.WriteFileRoom;

import java.util.*;

public class RoomView {
public static final String FILEROOM="src/data/room.csv";
    Room room;
    public void addRoom() {

        Scanner scanner = new Scanner(System.in);
        String nameRoom="";
        int areaRoom;
        int  pricesRoom;
        int peopleRoom;
        do {
         try {
            System.out.println("enter name of Room");
            nameRoom = scanner.nextLine();
            ExceptionAndRegexName regexID = new ExceptionAndRegexName();
            regexID.regexId(nameRoom);
            break;
            }catch (Exception e){
             System.err.println(e.getMessage());
        }
        }while (true);

        do {
            try {
                System.out.println("enter area of Room");
                areaRoom= Integer.parseInt(scanner.nextLine());
                ExceptionArea.area(areaRoom);
                break;
            } catch (Exception |NumberFormatException  e) {
                System.err.println(e.getMessage());
            }
        }while (true);
       do {
           try{
               System.out.println("enter prices of Room");
               pricesRoom = Integer.parseInt(scanner.nextLine());
               ExceptionPrices.prices(pricesRoom);
               break;
           }catch (Exception |NumberFormatException  e){
               System.err.println(e.getMessage());
           }
       }while (true);
        do {
            try{
                System.out.println("enter amount of people in Room");
                 peopleRoom = Integer.parseInt(scanner.nextLine());
                ExceptionPeople.people(peopleRoom);
                break;
            }catch (Exception |NumberFormatException e){
                System.err.println(e.getMessage());
            }
        }while (true);



        System.out.println("enterType of rent of Room");
        String rentType = scanner.nextLine();
        System.out.println("enter free service of Room");
        String serviceRoom = scanner.nextLine();
        room = new Room(nameRoom, areaRoom, pricesRoom, peopleRoom, rentType, serviceRoom);

    }public Room getRoom1(){
        return room;
    }


}
