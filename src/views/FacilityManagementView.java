package views;

import controllers.FacilityServiceController;

import model.Room;
import model.Villa;

import java.util.Map;
import java.util.Scanner;

public class FacilityManagementView {
   private final FacilityServiceController facilityServiceController = new FacilityServiceController();
   private final RoomView roomView = new RoomView();
   private final VillaView villaView = new VillaView();

    public void facilityManagement() {
        int input=0;

        do {

            System.out.println("1. Display  list facility");
            System.out.println("2. Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your choose");
          try {
              input = Integer.parseInt(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println(e.getMessage());

          }
            switch (input) {
                case 1:

                    for (Map.Entry<Room, Integer> entry : facilityServiceController.toStringRoom().entrySet()) {
                        System.out.println(entry.getKey() + " use times " + entry.getValue());
                    }
                    for (Map.Entry<Villa, Integer> entry : facilityServiceController.toStringVilla().entrySet()) {
                        System.out.println(entry.getKey() + " use times " + entry.getValue());
                    }

                    break;
                case 2:

                    int option=0;
                    do {
                        System.out.println("1.Add new Room");
                        System.out.println("2.Add new Villa");
                        System.out.println("3. Back to menu");
                        System.out.println("enter your option");
                        try {
                            option = Integer.parseInt(scanner.nextLine());
                        }catch (NumberFormatException e){
                            System.out.println(e.getMessage());

                        }
                        switch (option) {
                            case 1:
                                for (Map.Entry<Room, Integer> entry : facilityServiceController.toStringRoom().entrySet()) {
                                    roomView.addRoom();
                                    if (roomView.getRoom1().equals(entry.getValue())) {
                                        System.out.println("the room  already in the list ");
                                    } else {
                                        facilityServiceController.addRoom(roomView.getRoom1());
                                    }
                                }
                                break;
                            case 2:
                                for (Map.Entry<Villa, Integer> entry : facilityServiceController.toStringVilla().entrySet()) {
                                    villaView.addVilla();
                                    if (villaView.getVilla().equals(entry.getKey())) {
                                        System.out.println("the room  already in the list ");
                                    } else {
                                        facilityServiceController.addVilla(villaView.getVilla());
                                    }
                                }

                                break;
                        }
                    } while (option != 3);

                    break;
                case 3:
                    System.out.println("Room have to facility management");
                    for (Map.Entry<Room, Integer> entry : facilityServiceController.toStringRoom().entrySet()) {
                        if (entry.getValue() > 5) {
                            System.out.println(" service " + entry.getKey() + " times " + entry.getValue());
                        }
                    }
                    System.out.println("Villa have to facility management");
                    for (Map.Entry<Villa, Integer> entry : facilityServiceController.toStringVilla().entrySet()) {
                        if (entry.getValue() > 5) {
                            System.out.println(" service " + entry.getKey() + " times " + entry.getValue());
                        }
                    }

                    break;
                case 4:
                    FuramaView.disPlayMainMenu();
                    break;

            }

        } while (input != 4);

    }
}