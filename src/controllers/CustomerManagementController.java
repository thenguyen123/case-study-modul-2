package controllers;

import java.util.Scanner;

public class CustomerManagementController {


    public  void customerManagement() {
        int input;
        do{
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customers");
        System.out.println("3.Edit customer");
        System.out.println("4. Return main menu");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your choose");
       input =Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                FuramaController.disPlayMainMenu();
                break;
        }
        }while (input!=4);
    }
}