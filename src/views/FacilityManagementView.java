package views;

import controllers.FacilityServiceController;

import model.Room;
import model.Villa;
import java.util.Map;
import java.util.Scanner;

public class FacilityManagementView {
    FacilityServiceController facilityServiceController = new FacilityServiceController();
    RoomView roomView = new RoomView();
    VillaView villaView = new VillaView();

    public void facilityManagement() {
        int input;

        do {

            System.out.println("1. Display  list facility");
            System.out.println("2. Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your choose");
            input = Integer.parseInt(scanner.nextLine());
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

                    int option;
                    do {
                        System.out.println("1.Add new Room");
                        System.out.println("2.Add new Villa");
                        System.out.println("3. Back to menu");
                        System.out.println("enter your option");
                        option = Integer.parseInt(scanner.nextLine());
                        switch (option) {
                            case 1:
                                for (Map.Entry<Room, Integer> entry : facilityServiceController.toStringRoom().entrySet()) {
                                    roomView.addRoom();
                                    if (roomView.room().equals(entry.getValue())) {
                                        System.out.println("the room  already in the list ");
                                    } else {
                                        facilityServiceController.addRoom(roomView.room());
                                    }
                                }
                                break;
                            case 2:
                                for (Map.Entry<Villa, Integer> entry : facilityServiceController.toStringVilla().entrySet()) {
                                    villaView.addVilla();
                                    if (villaView.villa().equals(entry.getKey())) {
                                        System.out.println("the room  already in the list ");
                                    } else {
                                        facilityServiceController.addVilla(villaView.villa());
                                    }
                                }

                                break;
                        }
                    } while (option != 3);

                    break;
                case 3:
                    for (Map.Entry<Room, Integer> entry : facilityServiceController.toStringRoom().entrySet()) {
                        if (entry.getValue() > 5) {
                            System.out.println(" service " + entry.getKey() + " times " + entry.getValue());
                        }
                    }
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