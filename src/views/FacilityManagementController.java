package views;

import java.util.Scanner;

public class FacilityManagementController {
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
            switch (input){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.disPlayMainMenu();
                    break;

            }

        } while (input!=4);

    }
}