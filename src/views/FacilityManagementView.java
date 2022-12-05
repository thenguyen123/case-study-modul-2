package views;

import controllers.FacilityServiceController;
import model.Facility;
import services.impl.FacilityServiceImpl;

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
                    for (Map.Entry<Facility, Integer> entry : facilityServiceController.addFacility().entrySet()) {
                        System.out.println(" service " + entry.getKey() + " times " + entry.getValue());
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
                                roomView.addRoom();
                                boolean flag = true;
                                for (Map.Entry<Facility, Integer> entry : facilityServiceController.addFacility().entrySet()) {
                                    if (roomView.room().equals(entry.getKey())) {
                                        flag = false;
                                    }
                                }
                                if (flag) {
                                    facilityServiceController.addFacility().put(roomView.room(), 2);
                                } else System.out.println(" the room already exists ");
                                break;
                            case 2:
                                villaView.addVilla();
                                boolean flagvilla = true;
                                for (Map.Entry<Facility, Integer> entry : facilityServiceController.addFacility().entrySet()) {
                                    if (villaView.villa().equals(entry.getKey())) {
                                        flagvilla = false;
                                    }
                                }
                                if (flagvilla) {
                                    facilityServiceController.addFacility().put(villaView.villa(), 6);
                                } else System.out.println(" the villa already exists ");

                                break;
                        }
                    } while (option != 3);

                    break;
                case 3:
                    for (Map.Entry<Facility, Integer> entry : facilityServiceController.addFacility().entrySet()) {
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